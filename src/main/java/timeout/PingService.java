package timeout;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

@Service
public class PingService {

    private OkHttpClient okHttpClient;

    public PingService() {
        okHttpClient = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
    }

    public String pingDevTalks() {
        try {
            okHttpClient.newCall(new Request.Builder()
                    .url("https://devtalks.ro/")
                    .get()
                    .build())
                    .execute();
            return "Ping to DevTalks OK";
        } catch (IOException ex) {
            return "Resource is offline";
        }
    }
}