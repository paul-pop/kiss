package naming;

import java.util.ArrayList;
import java.util.List;

public class Naming {

    public void iLikeBigNamesAndICannotLie() {
        // Look at the type, it's right there, it's a list :-)
        List<String> namesList = new ArrayList<>();
        List<String> listOfNames = new ArrayList<>();
        List<String> allNames = new ArrayList<>();
        List<String> someNames = new ArrayList<>();
        List<String> noNames = new ArrayList<>();

        // KISS, just use plurals
        List<String> names = new ArrayList<>();

        // Thanks Java 10 ¯\_(ツ)_/¯
        var names = new ArrayList<String>();
    }

}
