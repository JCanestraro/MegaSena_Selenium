import java.util.ArrayList;
import java.util.Collections;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MegaSena_Selenium {

    public static void main(String[] args) {
        //abre firefox
        WebDriver driver = new FirefoxDriver();

        //acessa o site do google
        driver.get("http://www.portaldasorte.com/simulador/mega-sena");

        for (int jogada = 0; jogada < 10; jogada++) {
            int numero = 0;
            int[] num;
            num = new int[6];

            ArrayList megasena = new ArrayList();
            long sort = 0;
            int i = 0;

            while (i < 6) {
                sort = Math.round(Math.random() * 59) + 1;
                if (!megasena.contains(sort)) {
                    megasena.add(sort);
                    i++;
                }
            }

            Collections.sort(megasena);

            for (Object l : megasena) {
                WebElement escolha = driver.findElement(By.xpath("//button[contains(text(),'" + l + "')]"));
                escolha.click();
                System.out.print(l + " ");
            }
            System.out.println("\n-x- Resultados:-x-");
            WebElement simula = driver.findElement(By.xpath("//input[@value='Simular']"));
            simula.click();

            try {
                WebElement resultado = driver.findElement(By.xpath("//div[@id='list-sistemas']/div[4]/div/p"));
                String result = resultado.getText();
                System.out.println("resultados: " + result);

                for (int j = 2; j <= 6; j++) {
                    WebElement resultados = driver.findElement(By.xpath("//div[@id='list-sistemas']/div[4]/div[" + j + "]/p/span"));
                    String results = resultados.getText();
                    System.out.println("resultados: " + results);
                }
            } catch (Exception e) {
            }
            System.out.println("\n-x-x-x-x- Fim desta simulação -x-x-x-x-\n");
            
            WebElement limpar = driver.findElement(By.xpath("//div[@id='grupos-left-filtro-box']/form/input[3]"));
            limpar.click();
        }
    }
}
