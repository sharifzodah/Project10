package Part4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class part4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
        WebDriver driver4 = new ChromeDriver();
        driver4.manage().window().maximize();
        driver4.get("http://demoqa.com/checkbox");

        driver4.findElement(By.className("rct-title['Home']")).click();
    }
}
