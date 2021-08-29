package ru.gb;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class StarGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture background;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		background = new Texture("space_background.png");
	}

	@Override
	public void render () {
		ScreenUtils.clear(0f, 0f, 0f, 1f);
		batch.begin();
		batch.draw(background, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		background.dispose();
	}
}
