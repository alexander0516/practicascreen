
package co.com.bancolombia.certification.googlesuite.stepdefinitions;

import org.openqa.selenium.WebDriver;

import co.com.bancolombia.certification.googlesuite.tasks.GoTo;
import co.com.bancolombia.certification.googlesuite.tasks.OpenTheBrowser;
import co.com.bancolombia.certification.googlesuite.tasks.Translate;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleAppsComponent;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleHomePage;
import co.com.bancolombia.certification.googlesuite.userinterfaces.GoogleTranslatePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

import net.serenitybdd.screenplay.QuestionConsequence;

public class GoogleTranslateStepDefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	
	private Actor susan = Actor.named("susan");
	
	private GoogleHomePage googleHomePage;
	
	@Before
	public void setUp(){
		susan.can(BrowseTheWeb.with(herBrowser));
	}
		
	@Given("^that que susan wants to translate a word$")
	public void thatQueSusanWantsToTranslateAWord() throws Exception {
	  
		susan.wasAbleTo(OpenTheBrowser.on(googleHomePage));
	    susan.wasAbleTo(GoTo.theApp(GoogleAppsComponent.GOOGLE_TRANSLATE));
	}

	@When("^she translates the word cheese from English to Spanish$")
	public void sheTranslatesTheWordCheeseFromEnglishToSpanish() throws Exception {
	  		
		susan.wasAbleTo(Translate.the());
		
	}

	@Then("^she should see the word queso in the screen$")
	public void sheShouldSeeTheWordQuesoInTheScreen() throws Exception {
	  //Consecuencias: aparece la palabra traducida --> Verificarlo
		////*[@id="result_box"]/span
	/*    String selectedValue = BrowseTheWeb.as(susan)
                .findBy("[@id='result_box']/span")   
                .getText();
	    System.out.println("=======================================================");
	    System.out.println("Valor de la caja de texto resultado traduccion: " + selectedValue);
	    System.out.println("=======================================================");*/
		
	//	susan.should(seeThat(,));
	//		susan.should(seeThat(GoogleTranslatePage.TARGET_LANGUAGE_TEXTAREA,);
	//	susan.should(seeThat(susan.f,));
	    
	//dana.should(seeThat(the(NewTodoForm.NEW_TODO_FIELD)), containsText("Feed the cat")));
	//	susan.should(seeThat(the(GoogleTranslatePage.TARGET_LANGUAGE_TEXTAREA.getName())),containsText("queso"));
	
	}
}
