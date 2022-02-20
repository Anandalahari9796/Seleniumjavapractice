package testng.maven.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumDemo {
	public WebDriver driver= null;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromebrowser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void mainTest() throws InterruptedException {
		
		
		Thread.sleep(3000);
        String title=driver.getTitle();
       // Assert.assertEquals(null, false)
        if (title.equalsIgnoreCase("amazon.in")){
        		System.out.println("title matched"+title);
        }
        else {
        System.out.println(title);
        }
//        WebElement web=driver.findElement(By.cssSelector("#nav-link-accountList > span"));
//        Actions act=new Actions(driver);
//        act.moveToElement(web);
//        act.perform();
//        
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
//        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//      //  driver.findElement(By.id("createAccountSubmit")).click();
//        driver.findElement(By.id("ap_customer_name")).sendKeys("Lahari");
//        Thread.sleep(3000);
//        driver.findElement(By.id("ap_phone_number")).sendKeys("8985009796");
//        Thread.sleep(3000);
//        driver.findElement(By.id("ap_password")).sendKeys("L@hari9796");
//        Thread.sleep(3000);
//       // driver.findElement(By.linkText("Pasword again")).sendKeys("L@hari9796");
//       // Thread.sleep(3000);
//        driver.findElement(By.id("continue")).click();
//        Thread.sleep(3000);
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//        driver.findElement(By.className("a-size-medium a-color-base a-text-normal")).click();
//        Set<String> wind=driver.getWindowHandles();
      
      //  driver.findElement(By.className("nav-a  ")).click();
        
        
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	}



	


