// Explicit question is not done or not working program so ask sir later !

package selenium.ExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("http://omayo.blogspot.com");
    driver.manage().window().setSize(new Dimension(1000, 1000));
    
   // WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(5));
    driver.findElement(By.className("dropbtn")).click();
    Wait<WebDriver> wait =new WebDriverWait(driver,Duration.ofSeconds(20));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Facebook")));
    driver.findElement(By.xpath("Facebook")).click();
    driver.quit();
	}

}
