//How to handle basic html controls in Selenium WebDriver ?
//or How to handle the Links,buttons,radio buttons, and checkboxes using selenium WebDriver ?

package selenium.buttonPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBasicHTMLcontrols {

	public static void main(String[] args) throws Exception {
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
    Thread.sleep(2000);
    driver.findElement(By.id("firstName")).sendKeys("Ravindar");
    Thread.sleep(2000);
    driver.findElement(By.id("lastName")).sendKeys("Guguloth");
    Thread.sleep(2000);
    driver.findElement(By.id("malerb")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("femalerb")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("englishchbx")).click();
    Thread.sleep(2000);
    WebElement hindichbx = driver.findElement(By.id("hindichbx"));
    hindichbx.click();
    Thread.sleep(1000);
    if(hindichbx.isSelected());
    hindichbx.click();
    Thread.sleep(2000);
    driver.findElement(By.id("registerbtn")).click();
    System.out.println(driver.findElement(By.id("msg")).getText());
    Thread.sleep(2000);
    driver.findElement(By.id("navigateHome")).click();
    Thread.sleep(2000);
    driver.close();
	}

}
