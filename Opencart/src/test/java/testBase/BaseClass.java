package testBase;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.text.CharacterPredicates;
import org.apache.commons.text.RandomStringGenerator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class BaseClass {
	
	protected WebDriver driver;
	public Logger logger;
	public Properties p;
	
	@BeforeClass
	@Parameters({"os","browser"})
	public void setup(String os,String br) throws IOException {
		
		logger=LogManager.getLogger(this.getClass());
		
		FileReader file = new FileReader ("./src//test//resources//config.properties");
		p=new Properties();
		p.load(file);
	
			
		
		switch(br.toLowerCase())
		{
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default : System.out.println("Invalid Browser"); return;
		}
		
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(p.getProperty("appurl"));      // reading url from config.property file
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public void teardown() {
		 driver.close();
	}
	

	public String randomString() {
		RandomStringGenerator generator = new RandomStringGenerator.Builder()
				.withinRange('0', 'z')              // upper n lower case letters
			    .filteredBy(CharacterPredicates.LETTERS)
			    .build();
        return generator.generate(5);
	}
	
	
	public String randomNumber() {
		RandomStringGenerator generator = new RandomStringGenerator.Builder()
				 .withinRange('0', '9')           // digits only
                 .build();
        return generator.generate(8);
	}
	
    /*
     * generate Alphanumeric values    
	.withinRange('0', 'z')
    .filteredBy(Character::isLetterOrDigit)
    .build();   */
	
	
	
}
