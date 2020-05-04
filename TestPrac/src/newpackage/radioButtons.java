package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class radioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();

		 driver.get("http://formy-project.herokuapp.com/radiobutton");
		 
		 WebElement RadioButton1 = driver.findElement(By.id("radio-button-1"));
		 RadioButton1.click();
		 Thread.sleep(5000);
		
		 WebElement RadioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
		 RadioButton2.click();
		 Thread.sleep(5000);
		 
		// WebElement RadioButton3 = driver.findElement(By.cssSelector("input[value='option3']"));
		 WebElement RadioButton3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		 RadioButton3.click();
		 Thread.sleep(5000);
		 
		 driver.quit();

	}

}
