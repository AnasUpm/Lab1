package week1;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class TestRectangle {
	private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
    	Rectangle[] rectangleArray;
    	rectangleArray = createRectangleArray();
    	
    	
    	
    	printRectArray(rectangleArray);
        
   }

	public static Rectangle[] createRectangleArray() {
		Rectangle[] rectangleArray = new Rectangle[10];
    	
    	for(int i=0; i<rectangleArray.length; i++) {
    		//create 10 rectangles with 10 random generated numbers
    		rectangleArray[i]= new Rectangle((Math.random()*50.00)+1.00,(Math.random()*50.00)+1.00);
    	//System.out.println(rectangleArray[i].width);
    		
    	}
    	return rectangleArray;
    	
    		
    }
    public static void printRectArray(Rectangle[] rectangleArray) {
    	//print the rectangles and the properties
    	int j=1;
    	for(int i = 0; i<rectangleArray.length;i++) {
    		
    		System.out.println("rectangle "+j+"\t length : "+df.format(rectangleArray[i].length)+"\t width : "+df.format(rectangleArray[i].width)+"\t area : "
    				+df.format(rectangleArray[i].getArea())+"\t perimeter : "+df.format(rectangleArray[i].getPerimeter()));
    		j++;
    	}
    }
    
}
class Rectangle{
    // define two fields
    double length, width;
    // define no arg constructor
    Rectangle()
    {
        length = 1.00;
         width = 1.00;
    }
   
   
    // define parameterized constructor
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width  = width;
    }
    // define a method to return area
    double getArea()
    {
        return (length * width);
    }
    // define a method to return perimeter
    double getPerimeter()
    {
        return (2 * (length + width));
    }
    

}