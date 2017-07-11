package edu.pe.ulima.state;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import edu.pe.ulima.MainApplication;

/**
 * Created by mbernedo on 10/07/2017.
 */

public abstract class GameState {

    protected OrthographicCamera mCam;
    protected GameStateManager mGSM;

    public GameState(GameStateManager gsm) {
        mGSM = gsm;
        mCam = new OrthographicCamera();
        mCam.setToOrtho(false, MainApplication.GAME_WIDTH / 2, MainApplication.GAME_HEIGHT / 2);
    }

    public abstract void handleInput();

    public abstract void update(float dt);

    public abstract void render(SpriteBatch sb);

    public abstract void dispose();
}
