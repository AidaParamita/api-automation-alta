
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        feature = "src/test/resources/api"
)

public class CucumberTestSuite {
}
