//How to handle frames in WebPage using Selenium WebDriver ? 

package selenium.FrameWorks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FrameWorkHandle {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();

		driver.findElement(By.id("name")).sendKeys("Text 1");
		Thread.sleep(2000);

		driver.switchTo().frame("frm1");
		WebElement DropHandle = driver.findElement(By.id("course"));
		Select DropDown = new Select(DropHandle);
		DropDown.selectByValue("java");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys("Shankar");
		Thread.sleep(2000);

		driver.switchTo().frame("frm3");
		driver.findElement(By.id("name")).sendKeys("vijay");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("Ravindar");
		Thread.sleep(2000);

		driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("Husband");
		Thread.sleep(2000);
        driver.quit();
		

	}
}