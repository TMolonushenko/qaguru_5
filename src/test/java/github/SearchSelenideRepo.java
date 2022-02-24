package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.files.DownloadActions.click;

public class SearchSelenideRepo {
    @Test
    void shouldFindSelenideInGithub() {
        //открыть страницу в github
        open("https://github.com/");
        //ввести в поле поиска selenide и нажать enter
        $("[data-test-selector='nav-search-input']").setValue("selenide").pressEnter();
        $(".repo-list li").$("a").click();
        // нажимаем на линк от первого результата поиска
        //check : в заголовке встречаются selenide/selenide
        $("h1").shouldHave(text("selenide / selenide"));

    }
}
