package resolver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public void start(){
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.facebook.com");


        String source = driver.getPageSource();

        System.out.println();

    }
}
