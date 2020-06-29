package FaceBook.Maven_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FaceBookSignInTest {
	@Test
	public void signInTest() {
		System.out.println("Valid Users should be able to successfully sing in. ");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Md Rashid\\Documents\\Selinium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("mdzahidhossain813@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Abcd123456!");
		driver.findElement(By.id("u_0_b")).click();
	}

}
