package TestsAndres;

import org.junit.After;
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
    public void Register() {
        // se ingresa a la pagina de registro
        elemento = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
        elemento.click();
        elemento = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a"));
        elemento.click();
        // se ingresa los datos del usuario
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Andres");
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Garcia");
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("adad@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("123456789");
        elemento = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[1]"));
        elemento.click();
        // se verifica que el usuario se registro correctamente
        driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).click();
        assert driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]")).isDisplayed();
    }

    @Test
    public void Login(){
        // se ingresa a la pagina de login
        elemento= driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
        elemento.click();
        elemento=  driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        elemento.click();
        // se ingresa los datos del usuario
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("adad@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        // se verifica que el usuario se logueo correctamente
        assert driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).isDisplayed();
    }

    @Test
    public void testSerchbarAndShop() {
        // busca el articulo y hace la peticion de busqueda
        driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Macbook");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"search\"]/span/button")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

        // selecciona el articulo y hace la peticion de agregar al carrito

        // entra al primer producto y lo compra
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div[2]/div[1]/h4/a")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

        // selecciona la opcion de comprar
        driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).clear();
        driver.findElement(By.xpath("//*[@id=\"input-quantity\"]")).sendKeys("100");
        driver.findElement(By.xpath("//*[@id=\"button-cart\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);


        // muestra el carrito de compras

        elemento= driver.findElement(By.xpath("//*[@id=\"product-product\"]/div[1]/a[2]"));
        elemento.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);

        // Continua comprando
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]/div[1]/a")) .click();




    }

    @After
    public void tearDown() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        driver.close();
        driver.quit();
    }

}
