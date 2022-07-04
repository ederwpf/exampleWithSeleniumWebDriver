import java.time.Duration;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;

/**
 * firstTestJava
 */
public class firstTestJavaFirefox {
    @Test
    public void testFazerLoginSozinho(){        
        System.setProperty("webDriver.firefox.driver","C:\\Users\\ederw\\Documents\\QA\\GeckoDriver\\geckodriver-v0.31.0-win64\\geckodriver.exe");
        System.setProperty("webdriver.firefox.whitelistedIps", "");
        
        WebDriver navegador = new FirefoxDriver();
        navegador.manage().window().fullscreen();
        navegador.get("http://automationpractice.com/index.php");                
        new WebDriverWait(navegador, Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.id("search_query_top")));
        navegador.findElement(By.className("login")).click();
        //navegador.findElement(By.linkText("Sign in")).click(); 
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("authentication")));
        navegador.findElement(By.id("email_create")).sendKeys("teste2706@teste.com.br");
        navegador.findElement(By.id("SubmitCreate")).click();
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("id_gender1")));
        navegador.findElement(By.id("id_gender1")).click();
        navegador.findElement(By.id("customer_firstname")).sendKeys("John");
        navegador.findElement(By.id("customer_lastname")).sendKeys("Maquetetas");
        navegador.findElement(By.id("passwd")).sendKeys("Maquetas123456");

        WebElement selectElementDay = navegador.findElement(By.id("days"));
        WebElement selectElementMonth = navegador.findElement(By.id("months"));
        WebElement selectElementYear = navegador.findElement(By.id("years"));

        Select selectDay = new Select(selectElementDay);
        Select selectMonth = new Select(selectElementMonth);
        Select selectYear = new Select(selectElementYear);

        selectDay.selectByValue("10");
        selectMonth.selectByIndex(11);
        selectYear.selectByValue("1988");

        navegador.findElement(By.id("company")).sendKeys("CompanyTest");
        navegador.findElement(By.id("address1")).sendKeys("Street test");
        navegador.findElement(By.id("city")).sendKeys("Curitiba");

        WebElement selectElementState = navegador.findElement(By.id("id_state"));
        Select selectState = new Select(selectElementState);
        selectState.selectByIndex(1);
        
        navegador.findElement(By.id("postcode")).sendKeys("82700");
        navegador.findElement(By.id("phone")).sendKeys("8888-8888");
        navegador.findElement(By.id("phone_mobile")).sendKeys("8888-8888");
        navegador.findElement(By.id("submitAccount")).click();
        navegador.quit();


        //Exemplo de assert
        Assert.assertEquals(1, 1);

    }
    
}