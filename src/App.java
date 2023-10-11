import processing.core.*;

public class App extends PApplet{
    Ellipse hero;
    PVector position; 
    PVector velocity;
    PVector acceleration;
    public static void main(String[] args)  {
        PApplet.main("App");
    }

    public void setup(){
        hero = new Ellipse(this, 1000, 100, 50, 50);
        position = new PVector(1000, 100);
        velocity = new PVector(0, 5);
        acceleration = new PVector(0,0.1f);
    }

    public void settings(){
        size(2000, 1200);
    }

    public void draw(){
        background(200);
        update();
        hero.display();
    }

    public void update(){
        velocity.add(acceleration);
        position.add(velocity);
        
        hero.setX(position.x);
        hero.setY(position.y);
    }
}
