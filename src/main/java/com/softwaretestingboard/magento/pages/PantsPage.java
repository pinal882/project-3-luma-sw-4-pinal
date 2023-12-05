package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class PantsPage extends Utility {

    By productnamecronusyogapant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By size = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']");
    By colour = By.xpath("//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']");
    By addtocart = By.xpath("//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]");
    By text = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public void mouseHoverOnProductName(){
        mouseHoverToElement(productnamecronusyogapant);
    }
    public void clickOnSize(){
        clickOnElement(size);
    }
    public void clickOnColour(){
        clickOnElement(colour);
    }
    public void clickonAddToCart(){
        clickOnElement(addtocart);
    }
    public String verifyText(){
        return getTextFromElement(text);
    }
}
