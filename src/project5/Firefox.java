package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Firefox {

    public static void main(String[] args) {

        String Url = "https://courses.ultimateqa.com/collections";

        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(Url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        String title = driver.getTitle();
        System.out.println(title);
        System.out.println("Current Url"+ driver.getCurrentUrl());


        String login = "https://courses.ultimateqa.com/users/sign_in";
        driver.navigate().to(login);
        System.out.println("page source"+login);
        System.out.println("Page login: "+driver.getPageSource());


        WebElement emailfield = driver.findElement(By.id("user[email]"));
        emailfield.sendKeys("rlobo@gmail.com");

        WebElement passwordfield = driver.findElement(By.name("user[password]"));
        passwordfield.sendKeys("Pass123?");
        driver.close();



    }

}
