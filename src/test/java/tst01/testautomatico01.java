/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tst01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testautomatico01 {

    private WebDriver driver;

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromeDriver\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

    }

    public void test(){
        WebElement elemento=driver.findElement(By.name("q"));
        elemento.clear();
        elemento.sendKeys("quality assurance");
        elemento.submit();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        assertEquals("Quality Assurance - Google Search", driver.getTitle());
    }

    public void tearDown() {
        driver.quit();
    }

    public static void main(String[] args) {
        testautomatico01 test=new testautomatico01();
        test.setup();
        test.test();
        test.tearDown();
    }

}
