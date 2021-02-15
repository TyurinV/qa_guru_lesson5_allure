package tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SecondLambdaStep {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    @Owner("TyurinV")
    @DisplayName("Поиск issue - Attach external html file to the test run")
    void shouldHaveIssueInGithub() {
        step("Открыть страницу Github", () -> {
            open("https://github.com/");
        });
        step("Поиск allure", () -> {
            $("[name=q]").setValue("allure").pressEnter();
        });
        step("Переход в раздел issues аллюра", () -> {
            $(".repo-list li a").click();
            $("[data-tab-item=i1issues-tab]").click();
        });
        step("Проверка issue с названием Attach external html file to the test run ", () -> {
            $("#issue_1183_link").shouldHave(text("Attach external html file to the test run"));
        });

    }
}