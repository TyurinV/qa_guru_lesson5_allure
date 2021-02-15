package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class FirstPureSelenide {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }
    @Test
    void shouldHaveIssueInGithub() {
        //Открыть страницу Github
        open("https://github.com/");
        // Открыть Selenide
        $("[name=q]").setValue("allure").pressEnter();
        $(".repo-list li a").click();
        $("[data-tab-item=i1issues-tab]").click();
        $("#issue_1183_link").shouldHave(text("Attach external html file to the test run"));


    }}
