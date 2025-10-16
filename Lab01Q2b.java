

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alanpo
 */
public class Lab01Q2b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape shapes[] = new Shape[5];
        shapes[0] = new Rectangle(10, 5, new Point(3,7));
        shapes[1] = new Circle(6, new Point(8,2));
        shapes[2] = new Rectangle(3, 9, new Point(1,5));
        shapes[3] = new Circle(4, new Point(9,1));
        shapes[4] = new Circle(7, new Point(6,3));
        
        for(Shape s:shapes){
            ClientShape.doAction(s);
        }    
    }
    
}
