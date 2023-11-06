package Exaple1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasicTest {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://facebook.com");
        System.out.println(driver.getTitle());

        driver.close();
        //driver.quit();
    }
}
