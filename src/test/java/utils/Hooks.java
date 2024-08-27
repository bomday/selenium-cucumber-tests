package utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void init(){
        BrowserDriver.initialize();  // Inicializa o driver
    }

    @After
    public void finish(){
        BrowserDriver.close();
    }
}