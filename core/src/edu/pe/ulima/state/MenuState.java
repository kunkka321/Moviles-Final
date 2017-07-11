package edu.pe.ulima.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * Created by mbernedo on 10/07/2017.
 */

public class MenuState extends GameState {

    private Texture mTexBackground;
    private Texture mTexButton;
    private Texture mTexTitle;


    public MenuState(GameStateManager gsm) {
        super(gsm);
        mTexBackground = new Texture("bg_game5.jpg");
        mTexButton = new Texture("start1.png");
        mTexTitle = new Texture("title.png");
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            mGSM.set(new PlayState(mGSM));
        }
    }

    @Override
    public void update(float dt) {
        handleInput();
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(mCam.combined);
        sb.begin();
        sb.draw(mTexBackground, 0, 0, mCam.viewportWidth, mCam.viewportHeight);
        sb.draw(mTexButton, 0, 0, mCam.viewportWidth, mCam.viewportHeight - (mCam.viewportHeight / 2));
        sb.draw(mTexTitle, 0, mCam.viewportHeight / 2, mCam.viewportWidth, mCam.viewportHeight - (mCam.viewportHeight / 2));
        sb.end();
    }

    @Override
    public void dispose() {
        mTexBackground.dispose();
        mTexButton.dispose();
    }
}
