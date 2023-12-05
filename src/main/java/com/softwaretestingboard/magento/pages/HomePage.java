package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By women  = By.xpath("//span[normalize-space()='Women']");
    By tops = By.xpath("//a[@id='ui-id-9']//span[contains(text(),'Tops')]");
    By jacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");


    String sortAToZ = "Name (A - Z)";
    String sortZToA = "Name (Z - A)";
    By men = By.xpath("//span[normalize-space()='Men']");
    By bottom = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By pants = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gear = By.cssSelector("a[id='ui-id-6'] span:nth-child(2)");
By bags = By.xpath("//span[normalize-space()='Bags']");

    public void mouseHoverOnWomen(){
mouseHoverToElement(women);
    }
    public void mouseHoverOnTops(){
        mouseHoverToElement(tops);
    }
    public void clickOnJackets(){
        clickOnElement(jacket);
    }





    //public void selectSortByAToZ() {
      //  selectByVisibleTextFromDropDown(dropDownPath, sortAToZ);
    //}

    //public void selectSortByZToA() {
     //   selectByVisibleTextFromDropDown(dropDownPath, sortZToA);
    //}
    public void mouseHoverOnMen(){
        mouseHoverToElement(men);
    }
    public void mouseHoverOnBottom(){
        mouseHoverToElement(bottom);
    }
    public void clickOnPants(){
        clickOnElement(pants);
    }
    public void mouseHoverOnGear(){
        mouseHoverToElement(gear);
    }
    public void clickOnBags(){
        clickOnElement(bags);
    }

}
