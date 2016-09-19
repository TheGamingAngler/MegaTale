package com.mygame.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.mygame.megatale.Main;
import com.mygame.universe.Universe;

public class PlayState implements Screen {

	
	public Main main;
	public Universe universe;
	public PlayState(Main main) {
		this.main = main;
		
	}

	@Override
	public void show() {
		universe = new Universe(3, 2);
		universe.init();
	}

	@Override
	public void render(float delta) {
		universe.render(delta);
	}

	@Override
	public void resize(int width, int height) {
		universe.getPlayer().getCamara().viewportWidth = width;
		universe.getPlayer().getCamara().viewportHeight = height;
		universe.getPlayer().getCamara().update();
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {
		universe.dispose();
	}

}
