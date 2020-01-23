package edu.eci.cvds.patterns.shapes;
import edu.eci.cvds.patterns.shapes.concrete.*;


public class ShapeFactory {

    public static Shape create(RegularShapeType shapeType) {
		switch(shapeType){
			case Triangle:
				return new Triangle();
				break;
				
			case Pentagon:
				return new Pentagon();
				break;
				
			case Hexagon:
				return new Hexagon();
				break;
				
			case Quadrilateral:
				return new Quadrilateral();
				break;
				
			default: 
				break;
		}

    }

}