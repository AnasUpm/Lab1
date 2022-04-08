package week1;

import java.util.ArrayList;

public class TestRectangle2 extends TestRectangle {
	
	//Rectangle[] myRect = new Rectangle[10];
	int NUM_RECTANGLES = 5;

	ArrayList<Rectangle> rect = new ArrayList<Rectangle>();
	{
	for(int i=1;i<NUM_RECTANGLES;i++) {
		
		Rectangle R = new Rectangle();
		R.length+=5;
		R.width+=4;
		R.getArea();
		R.getPerimeter();
		rect.add(R);
	}
	System.out.println(rect);
	}
}
