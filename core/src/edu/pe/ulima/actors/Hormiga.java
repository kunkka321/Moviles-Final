package edu.pe.ulima.actors;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;



public class Hormiga extends Actor {

    private Texture hormiga;

    public Hormiga(Texture hormiga) {
        this.hormiga = hormiga;
    }

    @Override
    public void act(float delta) {
        super.act(delta);
    }

    @Override
    public void draw(Batch batch, float parentAlpha) {
        batch.draw(hormiga, getX() , getY(

        ));
    }
}
