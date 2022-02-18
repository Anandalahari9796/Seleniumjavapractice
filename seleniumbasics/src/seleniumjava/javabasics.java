package seleniumjava;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javabasics {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromebrowser\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
        String title=driver.getTitle();
        System.out.println(title);
        WebElement web=driver.findElement(By.cssSelector("#nav-link-accountList > span"));
        Actions act=new Actions(driver);
        act.moveToElement(web);
        act.perform();
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
      //  driver.findElement(By.id("createAccountSubmit")).click();
        driver.findElement(By.id("ap_customer_name")).sendKeys("Lahari");
        Thread.sleep(3000);
        driver.findElement(By.id("ap_phone_number")).sendKeys("8985009796");
        Thread.sleep(3000);
        driver.findElement(By.id("ap_password")).sendKeys("L@hari9796");
        Thread.sleep(3000);
       // driver.findElement(By.linkText("Pasword again")).sendKeys("L@hari9796");
       // Thread.sleep(3000);
        driver.findElement(By.id("continue")).click();
        Thread.sleep(3000);
//        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles");
//        driver.findElement(By.id("nav-search-submit-button")).click();
//        driver.findElement(By.className("a-size-medium a-color-base a-text-normal")).click();
//        Set<String> wind=driver.getWindowHandles();
      
      //  driver.findElement(By.className("nav-a  ")).click();
        
        driver.close();
	}

}
