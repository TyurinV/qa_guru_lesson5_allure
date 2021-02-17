package io.qaguru.TyurinV;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {

    String issueName = "Attach external html file to the test run";

    @Step("Открываем главную страницу")
    public void openMainPage() {
        open("https://github.com/");
    }
    @Step ("Поиск allure")
    public void allureSearch() {
        $("[name=q]").setValue("allure").pressEnter();
    }
    @Step ("Переход в раздел Issue")
    public void issueSection() {
        $(".repo-list li a").click();
        $("[data-tab-item=i1issues-tab]").click();
    }
    @Step ("Проврка issue \"Attach external html file to the test run\"")
    public void issueCheck(){
        $("#issue_1183_link").shouldHave(text(issueName));
    }

}
