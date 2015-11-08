/*package lecture6;

import com.codeborne.selenide.ElementsCollection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.Collection;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.Assert.assertFalse;

@RunWith(Parameterized.class)
public class ParamsTest {

    private String query;
    private String result;

    public ParamsTest(String query, String result) {
        this.query = query;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateData() {
        return Arrays.asList(new Object[][] {
            {"Cheese", "hello"},
            {"Apple", "apple"}
        });
    }

    @Test
    public void testParams() throws Exception {
        open("http://www.google.com");
        $(By.name("q")).setValue(query).submit();
        $("#lfootercc").should(appear);
        ElementsCollection collection = $$(By.xpath("//h3[@class='r']"));
        assertFalse(collection.isEmpty());
    }
}
*/