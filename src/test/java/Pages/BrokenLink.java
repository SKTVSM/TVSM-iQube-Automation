package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLink {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://www.deadlinkcity.com/");

        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total number of links = "+ links.size());

        int Numberofbrokenlink= 0;

        for( WebElement linkelement:links){

            String href = linkelement.getAttribute("href");

            if(href==null||href.isEmpty()){
                System.out.println("href value is null or empty so not possible to check ");
                continue;

            }
            try {
                //hit URL to serve
                URL linkURL = new URL(href); //converting string url in URL format

                HttpURLConnection conlinkURL = (HttpURLConnection) linkURL.openConnection(); //open a server connection
                conlinkURL.connect();// connect to server and send request

                if (conlinkURL.getResponseCode() >= 400) {
                    System.out.println(href + "-------> Broken links");
                    Numberofbrokenlink++;

                } else System.out.println("not Btoken Links");

            }
            catch (Exception e){

            }


        }

        System.out.println("Number of Broken links = "+Numberofbrokenlink);


    }
}
