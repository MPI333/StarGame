package ru.gb.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

import ru.gb.base.BaseScreen;

public class MenuScreen extends BaseScreen {

    private Texture background;
    private Texture img;

    private Vector2 position;
    private Vector2 tmp_position;
    private Vector2 touch;
    private Vector2 v;

    private final static float V_LEN = 0.5f;

    @Override
    public void show() {
        super.show();
        background = new Texture("space_background.png");
        img = new Texture("badlogic.jpg");
        position = new Vector2(0, 0);
        tmp_position = new Vector2(0, 0);
        touch = new Vector2(0, 0);
        v = new Vector2();
    }

    @Override
    public void render(float delta) {
        super.render(delta);
        tmp_position.set(touch);
        if (tmp_position.sub(position).len() > V_LEN) {
            position.add(v);
        } else {
            position.set(touch);
        }
        batch.begin();
        batch.draw(background, 0, 0);
        batch.draw(img, position.x, position.y);
        batch.end();
    }

    @Override
    public void dispose() {
        super.dispose();
        img.dispose();
        background.dispose();
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        touch.set(screenX, Gdx.graphics.getHeight() - screenY);
        v.set(touch.cpy().sub(position).setLength(V_LEN));
        return super.touchDown(screenX, screenY, pointer, button);
    }

}
