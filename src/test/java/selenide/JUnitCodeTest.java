package selenide;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class JUnitCodeTest {

    @DisplayName("Сheck if there is sample code inside for JUnit5")
    @Test
    void checkJUnitCode() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssert");
        $(byText("SoftAssertions")).click();
        $("#wiki-body").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));


    }
}
