package edu.pe.ulima.Screems;

import com.badlogic.gdx.Screen;

import edu.pe.ulima.MainApplication;

public abstract class BaseScreem implements Screen {

    protected MainApplication  game ;

    public BaseScreem(MainApplication game ){
        this.game = game;
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
