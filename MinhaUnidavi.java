
package selenium;

import java.util.concurrent.TimeUnit;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.support.ui.Select;


public class Selenium { 


    public static void main(String[] args) {
        
    
             WebDriver driver  = new FirefoxDriver();            
             driver.get("http://www.minha.unidavi.edu.br");            
             WebElement usuario = driver.findElement(By.name("UWS_FRM_USR_NOME"));
             WebElement senha = driver.findElement(By.name("UWS_FRM_USR_SENHA"));
             WebElement acao = driver.findElement(By.name("acao"));
         
             usuario.sendKeys("USUARIO_MINHA_UNIDAVI");       
             senha.sendKeys("SENHA_MINHA_UNIDAVI"); 
            

             acao.submit();
             
             //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
             
             WebElement salaVirtual = driver.findElement(By.linkText("Sala Virtual"));
             salaVirtual.click();
             
             WebElement semestre = driver.findElement(By.linkText("22014"));
             semestre.click();
             
             WebElement materia = driver.findElement(By.partialLinkText("Tópicos Avançados"));
             materia.click();
             
             WebElement trabalhos = driver.findElement(By.linkText("Trabalhos"));
             trabalhos.click();
             
             WebElement midiatecapessoal = driver.findElement(By.linkText("Midiateca Pessoal"));
             midiatecapessoal.click();
             
             WebElement cadastraNovoArquivo = driver.findElement(By.linkText("Cadastrar Novo Arquivo"));
             cadastraNovoArquivo.click();
             
             WebElement titulo = driver.findElement(By.name("titulo"));
             titulo.sendKeys("foto");
             
             WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
             upload.sendKeys("/home/eu.jpg");
             
             Select selecionaGrupo = new Select(driver.findElement(By.name("grupo")));
             selecionaGrupo.selectByVisibleText("Novo Pasta");
             
             WebElement nomeNovoGrupo = driver.findElement(By.name("nomenovogrupo"));
             nomeNovoGrupo.sendKeys("Marcelo , Jean , Davi");
             
             WebElement cadastrar = driver.findElement(By.name("cadastrar"));
             
             cadastrar.submit();
       } 
    

}
