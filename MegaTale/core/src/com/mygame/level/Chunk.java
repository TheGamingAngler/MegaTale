package com.mygame.level;

import java.util.concurrent.CopyOnWriteArrayList;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;

public class Chunk {
	
	private CopyOnWriteArrayList<Block> chunk_blocks;
	private Vector2 chunk_location = new Vector2();
	private int chunkSize = 16;
	
	public Chunk(float c_xpos, float c_ypos) {
		this.chunk_location.x = c_xpos;
		this.chunk_location.y = c_ypos;
				
	}


	public void init() {
		
		chunk_blocks = new CopyOnWriteArrayList<Block>();
		
		for(int x = 0; x < chunkSize;x++){
			for(int y = 0; y < chunkSize;y++){
				chunk_blocks.add(new Block((int)chunk_location.x + x * 16, (int) chunk_location.y + y * 16, BlockType.Grass_1));
			}
		}
	}
	
	public void render(SpriteBatch batch, float delta) {
		for(Block block : chunk_blocks){
			block.render(batch, delta);
		}
		
	}

	public void dispose() {
		for(Block block : chunk_blocks){
			block.dispose();
		}
	}
	
	public CopyOnWriteArrayList<Block> getChunk_blocks() {
		return chunk_blocks;
	}

}
