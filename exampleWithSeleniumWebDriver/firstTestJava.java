import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * firstTestJava
 */
public class firstTestJava {
    @Test
    public void testFazerLoginSozinho(){
        System.setProperty("webDriver.chrome.driver","C:\\Users\\ederw\\Documents\\QA\\ChromeDriver\\chromedriver_win32_101\\chromedriver.exe");
        System.setProperty("webdriver.chrome.whitelistedIps", "");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.google.com/");
        navegador.findElement(By.name("q")).sendKeys("teste");;        
        navegador.quit();
        //Exemplo de assert
        Assert.assertEquals(1, 1);
    }
    
}