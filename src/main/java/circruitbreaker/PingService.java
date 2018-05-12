package circruitbreaker;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PingService {

    private OkHttpClient okHttpClient;

    public PingService() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    @HystrixCommand(defaultFallback = "pingFallback")
    public String pingDevTalks() throws IOException {
        okHttpClient.newCall(new Request.Builder()
                .url("https://devtalks.ro/")
                .get()
                .build())
                .execute();

        return "Ping to DevTalks OK";
    }

    private String pingFallback() {
        return "Resource is offline";
    }
}