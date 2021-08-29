package co.in.oop;

public abstract  class shape {
	
	private String color=null;
	private int borderwidth=0;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public void setBorderwidth(int borderwidth) {
		this.borderwidth = borderwidth;
	}
	
	
	public  abstract double area();

}
