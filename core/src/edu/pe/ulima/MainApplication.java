package edu.pe.ulima;


import com.badlogic.gdx.Game;

import edu.pe.ulima.Screems.MainGameScreem;


public class MainApplication extends Game {


    @Override
    public void create() {
        setScreen(new MainGameScreem(this));
    }
}
