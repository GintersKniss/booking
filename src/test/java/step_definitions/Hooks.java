package step_definitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void launchBrowser(){
        System.out.println("LAUNCH CHROME");
    }
    @After
    public void closeBrowser(){
        System.out.println("CLOSE BROWSER");
    }

}
