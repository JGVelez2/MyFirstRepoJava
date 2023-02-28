package Test;
import Steps.FormSteps;
import org.testng.annotations.Test;

public class FormTest {
  @Test
    public void SubmitForm(){
        FormSteps actions = new FormSteps();
        actions.enterFirstName();
        actions.Click_Highest_level_of_education();


    }


}
