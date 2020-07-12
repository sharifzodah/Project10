package Part1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadMe{

    /*
        1) Navigate to  http://demoqa.com/text-box

        2) Enter full name as "Automation"

        3) Enter Email as "Testing@gmail.com"

        4) Enter Current Address 1 as "Testing Current Address part 1"

        5) Enter Current Address 2 "Testing Current Address part 2"

        6) Click on submit button

        7) Print the name

        8) Print Email is containing the "Testing"

     */
    //1
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\Selenium dependency\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demoqa.com/text-box");

        //2
        driver.findElement(By.id("userName")).sendKeys("Automation");

        //3
        driver.findElement(By.id("userEmail")).sendKeys("Testing@gmail.com");

        //4 Testing Current Address part 1
        driver.findElement(By.id("currentAddress")).sendKeys("Testing Current Address part 1");

        //5 Testing Current Address part 2
        driver.findElement(By.id("permanentAddress")).sendKeys("Testing Current Address part 2");

        //6
        Thread.sleep(5000); // I used Thread because I got this exception:ElementClickInterceptedException
        driver.findElement(By.id("submit")).click();

        //7
        System.out.println(driver.findElement(By.id("name")).getText());

        //8
        System.out.println(driver.findElement(By.id("email")).getText());

        driver.close();
    }
}
