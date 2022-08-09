/*
Parte de Mario Molina
TC ID: 6
Verificar que el sistema actualice correctamente el tipo de moneda
 */
package TestMario;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class testMario {

    private WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        testMario test = new testMario();
        test.abrirChrome();
        //test.Login(); //Realizar el mismo test pero iniciando sesión con una cuenta ***MISMO RESULTADO***
        test.recorridoTest();
        test.tearDown();
    }

    @BeforeEach

    public void abrirChrome() {
        System.out.println("Iniciamos Prueba de tipos de moneda!");
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\chromeDriver\\chromedriver.exe"); //Ruta del ChromeDriver en el proyecto
        driver = new ChromeDriver();
        driver.manage().window().maximize(); //Maximizar la ventana que se abre.
        driver.get("http://opencart.abstracta.us/"); //Ruta para abrir la página.
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Función no me sirvió
    }

    @Test
    public void Login() throws InterruptedException { //Mismo código del login realizado en el TestAndres
        WebElement barra = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
        barra.click();
        Thread.sleep(5000);
        WebElement registro = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
        registro.click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("adad@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        Thread.sleep(2000);        
        assert driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).isDisplayed();
    }

    //Se realiza el Test para verificar que los cambios de moneda se hagan correctamente.
    @Test
    public void recorridoTest() throws InterruptedException {
        //Abre la opción de desktops ubicada en la barra de tareas (color celeste)
        Thread.sleep(5000);
        WebElement desktops = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'][normalize-space()='Desktops'])[1]"));
        desktops.click();

        //Da click en la opción de ventas de "Mac", la cual permitirá ver si verdaderamente se cambian los tipos de monedas
        Thread.sleep(5000);
        WebElement mac = driver.findElement(By.linkText("Mac (1)"));
        mac.click();

        //Baja el scroll para ver cuanto precio tiene la Mac (inicialmente en dolares)
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,300)");

        //Se copia el valor en dolares en la variable "dolar" para al final realizar una comparación entre el tipo de monedas
        Thread.sleep(5000);
        String dolar = driver.findElement(By.xpath("(//p[@class='price'])[1]")).getText();
        System.out.println(dolar);

        //Se abre la opción para cambiar el tipo de moneda
        Thread.sleep(5000);
        WebElement currency = driver.findElement(By.className("btn-group"));
        currency.click();

        //Se cambia la opción a Euros y se repiten los pasos
        Thread.sleep(5000);
        WebElement monedaEuro = driver.findElement(By.xpath("(//button[contains(text(),'€ Euro')])[1]"));
        monedaEuro.click();

        //Baja el scroll para ver cuanto precio tiene la Mac (ahora en Euros)
        Thread.sleep(2000);
        JavascriptExecutor jseuro = (JavascriptExecutor) driver;
        jseuro.executeScript("window.scroll(0,300)");

        //Se copia el valor en Euros en la variable "euro"
        Thread.sleep(5000);
        String euro = driver.findElement(By.xpath("(//p[@class='price'])[1]")).getText();
        System.out.println(euro);

        //Se abre la opción para cambiar el tipo de moneda
        Thread.sleep(5000);
        WebElement currencyLibra = driver.findElement(By.className("btn-group"));
        currencyLibra.click();

        //Se cambia la opción a Libras Esterlinas
        Thread.sleep(5000);
        WebElement monedaLibra = driver.findElement(By.xpath("(//button[normalize-space()='£ Pound Sterling'])[1]"));
        monedaLibra.click();

        //Baja el scroll para ver cuanto precio tiene la Mac (ahora en Libras Esterlinas)
        Thread.sleep(2000);
        JavascriptExecutor jslibra = (JavascriptExecutor) driver;
        jslibra.executeScript("window.scroll(0,300)");

        //Se copia el valor en Libras Esterlinas en la variable "libra"
        Thread.sleep(5000);
        String libra = driver.findElement(By.xpath("(//p[@class='price'])[1]")).getText();
        System.out.println(libra);

        JOptionPane.showMessageDialog(null, "Mostrar datos de tipo de moneda:\n"
                + "\nDolar:\n" + dolar
                + "\n\nEuro:\n" + euro
                + "\n\nLibra Esterlina:\n" + libra); //Esto es solo para verificar resultado
    }

    @AfterEach
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
