package Test.Test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopper {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		Thread.sleep(10);
		driver.findElement(By.linkText("Create new account")).click();
		WebElement day = driver.findElement(By.id("year"));
		Select s= new Select(day);
		List<WebElement> allDayDropdown = s.getOptions();
		for (WebElement a : allDayDropdown) {
			a.click();
		}
		}
	}


