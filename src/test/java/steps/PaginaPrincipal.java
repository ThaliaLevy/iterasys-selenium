package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.junit.Assert.assertTrue;

public class PaginaPrincipal extends Base {
    private Base base;

    public PaginaPrincipal(Base base) {
        this.base = base;
    }

    @Given("^abriu o site$")
    public void abriuOSite() {
        base.driver.get(base.url);
    }

    @When("^preencheu o campo de busca com \"([^\"]*)\"$")
    public void preencheuOCampoDeBuscaCom(String texto) {
        base.driver.findElement(By.cssSelector("#searchInput")).sendKeys(texto);
    }

    @And("^clicou na lupa da pesquisa$")
    public void clicouNaLupaDaPesquisa() {
        base.driver.findElement(By.cssSelector("#searchform > button")).click();
    }

    @Then("^mostrou o resultado da busca \"([^\"]*)\"$")
    public void mostrouOResultadoDaBusca(String texto) {

        assertTrue(base.driver.getTitle().contains(texto));
    }
}
