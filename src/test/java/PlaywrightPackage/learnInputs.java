package PlaywrightPackage;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class learnInputs {

	public static void main(String[] args) {

		//Add Playwright interface with create()
		Playwright playwright =	Playwright.create();

		//Mention the browser & Set its Headless
		//Playwright will be only work on headless mode to the browser otherwise the User could not see any browser pages
		Browser browser = playwright.firefox().launch(new BrowserType.LaunchOptions().setHeadless(false));

		//Mention it should be a new page
		Page page =	browser.newPage();

		//Provide the URL where the browser need to launch
		page.navigate("https://letcode.in/edit");
		
	String attribute = page.locator("#getMe").getAttribute("Value");
	System.out.println(attribute);
		
		
		
		

	}

}
