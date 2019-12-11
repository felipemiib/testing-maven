package Login;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class Login_admin {
private WebDriver driver;
JavascriptExecutor js;
@Before
public void setUp() {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\felipe.santos\\Desktop\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 new HashMap<String, Object>();	
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void Login() {
 driver.get("http://beta.oroseducacao.com.br/login");
 driver.manage().window().setSize(new Dimension(1364, 726));
 driver.findElement(By.id("usuario")).click();
 driver.findElement(By.id("usuario")).sendKeys("felipemiib@gmail.com");
 driver.findElement(By.id("senha")).click();
 driver.findElement(By.id("senha")).sendKeys("123456789");
 driver.findElement(By.id("Entrar")).click();
}
}
