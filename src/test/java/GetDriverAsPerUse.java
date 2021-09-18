import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDriverAsPerUse {
	public static WebDriver getChromeDriver() {
      WebDriverManager.chromedriver().setup();
      return new ChromeDriver();
  }

  public static WebDriver getFirefoxDriver() {
      WebDriverManager.firefoxdriver().setup();
      return new FirefoxDriver();
  }

  public static WebDriver getInternetExplorerDriver() {
      WebDriverManager.iedriver().setup();
      return new InternetExplorerDriver();
  }
  
  public static WebDriver getChromeDriverWithOptionAsperUse() {
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--start-maximized");
      WebDriverManager.chromedriver().setup();
      return new ChromeDriver(options);
  }
  
}
