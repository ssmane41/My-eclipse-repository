import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstJavaClass {
	@Test
	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver 2");
		WebDriver driver=new ChromeDriver();
	//	driver.get("https:www.facebook.com");
	//	TakesScreenshot ts = (TakesScreenshot)driver;
	//	File source = ts.getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(source, new File("./Screesnshots/Shubham.png"));
	//	System.out.println("The Screenshot is taken");
	//	driver.quit();
		driver.get("https://en.wikipedia.org/wiki/Software_testing");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li=[.='n-mainpage-description']"));
	}

}
