package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    /** Mouse Hover on Women Menu
     * Mouse Hover on Tops
     * Click on Jackets*/
    By dropDownWomen= By.xpath("//span[contains(text(),'Women')]");
    By dropDownTops = By.xpath("//a[@id='ui-id-9']");
    By productWomenLink = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    /** Mouse Hover on Men Menu
     * Mouse Hover on Bottoms
     * Clicks on Pants*/
    By dropDownMenu= By.xpath("//span[normalize-space()='Men']");
    By dropDownBottoms = By.xpath("//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]");
    By productMenLink = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");

    /** Mouse Hover on Gear Menu
     * Clicks on Bags
     * Click on Product Name ‘Overnight Duffle*/
    By dropDownGear= By.xpath("//span[contains(text(),'Gear')]");
    By dropDownBags = By.xpath("//span[contains(text(),'Bags')]");


    public void clickOnDropdownWomen()
    {
        mouseHoverActionForThree(dropDownWomen,dropDownTops,productWomenLink);
        waitUntilVisibilityOfElementLocated(By.xpath("//span[contains(text(),'Women')]"),5);
    }

    public void clickOnDropdownMen()
    {
        mouseHoverActionForThree(dropDownMenu,dropDownBottoms,productMenLink);
    }

    public void clickOnDropdownGear()
    {
        mouseHoverAction(dropDownGear,dropDownBags);
    }


}
