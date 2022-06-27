import java.time.Duration;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * firstTestJava
 */
public class firstTestJava {
    @Test
    public void testFazerLoginSozinho(){
        System.setProperty("webDriver.chrome.driver","C:\\Users\\ederw\\Documents\\QA\\ChromeDriver\\chromedriver_win32_101\\chromedriver.exe");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        WebDriver navegador = new ChromeDriver();
        navegador.get("http://automationpractice.com/index.php");        
        new WebDriverWait(navegador, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.id("search_query_top")));
        navegador.findElement(By.className("login")).click();
        navegador.findElement(By.id("authentication")).click(); 
        new WebDriverWait(navegador, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("authentication")));
        navegador.findElement(By.id("email_create")).sendKeys("teste2704@teste.com.br");
        //navegador.quit();
        //Exemplo de assert
        Assert.assertEquals(1, 1);

    }
    
}