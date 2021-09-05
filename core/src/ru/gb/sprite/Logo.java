package ru.gb.sprite;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;

import ru.gb.base.Sprite;
import ru.gb.math.Rect;

public class Logo extends Sprite {

    private static final float H = 0.25f;
    private static final float VELOCITY_LENGTH = 0.01f;

    private Vector2 velocity;
    private Vector2 touch;
    private Vector2 temporary;

    public Logo(Texture texture) {
        super(new TextureRegion(texture));
    }

    @Override
    public void resize(Rect worldBounds) {
        setHeightProportion(H);
        velocity = new Vector2();
        touch = new Vector2();
        temporary = new Vector2();
    }

    @Override
    public void update(float delta) {
        temporary.set(touch);
        if (temporary.sub(pos).len() > VELOCITY_LENGTH) {
            pos.add(velocity);
        } else {
            pos.set(touch);
        }
    }

    @Override
    public boolean touchDown(Vector2 touch, int pointer, int button) {
        this.touch.set(touch);
        velocity.set(touch.cpy().sub(pos)).setLength(VELOCITY_LENGTH);
        return false;
    }

}
