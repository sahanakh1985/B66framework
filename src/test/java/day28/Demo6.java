package day28;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) throws InterruptedException {
		// Workbook wb = WorkbookFactory.create(new File("./data/selenium.xlsx"));
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 1; j++) {
//				String v = wb.getSheet("sheet3").getRow(i).getCell(j).getStringCellValue();
//				System.out.print(v + " ");
//			}
//			System.out.println();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.com");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@class='gLFyf' and not(name='q')]")).sendKeys("java");
		Thread.sleep(1000);

		String xp = "//span[contains(text(),'java')]";
		Thread.sleep(1000);
		List<WebElement> allATS = driver.findElements(By.xpath("xp"));
		int count = allATS.size();

		for (int i1 = 0; i1 < count; i1++) {
			String text = allATS.get(i1).getText();
			System.out.println(text);
		}

		driver.quit();

//				// writing data back to excel
//				wb.getSheet("sheet3").getRow(0).createCell(0).setCellValue(text);
//				wb.write(new FileOutputStream("./data/Selenium.xlsx"));// Save
//				wb.close();
//			}
	}

}
