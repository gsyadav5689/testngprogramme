import org.testng.annotations.Test;

public class groupsdemo7 {
	@Test(groups="openbrowser")
	public void openbrowser() {
		System.out.println("openbrowser");
	}
	@Test(groups="login")
	public void login() {
		System.out.println("login");
	}
	@Test(groups="viewacc")
	public void viewacc() {
		System.out.println("viewacc");
	}
	@Test(groups="logout")
	public void logout() {
		System.out.println("logout");
	}
	@Test(groups="closebrowser")
	public void closebrowser() {
		System.out.println("closebrowser");
	}
}
