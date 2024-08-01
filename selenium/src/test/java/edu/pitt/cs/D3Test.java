package edu.pitt.cs;

// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import static org.hamcrest.MatcherAssert.assertThat;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class D3Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--headless");
    driver = new ChromeDriver(options);
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tEST3CATALOG() {
    // Test name: TEST-3-CATALOG
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | storeAttribute | css=li:nth-child(3) > img@src | src
    {
      WebElement element = driver.findElement(By.cssSelector("li:nth-child(3) > img"));
      String attribute = element.getAttribute("src");
      vars.put("src", attribute);
    }
    // 4 | assert | src | /images/cat2.jpg
    assertEquals(vars.get("src").toString(), "http://localhost:8080/images/cat2.jpg");
  }
  @Test
  public void tEST9FEED() {
    // Test name: TEST-9-FEED
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | click | id=catnips | 
    driver.findElement(By.id("catnips")).click();
    // 5 | type | id=catnips | 6
    driver.findElement(By.id("catnips")).sendKeys("6");
    // 6 | click | xpath=//button[contains(.,'Feed')] | 
    driver.findElement(By.xpath("//button[contains(.,\'Feed\')]")).click();
    // 7 | assertText | id=feedResult | Nom, nom, nom.
    assertThat(driver.findElement(By.id("feedResult")).getText(), is("Nom, nom, nom."));
  }
  @Test
  public void tEST8FEEDACAT() {
    // Test name: TEST-8-FEED-A-CAT
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | click | linkText=Feed-A-Cat | 
    driver.findElement(By.linkText("Feed-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//button[contains(.,'Feed')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Feed\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST10GREETACAT() {
    // Test name: TEST-10-GREET-A-CAT
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | click | linkText=Greet-A-Cat | 
    driver.findElement(By.linkText("Greet-A-Cat")).click();
    // 4 | assertText | css=#greeting > h4 | Meow!Meow!Meow!
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow!Meow!Meow!"));
  }
  @Test
  public void tEST11GREETACATWITHNAME() {
    // Test name: TEST-11-GREET-A-CAT-WITH-NAME
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | open | /greet-a-cat/Jennyanydots | 
    driver.get("http://localhost:8080/greet-a-cat/Jennyanydots");
    // 4 | assertText | css=#greeting > h4 | Meow! from Jennyanydots.
    assertThat(driver.findElement(By.cssSelector("#greeting > h4")).getText(), is("Meow! from Jennyanydots."));
  }
  @Test
  public void tEST1LINKS() {
    // Test name: TEST-1-LINKS
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | storeAttribute | linkText=Reset@href | href
    {
      WebElement element = driver.findElement(By.linkText("Reset"));
      String attribute = element.getAttribute("href");
      vars.put("href", attribute);
    }
    // 4 | assert | href | /reset
    assertEquals(vars.get("href").toString(), "http://localhost:8080/reset");
  }
  @Test
  public void tEST4LISTING() {
    // Test name: TEST-4-LISTING
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | click | linkText=Catalog | 
    driver.findElement(By.linkText("Catalog")).click();
    // 4 | storeXpathCount | xpath=//div/ul/li | count
    vars.put("count", driver.findElements(By.xpath("//div/ul/li")).size());
    // 5 | assert | count | 3
    assertEquals(vars.get("count").toString(), "3");
    // 6 | assertText | xpath=//div/ul/li[3] | ID 3. Mistoffelees
    assertThat(driver.findElement(By.xpath("//div/ul/li[3]")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST6RENT() {
    // Test name: TEST-6-RENT
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | click | id=rentID | 
    driver.findElement(By.id("rentID")).click();
    // 5 | type | id=rentID | 1
    driver.findElement(By.id("rentID")).sendKeys("1");
    // 6 | click | css=.form-group:nth-child(3) .btn | 
    driver.findElement(By.cssSelector(".form-group:nth-child(3) .btn")).click();
    // 7 | assertText | css=.list-group-item:nth-child(1) | Rented out
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("Rented out"));
    // 8 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("ID 2. Old Deuteronomy"));
    // 9 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
    // 10 | assertText | id=rentResult | Success!
    assertThat(driver.findElement(By.id("rentResult")).getText(), is("Success!"));
  }
  @Test
  public void tEST5RENTACAT() {
    // Test name: TEST-5-RENT-A-CAT
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 4 | assertElementPresent | xpath=//button[contains(.,'Rent')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Rent\')]"));
      assert(elements.size() > 0);
    }
    // 5 | assertElementPresent | xpath=//button[contains(.,'Return')] | 
    {
      List<WebElement> elements = driver.findElements(By.xpath("//button[contains(.,\'Return\')]"));
      assert(elements.size() > 0);
    }
  }
  @Test
  public void tEST2RESET() {
    // Test name: TEST-2-RESET
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | runScript | document.cookie = "1=true";document.cookie = "2=true";document.cookie = "3=true" | 
    js.executeScript("document.cookie = \"1=true\";document.cookie = \"2=true\";document.cookie = \"3=true\"");
    // 4 | click | linkText=Reset | 
    driver.findElement(By.linkText("Reset")).click();
    // 5 | assertText | css=.list-group-item:nth-child(1) | ID 1. Jennyanydots
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    // 6 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("ID 2. Old Deuteronomy"));
    // 7 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
  }
  @Test
  public void tEST7RETURN() {
    // Test name: TEST-7-RETURN
    // Step # | name | target | value
    // 1 | open | / | 
    driver.get("http://localhost:8080/");
    // 2 | runScript | document.cookie = "1=false";document.cookie = "2=false";document.cookie = "3=false" | 
    js.executeScript("document.cookie = \"1=false\";document.cookie = \"2=false\";document.cookie = \"3=false\"");
    // 3 | runScript | document.cookie = "2=true" | 
    js.executeScript("document.cookie = \"2=true\"");
    // 4 | waitForElementVisible | css=.logo | 30000
    {
      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".logo")));
    }
    // 5 | click | linkText=Rent-A-Cat | 
    driver.findElement(By.linkText("Rent-A-Cat")).click();
    // 6 | click | id=returnID | 
    driver.findElement(By.id("returnID")).click();
    // 7 | type | id=returnID | 2
    driver.findElement(By.id("returnID")).sendKeys("2");
    // 8 | click | css=.form-group:nth-child(4) .btn | 
    driver.findElement(By.cssSelector(".form-group:nth-child(4) .btn")).click();
    // 9 | assertText | css=.list-group-item:nth-child(1) | ID 1. Jennyanydots
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(1)")).getText(), is("ID 1. Jennyanydots"));
    // 10 | assertText | css=.list-group-item:nth-child(2) | ID 2. Old Deuteronomy
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(2)")).getText(), is("ID 2. Old Deuteronomy"));
    // 11 | assertText | css=.list-group-item:nth-child(3) | ID 3. Mistoffelees
    assertThat(driver.findElement(By.cssSelector(".list-group-item:nth-child(3)")).getText(), is("ID 3. Mistoffelees"));
    // 12 | assertText | id=returnResult | Success!
    assertThat(driver.findElement(By.id("returnResult")).getText(), is("Success!"));
  }
}
