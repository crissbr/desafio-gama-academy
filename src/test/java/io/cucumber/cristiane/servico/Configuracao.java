package io.cucumber.cristiane.servico;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Configuracao {
	
public static WebDriver browser;
	
	public static void abrir(String url) {
		
		if(browser == null) {
			System.setProperty("webdriver.chrome.driver", "driver/chromedriver");		
			browser = new ChromeDriver();
		}
		browser.get(url);
		browser.manage().window().maximize();
		
	}

	public static boolean check(String url) {
		
		if(url == "https://pay.hotmart.com/W43905507S?off=94b58527&checkoutMode=0&bid=1616761301701") {
			return true;
		}
		return false;
	}
	
	public static void fechar() {
		browser.quit();
		browser = null;
	}
	
	public static WebElement cssSelector(String selector) {
		return browser.findElement(By.cssSelector(selector));
	}

	public static WebElement id(String selector) {
		return browser.findElement(By.id(selector));
	}
	
	public static List<WebElement> cssSelectors(String selector) {
		return browser.findElements(By.cssSelector(selector));
	}

}
