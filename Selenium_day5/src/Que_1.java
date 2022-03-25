import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Que_1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhishek Kumar\\Downloads\\Drivers_Selenium\\chromedriver_win32\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(1000);

		driver.get("http://the-internet.herokuapp.com");
		Thread.sleep(1000);

		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Multiple Windows')]")).click();

		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> itr = windows.iterator();
		String parent = itr.next();
		String child = itr.next();
		driver.switchTo().window(child);
		
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'New Window')]")).getText());
		Thread.sleep(2000);
		
		driver.switchTo().window(parent);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
	}
}