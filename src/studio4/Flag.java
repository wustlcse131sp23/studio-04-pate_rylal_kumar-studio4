package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color blue = new Color (3, 169, 252);
		StdDraw.setPenColor(blue);
		StdDraw.filledRectangle(0.5, 0.5, 0.42, 0.3);
	
		
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5, 0.5, 0.42, 0.3);
		
		Color purply = new Color (250, 0, 255);
		StdDraw.setPenColor(purply);
		StdDraw.setPenRadius(0.4);
		StdDraw.point(0.5, 0.5);
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.setPenRadius(0.35);
		StdDraw.point(0.5, 0.5);
		
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.setPenRadius(0.3);
		StdDraw.point(0.5, 0.5);

		StdDraw.setPenColor(Color.YELLOW);
		StdDraw.setPenRadius(0.25);
		StdDraw.point(0.5, 0.5);
		
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.setPenRadius(0.25);
		StdDraw.point(0.5, 0.5);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.setPenRadius(0.20);
		StdDraw.point(0.5, 0.5);
	}
}