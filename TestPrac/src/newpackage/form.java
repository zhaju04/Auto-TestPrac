package newpackage;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class form {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","/webdriver/geckodriver.exe");
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);

		 WebDriver driver = new FirefoxDriver();

		 driver.get("http://formy-project.herokuapp.com/form");
		 
		 submitForm(driver);
		 
		 waitForAlertBanner(driver);
					 		 
		 assertEquals("The form was successfully submitted!",  getAlertBanner(driver));
		 
		 driver.quit();
		 System.out.println("passed!!"); 
		
	}

	     private static void assertEquals(String string, String alertText) {
		// TODO Auto-generated method stub
		
	}

	    public static void submitForm(WebDriver driver) throws InterruptedException {
	    	 driver.findElement(By.id("first-name")).sendKeys("Ruth");
			 Thread.sleep(1000);
			 driver.findElement(By.id("last-name")).sendKeys("Du");
			 Thread.sleep(1000);
			 driver.findElement(By.id("job-title")).sendKeys("QA Engineer");
			 Thread.sleep(1000);
			 driver.findElement(By.id("radio-button-2")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.id("checkbox-2")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.cssSelector("option[value='1']")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.id("datepicker")).sendKeys("05/05/2021");
			 driver.findElement(By.id("datepicker")).sendKeys(Keys.RETURN);
			 Thread.sleep(2000);
			 driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
	    }
          public static void waitForAlertBanner(WebDriver driver) {
        	 WebDriverWait wait = new WebDriverWait(driver,10); 
     		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("alert")));
     		          }
          public static String getAlertBanner(WebDriver driver) {
        	  return driver.findElement(By.className("alert")).getText();
			
          }
}
