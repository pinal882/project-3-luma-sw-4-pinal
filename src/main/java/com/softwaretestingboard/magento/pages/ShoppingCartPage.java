package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By shoppingcart = By.xpath("//a[normalize-space()='shopping cart']");
    By shoppingcarttext = By.xpath("//span[@class='base']");
    By cronusyogapanttext = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By sizetext = By.xpath("//dd[contains(text(),'32')]");
    By colourtext = By.xpath("//dd[contains(text(),'Black')]");
    By productname = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By qty = By.xpath("//input[@value='3']");//By.xpath("//input[@class='input-text qty']");
    By price = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By changeqty = By.xpath("//input[@value='3']");
    By updateshoppingcart = By.xpath("//span[text()='Update Shopping Cart']");
    By price$225 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");

    public void clickOnShoppingCart() {
        clickOnElement(shoppingcart);
    }

    public String verifyShoppingCartText() {
        return getTextFromElement(shoppingcarttext);
    }

    public String verifyCronusYogaPantText() {
        return getTextFromElement(cronusyogapanttext);
    }

    public String verifySizeText() {
        return getTextFromElement(sizetext);
    }

    public String verifyColourText() {
        return getTextFromElement(colourtext);
    }

    public String verifyProductNameCronusYogaPant() {
        return getTextFromElement(productname);
    }

    public String getQty3() {
        String qty = driver.findElement(changeqty).getAttribute("value");
        return qty;

       // return getTextFromElement(qty);
    }

    public String verifyPrice() {
        return getTextFromElement(price);
    }


        public String changeQty5(String qty){
        return getTextFromElement(changeqty);
         }
        public void clickOnUpdateShoppingCart() {
            clickOnElement(updateshoppingcart);
        }

        public String verifyPrice$225 () {
            return getTextFromElement(price$225);
        }
    }


