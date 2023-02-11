package class23;

public class WebDriverTester {
    public static void main(String[] args) {
        Chrome googleChrome=new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

    }
}
