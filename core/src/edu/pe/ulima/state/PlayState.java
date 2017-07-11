package edu.pe.ulima.state;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

/**
 * Created by mbernedo on 10/07/2017.
 */

public class PlayState extends GameState {

    private Texture mTextBackground;
    private Texture mImg;
    Random randito = new Random();
    int num = randito.nextInt(3) + 1;

    public PlayState(GameStateManager gsm) {
        super(gsm);
        mTextBackground = new Texture("bg_game1.jpg");
        if (num == 1) {
            mImg = new Texture("hormiga1.PNG");
        } else if (num == 2) {
            mImg = new Texture("hormiga2.PNG");
        } else if (num == 3) {
            mImg = new Texture("alacran.PNG");
        }
    }

    @Override
    public void handleInput() {
        if (Gdx.input.justTouched()) {
            if (num == 1) {
            } else if (num == 2) {
                mImg = new Texture("hormiga2dead.PNG");
            } else if (num == 3) {
                mImg = new Texture("alacrandead.PNG");
            }
        }
    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.setProjectionMatrix(mCam.combined);
        sb.begin();
        sb.draw(mTextBackground, 0, 0, mCam.viewportWidth, mCam.viewportHeight);
        sb.draw(mImg, 0, mCam.viewportHeight/2, mCam.viewportWidth-(mCam.viewportWidth/3), mCam.viewportHeight-(mCam.viewportHeight/3));
        sb.end();
    }

    @Override
    public void dispose() {
        mTextBackground.dispose();
    }
}
