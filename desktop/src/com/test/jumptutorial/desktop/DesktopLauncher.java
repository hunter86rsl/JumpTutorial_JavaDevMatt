package com.test.jumptutorial.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.test.jumptutorial.JumpTutorial;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = 480;
		config.height = 800;
		config.resizable = false;
		
		new LwjglApplication(new JumpTutorial(), config);
	}
}
