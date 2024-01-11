package StepDefinitions;

import Utulities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;


public class Hooks { // Senaryonun başına ve sonuna kanca attım.Hooks

    @Before // cucumberdan alıyorum
    public void before()
    {
        System.out.println("Senaryo Başladı");
    }


    @After // cucumberdan alıyorum.
    public void after()
    {
        System.out.println("Senaryo Bitti");
        GWD.quitDriver();

    }
}
