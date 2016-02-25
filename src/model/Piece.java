package model;

import java.awt.Color;

public class Piece {

	private int x;
	private int y;
	private final Color color;
	
	public Piece (int x, int y, Color color){
		this.x = x;
		this.y = y;
		this.color = color;
	}
	
	public int getX(){
		return x;
	}
	
	public int getPosition(){
		return x*9+y;
	}		
	
	public int getY(){
		return y;
	}
	
	public Color getColor(){
		return color;
	}
	
	public int getScreenX(){
		int index = this.getPosition();
		return Board.nodes[index].getX();
		
		/*for (int x = 0; x < 45; x++){
			if (Board.nodes[x].getPosition() == this.getPosition()){
				return Board.nodes[x].getX();
			}
		}
		return -1;*/
	}
	
	public int getScreenY(){
		int index = this.getPosition();
		return Board.nodes[index].getY();
		
		/*for (int x = 0; x < 45; x++){
			if (Board.nodes[x].getPosition() == this.getPosition()){
				return Board.nodes[x].getY();
			}
		}
		return -1;*/
	}
	
	public void movePosition(int x, int y){
		this.x = x;
		this.y = y;
	}
}
