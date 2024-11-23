package testcase;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class readfile {

    public static void main(String[] args) throws IOException {
        Properties p;
        try (FileReader FR = new FileReader("properties")) {
            p = new Properties();
            p.load(FR);
        }
        System.out.println(p.getProperty("brower"));
        System.out.println(p.getProperty("testurl"));
    }
}
