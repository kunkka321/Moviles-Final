package edu.pe.ulima.Screems;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.Touchable;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;

import edu.pe.ulima.MainApplication;
import edu.pe.ulima.actors.Hormiga;
import edu.pe.ulima.actors.RegionExample;


public class MainGameScreem extends BaseScreem {

    private Stage stage;
    private Hormiga hormiga;
    private Texture texturaHormiga, textureRegionHormigas;
    private TextureRegion regionHormiga;
    private RegionExample regionExample;

    public MainGameScreem(MainApplication game) {
        super(game);
        //texturaHormiga = new Texture("ants1.png");
        textureRegionHormigas = new Texture("ants1.png");
        regionHormiga = new TextureRegion( textureRegionHormigas , 0, 0, 100, 143);
    }

    @Override
    public void show() {
        stage = new Stage();
        //hormiga = new Hormiga(texturaHormiga);
        regionExample = new RegionExample(regionHormiga);
        Gdx.app.log("Example", "MOSTRANDO");
        System.out.println("MOSTRANDO");
        regionExample.setTouchable(Touchable.enabled);
        regionExample.addListener(new InputListener() {
            public boolean touchDown (InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.log("Example", "LO MATASTE");
                System.out.println("MATO");
                return false;
            }

            public void touchUp (InputEvent event, float x, float y, int pointer, int button) {
                Gdx.app.log("Example", "YA ESTA MUERTO");
            }
        });

        stage.addActor(regionExample);
        //stage.addActor(hormiga);
        //hormiga.setPosition(20, 100);
        regionExample.setPosition(20,100);

    }

    @Override
    public void hide() {
        stage.dispose();
        texturaHormiga.dispose();
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.4f, 0.5f, 0.8f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        stage.act();
        stage.draw();
    }

    @Override
    public void dispose() {
        //texturaHormiga.dispose();
        textureRegionHormigas.dispose();
    }
}
