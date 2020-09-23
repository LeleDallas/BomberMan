package it.bomberman.entity.creature;

import java.awt.Graphics;

import it.bomberman.collisions.ICollidable;

public interface Entity extends ICollidable{
	
	public void tick();

	public void render(Graphics g);

}
