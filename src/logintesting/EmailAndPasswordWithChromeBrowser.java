package logintesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAndPasswordWithChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //launch URL method
        driver.get(baseUrl);
        //print currentUrl
        System.out.println("Current Url = "+ driver.getCurrentUrl());
        //get the title of browser
        String title = driver.getTitle();
        System.out.println("my title is = "+title);
        //find the email field element
        WebElement emailField = driver.findElement(By.id("txtUsername"));
        //sending email to email field elements
        emailField.sendKeys("abc1234@gmail.com");
        //find the password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        //sending password to password field elements
        passwordField.sendKeys("abcd1234");
        //print the page source
        System.out.println(driver.getPageSource());
        //close the browser
        driver.close();
    }
}
