package github;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class BestContributorInSelenide {

    @DisplayName("Check the first contributor")
    @Test
    void andreiSolntsevShouldBeTheFirstContributor() {
        open("https://github.com/selenide/selenide");
        $(".Layout-sidebar").$(byText("Contributors"))
                .ancestor(".BorderGrid-cell").$$("ul li")
                .first().hover();
        $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));
    }
}
