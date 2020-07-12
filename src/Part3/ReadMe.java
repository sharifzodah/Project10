package Part3;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.annotation.processing.SupportedSourceVersion;

public class ReadMe {

    /*
        1) Navigate to https://www.snapdeal.com/

        2) Search for teddy bear click on search button

        3) Print the following text -->> We've got .... results for 'teddy bear'

        4) Print the URL

        5) Click on logo snepdeal logo

        6) Print the URL

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
        WebDriver driver3 = new ChromeDriver();
        driver3.manage().window().maximize();
        driver3.get("https://www.snapdeal.com/");

        //2
        driver3.findElement(By.id("inputValEnter")).sendKeys("teddy bear");
        driver3.findElement(By.className("searchTextSpan")).click();
        //3
        System.out.println(driver3.findElement(By.className("search-result-txt-section")).getText());
        //4
        System.out.println(driver3.getCurrentUrl());
        //5
        driver3.findElement(By.className("notIeLogoHeader")).click();
        //6
        System.out.println(driver3.getCurrentUrl());

        driver3.close();
    }

}
