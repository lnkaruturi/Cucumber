import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class NewTest {
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI NARAYANA\\Desktop\\chromedriver_win32\\chromedriver.exe");
		 
	  }
  @Test
  public void f() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\LAKSHMI NARAYANA\\Desktop\\chromedriver_win32\\chromedriver.exe");
	  //WebDriver driver = new ChromeDriver();
  }
  @BeforeMethod
  public void beforeMethod() {
	  //System.out.println("BM");
	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("AM");
  }



  @AfterTest
  public void afterTest() {
	  System.out.println("AT");
	  
  }

}
