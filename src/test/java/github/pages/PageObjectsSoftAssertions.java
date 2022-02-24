package github.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PageObjectsSoftAssertions {
    private final SelenideElement
            go_wiki_tab = $("#wiki-tab"),
            wiki_pages_filter = $("#wiki-pages-filter"),
            wiki_rightbar = $(".wiki-rightbar");

    public void clickWiki() {

        go_wiki_tab.pressEnter();
    }

    public void checkSoftAssertions(String wikiFilter) {

        wiki_pages_filter.setValue(wikiFilter);
    }

    public void goSoftAssertions() {
        wiki_rightbar.shouldHave(Condition.text("SoftAssertions")).click();
    }

    public void checkJUnit5() {
        $(byText("JUnit5"));
    }
}
