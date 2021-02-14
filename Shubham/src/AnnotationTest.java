import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationTest {
	
	@BeforeSuite
	public void setUp() {
		System.out.println("SetUp System prop for chrome");
	}
	
	@BeforeTest
	public void LaunchBrowser() {
		System.out.println("LaunchBrowser");
	}
	
	@BeforeClass
	public void Login() {
		System.out.println("Login App");
	}
	
	@BeforeMethod
	public void EnterURL() {
		System.out.println("Enter URL");
	}
	
	@Test
	public void GoogleLogoTest() {
		System.out.println("Google Logo Test");
	}
	
	@Test
	public void GoogleSearchTest() {
		System.out.println("Google Search Test");
	}
	
	@AfterMethod
	public void Logout() {
		System.out.println("Logout from App");
	}
	
	@AfterClass
	public void Closebrowser() {
		System.out.println("Closebrowser");
	}
	
	@AfterTest
	public void DeleteAllCookies() {
		System.out.println("DeleteAllCookies");
	}
	
}
