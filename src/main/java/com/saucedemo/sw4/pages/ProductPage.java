package com.saucedemo.sw4.pages;

import com.saucedemo.sw4.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {


    By errorMessage = By.xpath("//span[contains(text(), 'Products')]");                 //Finding Web element and storing in variable

    By countProduct = By.xpath("//div[@class='inventory_item_img']");                   //Finding Web element and storing in variable

    By list = By.className("inventory_item_name");                                                  //Finding Web element and storing in variable


    public String getErrorMessage()  {
    return getTextFromElement(errorMessage);
    }

    public void verifyThatSixProductsAreDisplayedOnPage() {
        countTheProduct(countProduct);                                                              //Method calling from Utility to count product and print in console
        printNameOfProduct(list);                                                                   //Method calling from Utility to print name in console
        }
    }




