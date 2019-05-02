package gov.goias.paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.net.URI;

public class PaginaPortal {

    /**
     * Driver do selenium, responsável pela localização dos elementos constantes da página.
     */
    WebDriver driver;

    /**
     * Label que contém o título da página.
     */
    @FindBy(xpath=".//*[@id='content']/div/section/div/h2")
    WebElement elementoPagina;

    /**
     * Construtor parametrizado com o driver.
     * @param driver
     */
    public PaginaPortal(WebDriver driver){
        this.driver = driver;
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(factory, this);
    }

    /**
     * Obtem o título da página de sistemas do portal
     * @return
     */
    public String getElementoPagina(){

        return    elementoPagina.getText();
    }

}
