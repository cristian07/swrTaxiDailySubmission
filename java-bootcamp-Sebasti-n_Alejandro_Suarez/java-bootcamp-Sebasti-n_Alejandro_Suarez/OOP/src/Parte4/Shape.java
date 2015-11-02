package Parte4;

public class Shape {
	private String color;
	private boolean filled;
	public Shape(){
		color="red";
		filled=true;
	}
	public Shape(String color,boolean filled){
		this.color=color;
		this.filled=filled;
	}
	public String getColor(){return color;}
	public void setColor(String color){this.color=color;}
	public boolean getFilled(){return filled;}
	public void isFilled(boolean filled){this.filled=filled;}
	public String toString(){
		if (filled==true){
			return "A Shape with color of "+color+" and filled.";
		}
		else{
			return "A Shape with color of "+color+" and Not filled."; 
		}
	}
	
}
