//(6) 1 How to handle Dropdowns in Selenium WebDriver (multiple dropdown in single box) ?

package selenium.Dropdown1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		WebElement courseElement = driver.findElement(By.id("course"));
		Select courseNameDropdown = new Select(courseElement);
        List<WebElement> courseNameDropdownOptions = courseNameDropdown.getOptions();
        for(WebElement Options : courseNameDropdownOptions) {
        	System.out.println(Options.getText());
        }
        courseNameDropdown.selectByIndex(1);//java
        Thread.sleep(2000);
        courseNameDropdown.selectByValue("net");//.net
        Thread.sleep(2000);
        courseNameDropdown.selectByVisibleText("Javascript");//javascript
        Thread.sleep(2000);
        
     String Selectedtext =  courseNameDropdown.getFirstSelectedOption().getText();
     System.out.println("Selected visible text :"+Selectedtext);
	}

}
