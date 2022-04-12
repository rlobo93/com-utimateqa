package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome {

    public static void main(String[] args) {

        String Url = "https://courses.ultimateqa.com/collections";

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current Url" + driver.getCurrentUrl());
        System.out.println("Page Resource: "+driver.getPageSource());

        String login = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(login);
        System.out.println("page login" + login);


        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("rlobo@gmail.com");

        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("Pass123?");
        driver.close();


    }


}
