/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-310);
        window.moveVertical(-150);
        window.changeSize(1000);
        //window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        //roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        //sun.makeVisible();
        
        wall = new Square();
        wall.changeColor("red");
        wall.moveHorizontal(0);
        wall.moveVertical(0);
        wall.changeSize(10);
        //wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(0);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-130);
        wall.moveVertical(0);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-120);
        wall.moveVertical(0);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//THE LAST PIXEL AT THE TOP
        wall.changeColor("black");
        wall.moveHorizontal(-90);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-140);
        wall.moveVertical(10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-150);
        wall.moveVertical(30);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-150);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-150);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-150);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-140);
        wall.moveVertical(70);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-140);
        wall.moveVertical(80);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-150);
        wall.moveVertical(80);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-150);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-150);
        wall.moveVertical(100);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-140);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//Start Eye
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-120);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-120);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-120);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//End right Corner of Eye
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//Start Smile
        wall.changeColor("black");
        wall.moveHorizontal(-120);
        wall.moveVertical(80);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-120);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(100);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-90);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//Tooth1
        wall.changeColor("black");
        wall.moveHorizontal(-90);
        wall.moveVertical(100);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//Tooth1
        wall.changeColor("black");
        wall.moveHorizontal(-90);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//Tooth1
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//Tooth1
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//s
        wall.changeColor("black");
        wall.moveHorizontal(-80);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-70);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-70);
        wall.moveVertical(100);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-70);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-80);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-60);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-90);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-60);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-50);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-50);
        wall.moveVertical(100);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-50);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-30);
        wall.moveVertical(100);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-30);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-20);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-20);
        wall.moveVertical(80);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//end smile
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//Nose
        wall.changeColor("black");
        wall.moveHorizontal(-60);
        wall.moveVertical(70);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-70);
        wall.moveVertical(70);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-70);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-80);
        wall.moveVertical(70);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-130);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-120);
        wall.moveVertical(120);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-110);
        wall.moveVertical(120);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-100);
        wall.moveVertical(130);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-90);
        wall.moveVertical(130);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-80);
        wall.moveVertical(130);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-70);
        wall.moveVertical(130);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-60);
        wall.moveVertical(130);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-50);
        wall.moveVertical(130);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(130);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-30);
        wall.moveVertical(120);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-20);
        wall.moveVertical(120);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-10);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(0);
        wall.moveVertical(110);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(10);
        wall.moveVertical(100);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(10);
        wall.moveVertical(90);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(10);
        wall.moveVertical(80);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(0);
        wall.moveVertical(80);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(0);
        wall.moveVertical(70);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(10);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(10);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(10);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(10);
        wall.moveVertical(30);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(0);
        wall.moveVertical(20);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(0);
        wall.moveVertical(10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-10);
        wall.moveVertical(0);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-20);
        wall.moveVertical(0);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-30);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-50);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-60);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-70);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-80);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-60);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-50);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(-10);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();//testeye
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-40);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-30);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        wall = new Square();
        
        wall.changeColor("black");
        wall.moveHorizontal(-30);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-30);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-20);
        wall.moveVertical(50);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-20);
        wall.moveVertical(40);
        wall.changeSize(10);
        wall.makeVisible();
        
        wall = new Square();
        wall.changeColor("black");
        wall.moveHorizontal(-20);
        wall.moveVertical(60);
        wall.changeSize(10);
        wall.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            window.changeColor("white");
            wall.changeColor("black");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
