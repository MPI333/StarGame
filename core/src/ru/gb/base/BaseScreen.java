package ru.gb.base;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class BaseScreen implements Screen, InputProcessor {

    protected SpriteBatch batch;

    @Override
    public void show() {
        System.out.println("show();");
        batch = new SpriteBatch();
        Gdx.input.setInputProcessor(this);
    }

    @Override
    public void render(float delta) {
        ScreenUtils.clear(0f, 0f, 0f, 1f);
    }

    @Override
    public void resize(int width, int height) {
        System.out.println("resize();");
    }

    @Override
    public void pause() {
        System.out.println("pause();");
    }

    @Override
    public void resume() {
        System.out.println("resume();");
    }

    @Override
    public void hide() {
        System.out.println("hide();");
        dispose();
    }

    @Override
    public void dispose() {
        System.out.println("dispose();");
        batch.dispose();
    }

    @Override
    public boolean keyDown(int keycode) {
        System.out.println("keyDown();");
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        System.out.println("keyUp();");
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        System.out.println("keyTyped();");
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchDown();");
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        System.out.println("touchUp();");
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        System.out.println("touchDragged();");
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(float amountX, float amountY) {
        System.out.println("scrolled();");
        return false;
    }

}
