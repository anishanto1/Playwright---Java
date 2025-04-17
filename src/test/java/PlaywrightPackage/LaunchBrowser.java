package PlaywrightPackage;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LaunchBrowser {

	public static void main(String[] args) {

		//Add Playwright interface with create()
		Playwright playwright =	Playwright.create();

		//Mention the browser & Set its Headless
		//Playwright will be only work on headless mode to the browser otherwise the User could not see any browser pages
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));

		//Mention it should be a new page
		Page page =	browser.newPage();

		//Provide the URL where the browser need to launch
		page.navigate("https://www.demoblaze.com/");

		//Get & Print the Page Title
		String title = page.title();
		System.out.println("Page title is " + title);

		//Get the Page URL & Print
		String pageURL =	page.url();
		System.out.println("Page URL is " + pageURL);

		//Close Page , browser , playwright
		page.close();
		browser.close();
		playwright.close();

	}

}
