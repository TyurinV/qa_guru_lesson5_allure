package tests;

import io.qaguru.TyurinV.BaseTest;
import org.junit.jupiter.api.Test;

public class ThirdStepsWithAnnotation {

        public BaseTest steps = new BaseTest();

        @Test
        public void testIssueCheck(){
            steps.openMainPage();
            steps.allureSearch();
            steps.issueSection();
            steps.issueCheck();
        }
}
