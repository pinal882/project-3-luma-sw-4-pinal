package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class BagsPage extends Utility {
    By overnightduffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
By overnightduffletext = By.xpath("//span[@class='base']");
By changeqty = By.xpath("//input[@id='qty']");
By addtocart = By.xpath("//span[normalize-space()='Add to Cart']");
By shoppingcart = By.xpath("//a[normalize-space()='shopping cart']");

    public void clickOnProductNameOvernightDuffle(){
        clickOnElement(overnightduffle);
    }
    public String VerifyTextOvernightDuffle(){
        return getTextFromElement(overnightduffletext);
    }
    public String changeQty3(String qty){
        return getTextFromElement(changeqty);
    }
    public void clickOnAddToCartButton(){
        clickOnElement(addtocart);
    }
    public void clickOnShoppingCart(){
        clickOnElement(shoppingcart);
    }

    }

