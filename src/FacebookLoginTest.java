import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

class FacebookLoginTest {
	@Test
	public void site_header_is_on_home_page() throws InterruptedException {	
		
		Map<String,Object> prefs = new HashMap<String, Object>();	 
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();	
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com");
        System.out.println("Site aberto com sucesso!");
        driver.manage().window().maximize();
        driver.findElement(By.id("email")).sendKeys("testeselenium0102@gmail.com");
        driver.findElement(By.id("pass")).sendKeys("teste0102@");
        driver.findElement(By.id("loginbutton")).click();
        System.out.println("Login efetuado com sucesso"); 
        Thread.sleep(3000);
        driver.findElement(By.id("userNavigationLabel")).click();
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Sair")).click();
        System.out.println("Logoff efetuado com sucesso");
		      
	}

}