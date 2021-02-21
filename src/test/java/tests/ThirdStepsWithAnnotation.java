package tests;

import io.qaguru.TyurinV.BaseSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdStepsWithAnnotation {

        public BaseSteps steps = new BaseSteps();

        @Test
        @DisplayName("Поиск issue - Attach external html file to the test run")
        public void testIssueCheck(){
            steps.openMainPage();
            steps.allureSearch();
            steps.issueSection();
            steps.issueCheck("Attach external html file to the test run");
        }
}
