import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class ReviewTest {
	//declare Selenium WebDriver
	  private WebDriver webDriver;
  @Test
  public void checkTitle() {
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8080/Moview/review.jsp");
	  
	//Assert the title to check that we are indeed in the correct website
	  Assert.assertEquals(webDriver.getTitle(), "Insert title here");
	  
    System.out.println("title: "+webDriver.getTitle());
    
    
  }
  

  
  
  @BeforeTest
  public void beforeTest() {
	//Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  String chromeDriverDir = "C:\\Program Files\\Google\\Chrome\\chromedriver.exe";

	  System.setProperty("webdriver.chrome.driver", chromeDriverDir);

	  //initialize FirefoxDriver at the start of test
	  webDriver = new ChromeDriver();  
  }

  @AfterTest
  public void afterTest() {
	//Quit the ChromeDriver and close all associated window at the end of test
	  webDriver.quit();	
  }

}
