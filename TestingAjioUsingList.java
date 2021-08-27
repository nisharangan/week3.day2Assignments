package week3.day2Assignments;

import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestingAjioUsingList {
	//To download the setup, launch the chrome browser and load the URL
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//To locate the 'Search' text box, type as 'Bags' and press Enter
		WebElement searchBox = driver.findElementByXPath("//input[@class='react-autosuggest__input react-autosuggest__input--open']");
		searchBox.sendKeys("Bags");
	    searchBox.sendKeys(Keys.ENTER);
	    Thread.sleep(2000);
	    
	    //To locate the 'Men' checkbox and click
	    driver.findElementByXPath("//input[@id='Men']/parent::div/label").click();
	    Thread.sleep(2000);
	    
	    //To locate the 'Fashion Bags' checkbox under Category and click
	    driver.findElementByXPath("//input[@id='Men - Fashion Bags']/parent::div/label").click();
	    
	    //To locate and print the No.items found
	    WebElement countText = driver.findElementByXPath("//div[@class='length']");
	    String text = countText.getText();
	    System.out.println("The No. of Items: " +text);
	    
	    //To locate the Brand names and print the brand name text that is displayed on the page using List
	    //Using set to ignore duplicated brand names
	    List<WebElement> listBrand =  driver.findElementsByClassName("brand");	
	    Set<String> brandInSet = new LinkedHashSet<String>();
	    
	    int brandListCount = listBrand.size();
	    System.out.println("The total number of Brand names displayed: " +brandListCount);
	    System.out.println("******The Brand names are list below******");
	    for (WebElement brandListNames : listBrand) {
	    	String brandText = brandListNames.getText(); //to get the brand names
	    	System.out.println(brandText);
	    	brandInSet.add(brandText); //to add in set to ignore duplicated brand names
		}
	    //Using set to print the Brand Names, removed the duplicated brand names
	    System.out.println("*****After removing duplicated Brand names*****");
	    int brandCount = brandInSet.size();
	    System.out.println("The total number of Brand names are: " +brandCount);
	    System.out.println("The Brand names are: " +brandInSet);
	    
	   //To locate the Bag names and print the bag name text using List
	    List<WebElement> bagNames = driver.findElementsByClassName("name");
	    System.out.println("******List of Bag names are:*******");
	    for (WebElement webElement : bagNames) {
	    	String bagText = webElement.getText();
	    	System.out.println(bagText);	
		}
	}

}
