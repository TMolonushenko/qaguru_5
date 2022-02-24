package github;

import com.codeborne.selenide.Condition;
import github.pages.PageObjectsSoftAssertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class SearchSoftAssertions {
    PageObjectsSoftAssertions pageObjectsSoftAssertions = new PageObjectsSoftAssertions();
    String wikiFilter = "SoftAssertions";

    @Test
    void shouldSoftAssetionsInWikiGithub() {
        open("https://github.com/selenide/selenide");
        pageObjectsSoftAssertions.clickWiki();
        pageObjectsSoftAssertions.checkSoftAssertions(wikiFilter);
        pageObjectsSoftAssertions.goSoftAssertions();
        pageObjectsSoftAssertions.checkJUnit5();
    }
}
