package Test_scripts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Script1 {
	@Test
	public void blink()
	{
		WebDriver driver=null;
		String browsername = System.getProperty("bname");
		if(browsername.equalsIgnoreCase("edge"))
		{
//			System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
			driver=new EdgeDriver();
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
//			System.setProperty("webdriver.chromedriver.driver","./driver/chromedriver.exe");
			 driver=new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://blinkit.com/"); 
		
	}
}
