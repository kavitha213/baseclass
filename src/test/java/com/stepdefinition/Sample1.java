package com.stepdefinition;

import java.util.concurrent.TimeUnit;

import com.objectRepository.AddToCart;
import com.objectRepository.FrontPage;
import com.objectRepository.LoginPage;
import com.objectRepository.ProductPage;
import com.resources.BaseClassSample;

import io.cucumber.java.en.*;

public class Sample1 extends BaseClassSample {
	LoginPage s;
	FrontPage f;
	ProductPage p;
	AddToCart a;

//login the application
	@Given("User get the title")
	public void user_get_the_title() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();

	}

	@When("User should enter the username")
	public void user_should_enter_the_username() {
		s = new LoginPage();
		s.getSignIn().click();
		s.getUsername().sendKeys("KavithaK_78");
	}

	@When("User should enter the password")
	public void user_should_enter_the_password() {
		s.getPassword().clear();
		s.getPassword().sendKeys("Kavithak78@");
	}

	@Then("User should login the application")
	public void user_should_login_the_application() {
		s.getLogin().click();
		driver.quit();
	}

//Choose the fish
	@Given("User launch the url")
	public void user_launch_the_url() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
	}

	@When("User choose the fish")
	public void user_choose_the_fish() {
		FrontPage f = new FrontPage();
		f.getFish().click();

	}

	@Then("User should choose the product")
	public void user_should_choose_the_product() {
		ProductPage p = new ProductPage();
		p.getAngleFish().click();
		driver.quit();

	}

//Choose the Dog
	@Given("User get the current url")
	public void user_get_the_current_url() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
	}

	@When("User choose the Dos")
	public void user_choose_the_dos() {
		FrontPage f = new FrontPage();
		f.getDogs().click();

	}

	@Then("User should choose the Dog")
	public void user_should_choose_the_dog() {
		ProductPage p = new ProductPage();
		p.getBulldog().click();
		driver.quit();
	}

//Choose the Cats
	@Given("User Get the url")
	public void user_get_the_url() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
		GetCurrentURL();
	}

	@When("User choose the Cats")
	public void user_choose_the_cats() {
		FrontPage f = new FrontPage();
		f.getCats().click();
	}

	@Then("User should choose the Cat")
	public void user_should_choose_the_cat() {
		ProductPage p= new ProductPage();
		p.getManxCat().click();
		driver.quit();
	}

//Choose the Reptiles
	@Given("User Get the title and url")
	public void user_get_the_title_and_url() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
		GetCurrentURL();
	}

	@When("User choose the Reptiles")
	public void user_choose_the_reptiles() {
		FrontPage f = new FrontPage();
		f.getReptiles().click();
	}

	@Then("User should choose the Reptiles")
	public void user_should_choose_the_reptiles() {
		ProductPage p = new ProductPage();
		p.getRattlesnakeReptiles().click();
		driver.quit();
	}

//Choose the Birds
	@Given("User should get the title")
	public void user_should_get_the_title() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
		GetCurrentURL();
	}

	@When("User choose the Birds")
	public void user_choose_the_birds() {
		FrontPage f = new FrontPage();
		f.getBirds().click();
	}

	@Then("User should choose the Birds")
	public void user_should_choose_the_birds() {
		ProductPage p = new ProductPage();
		p.getFinchBird().click();
		driver.quit();
	}

//Add the fish to cart
	@Given("User get the title for the application")
	public void user_get_the_title_for_the_application() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
		GetCurrentURL();
	}

	@When("User choose the fish in the front page")
	public void user_choose_the_fish_in_the_front_page() {
		FrontPage f = new FrontPage();
		f.getFish().click();
	}

	@Then("User should choose add the fish to cart")
	public void user_should_choose_add_the_fish_to_cart() {
		ProductPage p = new ProductPage();
		p.getAngleFish().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
		driver.quit();

	}

//Add the Dog to cart
	@Given("User launch the application")
	public void user_launch_the_application() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
		GetCurrentURL();
	}

	@When("User choose the Dog in the front page")
	public void user_choose_the_dog_in_the_front_page() {
		FrontPage f = new FrontPage();
		f.getDogs().click();
	}

	@Then("User should choose add the Dog to cart")
	public void user_should_choose_add_the_dog_to_cart() {
		ProductPage p = new ProductPage();
		p.getBulldog().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
		driver.quit();

	}

//Add the Cats to cart
	@Given("User launching the url")
	public void user_launching_the_url() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
		GetCurrentURL();
	}

	@When("User choose the Cats in the front page")
	public void user_choose_the_cats_in_the_front_page() {
		FrontPage f = new FrontPage();
		f.getCats().click();
	}

	@Then("User should add the cat to cart")
	public void user_should_add_the_cat_to_cart() {
		ProductPage p = new ProductPage();
		p.getPersianCat().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
		driver.quit();
	}

//Add the Reptiles to cart
	@Given("User launch the url app")
	public void user_launch_the_url_app() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		GetTitle();
		GetCurrentURL();
	}

	@When("User choose the Reptiles in the front page")
	public void user_choose_the_reptiles_in_the_front_page() {
		FrontPage f = new FrontPage();
		f.getReptiles().click();
	}

	@Then("User should add the Reptiles to cart")
	public void user_should_add_the_reptiles_to_cart() {
		ProductPage p = new ProductPage();
		p.getIguanaReptiles().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
		driver.quit();
	}

//Add the Birds to cart
	@Given("User launching the application url")
	public void user_launching_the_application_url() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("User choose the Birds in the front page")
	public void user_choose_the_birds_in_the_front_page() {
		FrontPage f = new FrontPage();
		f.getBirds().click();

	}

	@Then("User should add the Birds to cart")
	public void user_should_add_the_birds_to_cart() {
		ProductPage p = new ProductPage();
		p.getFinchBird().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
		driver.quit();
	}

//Remove the fish to cart
	@Given("Choose the fish to cart")
	public void choose_the_fish_to_cart() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("User Add the fish to cart")
	public void user_add_the_fish_to_cart() {
		FrontPage f = new FrontPage();
		f.getFish().click();
		ProductPage p = new ProductPage();
		p.getAngleFish().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
	}

	@Then("User Remvoe the fish to cart")
	public void user_remvoe_the_fish_to_cart() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		AddToCart a= new AddToCart();
		a.getRemoveCart().click();
		driver.quit();
	}

//Remove dog to cart
	@Given("Choose the Dog to cart")
	public void choose_the_dog_to_cart() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("User Add the Dog to cart")
	public void user_add_the_dog_to_cart() {
		FrontPage f = new FrontPage();
		f.getDogs().click();
		ProductPage p = new ProductPage();
		p.getBulldog().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();

	}

	@Then("User Remvoe the Dog to cart")
	public void user_remvoe_the_dog_to_cart() {
		AddToCart a = new AddToCart();
		a.getRemoveCart().click();
		driver.quit();
	}

//Remove cat in cart
	@Given("Choose the Cat to cart")
	public void choose_the_cat_to_cart() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("User Add the Cat to cart")
	public void user_add_the_cat_to_cart() {
		FrontPage f = new FrontPage();
		f.getCats().click();
		ProductPage p = new ProductPage();
		p.getManxCat().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
	}

	@Then("User Remvoe the Cat to cart")
	public void user_remvoe_the_cat_to_cart() {
		AddToCart a = new AddToCart();
		a.getRemoveCart().click();
		driver.quit();
	}

//Remove Reptiles in cart
	@Given("Choose the Reptiles to cart")
	public void choose_the_reptiles_to_cart() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("User Add the Reptiles to cart")
	public void user_add_the_reptiles_to_cart() {
		FrontPage f = new FrontPage();
		f.getReptiles().click();
		ProductPage p = new ProductPage();
		p.getIguanaReptiles().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();
	}

	@Then("User Remvoe the Reptiles to cart")
	public void user_remvoe_the_reptiles_to_cart() {
		AddToCart a = new AddToCart();
		a.getRemoveCart().click();
		driver.quit();
	}

//Remove birds in cart
	@Given("Choose the Birds to cart")
	public void choose_the_birds_to_cart() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
		FrontPage f = new FrontPage();
		f.getBirds().click();
	}

	@When("User Add the Birds to cart")
	public void user_add_the_birds_to_cart() {
		ProductPage p = new ProductPage();
		p.getFinchBird().click();
		AddToCart a = new AddToCart();
		a.getAddtocart1().click();

	}

	@Then("User Remvoe the Birds to cart")
	public void user_remvoe_the_birds_to_cart() {
		AddToCart a = new AddToCart();
		a.getRemoveCart().click();
		driver.quit();
	}

//search the fish
	@Given("Launch the app")
	public void launch_the_app() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");

	}

	@When("Enter the fish name")
	public void enter_the_fish_name() {
		AddToCart a = new AddToCart();
		a.getSearchKeyword().click();
		a.getSearchKeyword().sendKeys("Angelfish");
	}

	@Then("click the search button")
	public void click_the_search_button() {
		AddToCart a = new AddToCart();
		a.getSubmit().click();
		driver.quit();
	}

//Search the Dog
	@Given("Launch the jpet app")
	public void launch_the_jpet_app() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("Enter the Dog name")
	public void enter_the_dog_name() {
		AddToCart a = new AddToCart();
		a.getSearchKeyword().sendKeys("Bulldog");
	}

	@Then("click the search")
	public void click_the_search() {
		AddToCart a = new AddToCart();
		a.getSubmit().click();
		driver.quit();
	}

//Search the Cat
	@Given("Launch the pet app")
	public void launch_the_pet_app() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("Enter the Cat name")
	public void enter_the_cat_name() {
		AddToCart a = new AddToCart();
		a.getSearchKeyword().sendKeys("Manx");
	}

	@Then("click the search the")
	public void click_the_search_the() {
		AddToCart a = new AddToCart();
		a.getSubmit().click();
		driver.quit();
	}

//search the Reptiles
	@Given("Launch the pet application")
	public void launch_the_pet_application() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");

	}

	@When("Enter the Reptiles name")
	public void enter_the_reptiles_name() {
		AddToCart a = new AddToCart();
		a.getSearchKeyword().sendKeys("Rattlesnake");
	}

	@Then("click search button")
	public void click_search_button() {
		AddToCart a = new AddToCart();
		a.getSubmit().click();
		driver.quit();
	}

//search the Birds
	@Given("Launch the Jpet application")
	public void launch_the_jpet_application() {
		LaunchBrowser();
		LaunchURL("https://petstore.octoperf.com/actions/Catalog.action");
	}

	@When("Enter the Birds name")
	public void enter_the_Birds_name() {
		AddToCart a = new AddToCart();
		a.getSearchKeyword().sendKeys("Amazon Parrot");
	}

	@Then("click search btn")
	public void click_search_btn() {
		AddToCart a = new AddToCart();
		a.getSubmit().click();
		driver.quit();
	}

}
