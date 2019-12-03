package Principal;

import java.awt.Robot;
import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Eventos {
	
	public static WebDriver driver = null;
	Robot roobot = null;
	
	public void abrirNavegador (String url, String Navegador) {
		try {
			if(Navegador.equals("IE")) {
				File file = new File ("C:/Users/Oga Tatsumi/Downloads/IEDriverServer_x64_3.150.1/IEDriverServer.exe");
				System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
				capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
				//driver = new InternetExplorerDriver(capabilities);
				driver.manage().window().maximize();
				driver.get(url);
				
			}else if(Navegador.equals("chrome")) {
				File file = new File ("C:/Users/Oga Tatsumi/Downloads/chromedriver_win32/chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--start-maximized");
				driver = new ChromeDriver(options);
				driver.get(url);
				
				
			}
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
