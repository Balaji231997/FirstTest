package gitTest2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitTest2 {
	
	@Test
	public void loginTest() throws IOException{
		WebDriver wd=new FirefoxDriver();
		wd.get("http://www.bing.com");
		System.out.println(wd.getTitle());
		wd.findElement(By.name("q")).sendKeys("Tamilnadu");
		wd.findElement(By.name("q")).submit();
		System.out.println(wd.getTitle());
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Workspace\\A13_GitTest\\Screenshot\\sample2.jpeg"));
	}
}
