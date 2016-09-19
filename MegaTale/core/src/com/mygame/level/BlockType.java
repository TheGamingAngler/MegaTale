package com.mygame.level;

public enum BlockType {
	
	Grass_1("Grass_1.png", false),
	Grass_2("Grass_2.png", false);
	
	private String textureName;
	private boolean isSolid;
	
	private BlockType(String textureName, boolean isSolid) {
		this.textureName = textureName;
		this.isSolid = isSolid;
	}
	
	public boolean isSolid() {
		return isSolid;
	}
	
	public String getTextureName() {
		return textureName;
	}
}
