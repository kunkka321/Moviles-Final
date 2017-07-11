package edu.pe.ulima.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import edu.pe.ulima.MainApplication;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = MainApplication.GAME_WIDTH;
		config.height = MainApplication.GAME_HEIGHT;
		new LwjglApplication(new MainApplication(), config);
	}
}
