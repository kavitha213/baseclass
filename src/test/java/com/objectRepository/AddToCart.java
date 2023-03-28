package com.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.resources.BaseClassSample;

public class AddToCart extends BaseClassSample {

	public AddToCart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//td//a[text()='Add to Cart'])[1]")
	private WebElement Addtocart1;
	@FindBy(xpath = "(//td//a[text()='Add to Cart'])[2]")
	private WebElement addtocart2;
	@FindBy(xpath = "//td//a[text()='Remove']")
	private WebElement RemoveCart;

	@FindBy(xpath = "//input[@name='keyword']")
	private WebElement SearchKeyword;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public WebElement getAddtocart1() {
		return Addtocart1;
	}

	public void setAddtocart1(WebElement addtocart1) {
		Addtocart1 = addtocart1;
	}

	public WebElement getAddtocart2() {
		return addtocart2;
	}

	public void setAddtocart2(WebElement addtocart2) {
		this.addtocart2 = addtocart2;
	}

	public WebElement getRemoveCart() {
		return RemoveCart;
	}

	public void setRemoveCart(WebElement removeCart) {
		RemoveCart = removeCart;
	}

	public WebElement getSearchKeyword() {
		return SearchKeyword;
	}

	public void setSearchKeyword(WebElement searchKeyword) {
		SearchKeyword = searchKeyword;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
}
