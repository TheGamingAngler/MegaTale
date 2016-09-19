package com.mygame.universe;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class Player {

	public OrthographicCamera camara;
	
	public void init(){
		camara = new OrthographicCamera(720 * 2, 520 * 2);
	}
	
	public void render(SpriteBatch batch, float delta){
		
	}
	
	public void dispose(){
		
	}
	
	public OrthographicCamera getCamara() {
		return camara;
	}
	
	public Vector3 getWorldMouseLocation() {
		return camara.unproject(new Vector3(Gdx.input.getX(), Gdx.input.getY(), 0));
	}
}
