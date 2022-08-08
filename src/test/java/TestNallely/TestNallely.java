package TestNallely;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class TestNallely {

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
      driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[4]/div/div[1]/a/img")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
      driver.findElement(By.xpath("//*[@id=\"input-option226\"]")).click();
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
      driver.findElement(By.xpath("//*[@id=\"input-option226\"]/option[2]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
      driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]/strong")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[2]/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"collapse-checkout-option\"]/div/div/div[1]/div[2]/label")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"button-account\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-firstname\"]")).click();
        elemento.sendKeys("Nallely");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-lastname\"]")).click();
        elemento.sendKeys("Alfaro");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-email\"]")).click();
        elemento.sendKeys("nallelyalfaro02@mail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);



    }


}
