import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Opparameter {
@Test
@Parameters({"message"})
public void op(@Optional("option parameter") String message) {
	System.out.println(message);
}
}
