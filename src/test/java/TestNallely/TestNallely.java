package TestNallely;

import org.junit.After;
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
        elemento= driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
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
        driver.findElement(By.xpath("//*[@id=\"input-payment-firstname\"]")).sendKeys("Nallely");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-lastname\"]")).sendKeys("Alfaro");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-email\"]")).sendKeys("nallelyalfaro02@mail.com");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-telephone\"]")).sendKeys("123456789");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-address-1\"]")).sendKeys("Calle de la paz");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-city\"]")).sendKeys("Madrid");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]")).sendKeys("28001");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]")).sendKeys("Spain");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]")).sendKeys("Madrid");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]/option[6]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"button-guest\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"collapse-shipping-method\"]/div/p[4]/textarea")).sendKeys("Test");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.cssSelector("#collapse-payment-method > div > div.buttons > div > input[type=checkbox]:nth-child(2)")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"button-payment-method\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"button-confirm\"]")).click();
    }

    @After
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        driver.quit();
    }

}
