import org.testng.annotations.Test;

public class grroupbyExecution {
@Test(dependsOnGroups = "signin")
public void viewAcc() {
	System.out.println("view account");
}
@Test(priority=1,groups="signin")
public void openBrowser() {
	System.out.println("openBrowser");
}
@Test(priority=2, groups="signin")
public void signin() {                     
	System.out.println(" signin to account");
}
@Test(dependsOnMethods = "viewAcc")
public void logout() {
	System.out.println("logout");
}
}
