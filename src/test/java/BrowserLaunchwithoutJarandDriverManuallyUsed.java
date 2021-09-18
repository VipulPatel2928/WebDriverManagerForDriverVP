import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunchwithoutJarandDriverManuallyUsed {

	public static void waitForSeconds(int seconds) {

		try {
			Thread.sleep(2 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		WebDriver driver = GetDriverAsPerUse.getChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		waitForSeconds(2);

		driver.quit();

		driver = GetDriverAsPerUse.getFirefoxDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com");

		waitForSeconds(2);

		driver.quit();

	}
}
