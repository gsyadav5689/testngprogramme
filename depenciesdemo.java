import org.testng.annotations.Test;

public class depenciesdemo {
@Test
public void launchbrowser() {
System.out.println("launchbrowser");	
}
@Test(dependsOnMethods = "launchbrowser")
public void login() {
System.out.println("login");	
}
@Test(dependsOnMethods = "login")
public void CheckDashboard() {
System.out.println("CheckDashboard");	
}
@Test(dependsOnMethods = "CheckDashboard")
public void searchStock() {
System.out.println("Searchstock");	
}
@Test(dependsOnMethods = "searchStock")
public void BuyStock() {
System.out.println("Buy stock");	
}
@Test(dependsOnMethods = "BuyStock")
public void logout() {
System.out.println("logout");	
}
}
