package Part2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe {

    /*
        1) Navigate to https://demo.applitools.com/

        2) Enter the username as "ttechno@gmail.com"

        3) Enter the password as "techno123."

        4) Click on sign in button

        5) Get the following text and print it -->  Your nearest branch closes in: 30m 5s is displayed

        6) Print the URL
     */

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
        WebDriver driver2 = new ChromeDriver();
        driver2.manage().window().maximize();
        driver2.get("https://demo.applitools.com/");

        //2 log-in
        driver2.findElement(By.id("username")).sendKeys("ttechno@gmail.com");
        //3
        driver2.findElement(By.id("password")).sendKeys("techno123.");
        //4
        driver2.findElement(By.id("log-in")).click();
        //5
        System.out.println(driver2.findElement(By.id("time")).getText());;
        //6
        System.out.println(driver2.getCurrentUrl());

        driver2.close();
    }
}
