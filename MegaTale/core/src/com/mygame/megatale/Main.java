package com.mygame.megatale;

import com.badlogic.gdx.Game;
import com.mygame.states.PlayState;

public class Main extends Game {
	
	@Override
	public void create () {
		setScreen(new PlayState(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
	}
}
