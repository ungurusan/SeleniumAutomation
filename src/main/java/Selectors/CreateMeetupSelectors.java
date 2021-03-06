package Selectors;

/**
 * Created by Alin on 10/11/2016.
 */
public class CreateMeetupSelectors {

    static public String nextButton = "a[class=\"button--desktopNext j-next-panel button button--primary\"]";
    static public String nextStepButton = "button[class=\"j-default-mode  nav-button j-next-panel button button--primary button--desktopNext\"]";
    static public String submitButton = "button[class=\"j-default-mode  nav-button j-next-panel button button--primary button--desktopNext name-description-form--submit\"]";
    static public String newTechnology = "label[aria-label=\"Hiking\"]";
    static public String meetupNameBox = "input[name=\"name\"]";
    static public String meetupDescriptionBox = "textarea[name=\"short_desc\"]";
    static public String agreeContinue = "input[class=\"button button--primary button--desktopNext margin--top margin--bottom  j-no-validation\"]";

    static public  String step1 = "//*[contains(text(),'Step 1 of 4')]";
    static public  String step2 = "//*[contains(text(),'Step 2 of 4')]";
    static public  String step3 = "//*[contains(text(),'Step 3 of 4')]";
    static public  String step4 = "//*[contains(text(),'Step 4 of 4')]";
}
