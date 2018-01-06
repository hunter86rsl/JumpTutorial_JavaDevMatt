package com.test.jumptutorial;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class JumpPlayer extends Rectangle{

	private Sound jumpSound;
	private Texture texture;
	public boolean canJump = true;
	
	public float jumpVelocity;

	public JumpPlayer(Texture texture, Assets assets) {
		this.texture = texture;
		this.height = texture.getHeight();
		this.width = texture.getWidth();
		
//		jumpSound = Gdx.audio.newSound(Gdx.files.internal("jump.ogg"));
		jumpSound = assets.manager.get("jump.ogg", Sound.class);
	}
	
	public void draw(SpriteBatch batch) {
		batch.draw(texture, x, y);
	}
	
	public void jump() {
		if (canJump && jumpVelocity >= -100) {
			jumpVelocity += 800;
			canJump = false;
			jumpSound.play();
		}
	}
}
