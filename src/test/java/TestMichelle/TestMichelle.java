package TestMichelle;

        import org.junit.After;
        import org.junit.jupiter.api.AfterEach;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import java.util.concurrent.TimeUnit;


public class TestMichelle {

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
    public void wishlist() {
        // primero nos loggeamos
        elemento= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
        elemento.click();
        elemento=  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        elemento.click();
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("adad@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();

        //nos pasamos a la pagina de inicio

        elemento = driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a"));
        elemento.click();

        // luego, agregamos un item al wishlist
        elemento = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]/button[2]"));
        elemento.click();
        // Agregamos un segundo item al wishlist
        elemento = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[3]/div/div[3]/button[2]"));
        elemento.click();

        elemento = driver.findElement(By.xpath("//*[@id=\"wishlist-total\"]/span"));
        elemento.click();

        elemento = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[1]/td[6]/button"));
        elemento.click();

        elemento = driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/table/tbody/tr[2]/td[6]/a"));
        elemento.click();

        elemento = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[4]/a/span"));
        elemento.click();
    }

}
