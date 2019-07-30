package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main {

    public static void main( String[] args)   {

      //  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("http://google.com/ncr");

        webDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys("selenium");
        webDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input")).sendKeys(Keys.RETURN);

        webDriver.findElement(By.partialLinkText("Selenium - Web Browser Automation"));
        System.out.println (("Найдена страница: 'Selenium - Web Browser Automation' которая ведет на страницу сайта seleniumhq.org"));

        webDriver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[2]/a")).click();

        webDriver.findElement(By.partialLinkText("GitHub - SeleniumHQ/selen"));
        System.out.println (("Найдена картинка: 'SeleniumHQ' которая относится к сайту seleniumhq.org"));

        webDriver.findElement(By.xpath("//*[@id=\"hdtb-msb-vis\"]/div[1]/a")).click();
        webDriver.findElement(By.partialLinkText("Selenium - Web Browser Automation"));
        System.out.println (("Проверка страницы: 'Selenium - Web Browser Automation' которая ведет на страницу сайта seleniumhq.org"));

        webDriver.quit();
    }

}
