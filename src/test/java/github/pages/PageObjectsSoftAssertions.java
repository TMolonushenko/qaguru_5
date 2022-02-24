package github.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class PageObjectsSoftAssertions {
    private final SelenideElement
            go_wiki_tab = $("#wiki-tab"),
            wikiPagesFilter = $("#wiki-pages-filter"),
            wikiRightbar = $(".wiki-rightbar"),
            markdownBody = $(".markdown-body");

    public void clickWiki() {
        go_wiki_tab.pressEnter();
    }

    public void checkSoftAssertions(String wikiFilter) {
        wikiPagesFilter.setValue(wikiFilter);
    }

    public void goSoftAssertions() {
        wikiRightbar.shouldHave(Condition.text("SoftAssertions")).click();
    }

    public void resultOutJUnit5() {
        markdownBody.shouldHave(text("Using JUnit5 extend test class"));
    }
}
