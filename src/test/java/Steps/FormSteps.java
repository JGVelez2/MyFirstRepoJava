package Steps;
import Page.HomePage;
public class FormSteps extends HomePage{


    public void enterFirstName(){
        String first_name = "Gabriel";
        this.first_name.sendKeys(first_name);
    }
    public void Click_Highest_level_of_education(){
        this.college.click();
    }
}
