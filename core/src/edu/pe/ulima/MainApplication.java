package edu.pe.ulima;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import edu.pe.ulima.state.GameStateManager;
import edu.pe.ulima.state.MenuState;

public class MainApplication extends ApplicationAdapter {
    private SpriteBatch batch;
    private GameStateManager mGSM;
    public static final int GAME_WIDTH = 480;
    public static final int GAME_HEIGHT = 800;

    @Override
    public void create() {
        batch = new SpriteBatch();
        mGSM = new GameStateManager();
        Gdx.gl.glClearColor(1, 0, 0, 1);
        mGSM.push(new MenuState(mGSM));
    }

    @Override
    public void render() {
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        mGSM.update(Gdx.graphics.getDeltaTime());
        mGSM.render(batch);
    }

    @Override
    public void dispose() {
        batch.dispose();
    }
}
