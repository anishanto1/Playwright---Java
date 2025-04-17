package PlaywrightPackage;

import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class dropdown {

	public static void main(String[] args) {

		//Create Playwright Interface
		Playwright playwright =	Playwright.create();

		//Launch Browser with Headless mode 
		LaunchOptions headless = new BrowserType.LaunchOptions().setHeadless(false);

		//Mention the Browser & create a new page 
		Page page = playwright.firefox().launch(headless).newPage();

		// Navigate to the browser page 
		page.navigate("https://letcode.in/dropdowns");

		//Launch Select Options
		//page.selectOption("id=fruits","1");

		//In other way , we can Use Label , index , value option
		Locator fruits = page.locator("#fruits"); //define the locator 
		fruits.selectOption(new SelectOption().setValue("Mango"));



		//Print the message populating for the item selection
		//String notificationmsg = page.locator("/html/body/app-root/app-dropdowns/section[1]/div/div/div[1]/div/div/div[1]/div/div[2]/div/p").textContent();
		//System.out.println(notificationmsg);





	}

}
