package structural.flyweight;

import java.awt.*;

public class Oval implements Shape {

    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("Creating Oval object with fill = " + fill);
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
        line.setColor(color);
        line.drawLine(x, y, width, height);

        if(fill){
            circle.fillOval(x, y, width, height);
        }
    }
}
