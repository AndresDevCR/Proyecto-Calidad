package TestsAndres;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestAndres {

    private WebDriver driver;
    private WebElement elemento;

    @BeforeEach

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://opencart.abstracta.us/");

    }

    @Test
    public void test() {
        //click sobre el search field
        elemento = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        // buscar el elemento y hacer click
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        elemento.sendKeys("Macbook");
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
          //click sobre el primer producto
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/div/div[2]/div[2]/button[1]")).click();

    }


    @AfterEach
    public void tearDown() {
        driver.quit();
    }


}
