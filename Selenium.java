package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumGitHub {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://github.com/");
        
        
        WebElement login = driver.findElement(By.linkText("/login"));
        login.click();
        
        WebElement usuario = driver.findElement(By.id("login_field"));
        WebElement senha = driver.findElement(By.id("password"));
        WebElement acao = driver.findElement(By.name("commit"));

        usuario.sendKeys("davi.phoffmann@gmail.com");
        senha.sendKeys("213123213213213");
        
        acao.submit();
        
        WebElement repositorio = driver.findElement(By.className("header-nav-link"));
        repositorio.click();

//        WebElement salaVirtual = driver.findElement(By.linkText("Sala Virtual"));
//        salaVirtual.click();
//
//        WebElement semestre = driver.findElement(By.linkText("22014"));
//        semestre.click();
//
//        WebElement materia = driver.findElement(By.partialLinkText("Tópicos Avançados"));
//        materia.click();
//
//        WebElement trabalhos = driver.findElement(By.linkText("Trabalhos"));
//        trabalhos.click();
//
//        WebElement midiatecapessoal = driver.findElement(By.linkText("Midiateca Pessoal"));
//        midiatecapessoal.click();
//
//        WebElement cadastraNovoArquivo = driver.findElement(By.linkText("Cadastrar Novo Arquivo"));
//        cadastraNovoArquivo.click();
//
//        WebElement titulo = driver.findElement(By.name("titulo"));
//        titulo.sendKeys("foto");
//
//        WebElement upload = driver.findElement(By.xpath("//input[@type='file']"));
//        upload.sendKeys("/home/eu.jpg");
//
//        Select selecionaGrupo = new Select(driver.findElement(By.name("grupo")));
//        selecionaGrupo.selectByVisibleText("Novo Pasta");
//
//        WebElement nomeNovoGrupo = driver.findElement(By.name("nomenovogrupo"));
//        nomeNovoGrupo.sendKeys("Marcelo , Jean , Davi");
//
//        WebElement cadastrar = driver.findElement(By.name("cadastrar"));

//        cadastrar.submit();
    }

}
