import org.openqa.selenium.By;
//import necessary Selenium WebDriver classes
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
  //declare Selenium WebDriver
  private WebDriver webDriver;		
  
//  @Test
//  public void checkId() {
//	  //Load website as a new page
//	  webDriver.navigate().to("https://devopsessentials.github.io");
//	  WebElement we =  webDriver.findElement(By.id("content"));
//	  
//	  System.out.println("id we: "+we.getAttribute("role"));
//	  Assert.assertEquals(we.getAttribute("role"), "contentinfo");
//  }
//  
  @Test
  //this test helps ensure that the buttons redirect to the correct page
  public void checkPage() {
	  
	  //Load website as a new page
	  webDriver.navigate().to("http://localhost:8080/Moview/addMovie.jsp");
	  
	  //Assert the title to check that we are indeed in the correct page
	  Assert.assertEquals(webDriver.getTitle(), "Add Movies");
	  
	  System.out.println("title: "+webDriver.getTitle());
	  
	  //check that the back to dashboard button works
	  webDriver.findElement(By.className("buttons")).click();
	  
	  //Assert the new title to check that the title is "Moview Management" and the button had successfully bring us to the new page
	  Assert.assertEquals(webDriver.getTitle(), "Moview Management");
	  System.out.println("new title: "+webDriver.getTitle());
	    
  }
  
@Test
public void checkMovie() {
	
	  ///Load website as a new page
	  webDriver.navigate().to("http://localhost:8080/Moview/addMovie.jsp");
	  
	  //Assert the title to check that we are indeed in the correct page
	  Assert.assertEquals(webDriver.getTitle(), "Add Movies");
	  
	  //find each of the input boxes
	  webDriver.findElement(By.name("movieName")).sendKeys("Spider-Man: No way home");
	  webDriver.findElement(By.name("movieImage")).sendKeys("https://images-na.ssl-images-amazon.com/images/S/pv-target-images/6988390473976963aefed9adcefe06acdf35a6f2c63403d449c0a6afcf2a0b41._UR1920,1080_RI_.jpg");
	  webDriver.findElement(By.name("genre")).sendKeys("Superhero");
	  webDriver.findElement(By.name("description")).sendKeys("This is a superhero movie.");
	  webDriver.findElement(By.name("ageRating")).sendKeys("PG");
	  webDriver.findElement(By.name("trailer")).sendKeys("https://youtu.be/JfVOs4VSpmA");
	  
	  //ensure that after entering the data you are able to post it and it will redirect you to the movie management page
	  webDriver.findElement(By.className("submitBtn")).click();
	  //Assert the new title to check that the title is "Moview Management" and the button had successfully bring us to the new page
	  Assert.assertEquals(webDriver.getTitle(), "Moview Management");
	  System.out.println("new title: "+webDriver.getTitle());

	  webDriver.navigate().to("http://localhost:8080/Moview/MovieServlet/dashboard");
	  webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div/div[3]/div[1]/a/b")).click();
	  webDriver.findElement(By.xpath("/html/body/div/div/div/form/button")).click();
	  
	 
}
@Test
public void deleteMovie() {
	
	  webDriver.navigate().to("http://localhost:8080/Moview/MovieServlet/dashboard");
	  webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[4]/div/div[3]/div[2]/a/b")).click();
	  
	 
}


//@Test
//public void updateMovie() {
//	
//	  ///Load website as a new page
//	  webDriver.navigate().to("http://localhost:8080/Moview/MovieServlet/dashboard");
//	  
//	  //Assert the title to check that we are indeed in the correct page
//	  Assert.assertEquals(webDriver.getTitle(), "Movie Management");
//	  
////	  //find each of the input boxes
////	  webDriver.findElement(By.name("movieName")).sendKeys("Spider-Man: No way home");
////	  webDriver.findElement(By.name("movieImage")).sendKeys("https://images-na.ssl-images-amazon.com/images/S/pv-target-images/6988390473976963aefed9adcefe06acdf35a6f2c63403d449c0a6afcf2a0b41._UR1920,1080_RI_.jpg");
////	  webDriver.findElement(By.name("genre")).sendKeys("Superhero");
////	  webDriver.findElement(By.name("description")).sendKeys("This is a superhero movie.");
////	  webDriver.findElement(By.name("ageRating")).sendKeys("PG");
////	  webDriver.findElement(By.name("trailer")).sendKeys("https://youtu.be/JfVOs4VSpmA");
//	  
//	  webDriver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[8]/div/div[3]/div[1]/a/b")).click();
//	  //webDriver.findElement(By.xpath("/html/body/div/div/div/form/button")).click();
//	  ///html/body/div[2]/div/div[2]/div[1]/div/div[3]/div[1]/a/b
//
//	  //ensure that after entering the data you are able to post it and it will redirect you to the movie management page
//	  //webDriver.findElement(By.className("btn btn-success")).click();
//
//	  //Assert the new title to check that the title is "Moview Management" and the button had successfully bring us to the new page
//	  //Assert.assertEquals(webDriver.getTitle(), "Moview Management");
//	 //System.out.println("new title: "+webDriver.getTitle());
//	  
//	 
//}

//@Test
////this test helps ensure that the buttons redirect to the correct page
//public void checkMovieManagementPage() {
//	  
//	  //Load website as a new page
//	  webDriver.navigate().to("http://localhost:8080/Moview/MovieServlet/dashboard");
//	  
//	  //Assert the title to check that we are indeed in the correct page
//	  Assert.assertEquals(webDriver.getTitle(), "Movie Management");
//	  
//	  System.out.println("title: "+webDriver.getTitle());
//	  
//	  //check that the back to dashboard button works
//	  webDriver.findElement(By.className("buttons")).click();
//	  
//	  //Assert the new title to check that the title is "Moview Management" and the button had successfully bring us to the new page
//	  Assert.assertEquals(webDriver.getTitle(), "Moview Management");
//	  System.out.println("new title: "+webDriver.getTitle());
//	    
//}
//
//  
  
  
  @BeforeTest
  public void beforeTest() {
	  //Setting system properties of ChromeDriver
	  //to amend directory path base on your local file path
	  String chromeDriverDir = "C:\\Program Files\\Google\\chromedriver.exe";

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

