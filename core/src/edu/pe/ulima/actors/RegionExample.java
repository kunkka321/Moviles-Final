package edu.pe.ulima.actors;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;


public class RegionExample extends Actor{

    private TextureRegion region;

    public RegionExample(TextureRegion region) {
        this.region = region;
        setSize(region.getRegionWidth(),region.getRegionHeight());
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
       batch.draw(region,getX(),getY());
    }

    @Override
    public void act(float delta) {
        setY(getY() + 250 * delta);
    }

    @Override
    public Actor hit(float x, float y, boolean touchable) {

    }
}
