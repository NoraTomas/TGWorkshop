package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector3;

public class Bird {
    public static int GRAVITY = -15;
    private Vector3 position;
    private Vector3 velocity;
    private Texture birdPNG;
    private Sprite birdImage;

    public Bird(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0, 0, 0);
        birdPNG = new Texture("bird.png");
        birdImage = new Sprite(birdPNG);
    }

    public void update(float dt){
        velocity.add(0, GRAVITY, 0); //Adds Gavity to the y-component of velocity
        velocity.scl(dt); //dt = 0,017... So it scales down the power of gravity
        makeBirdMove();

        velocity.scl(1/dt); //Scale velocity back to normal

    }

    private void makeBirdMove() {
        position.add(velocity.x, velocity.y, 0);

        if(position.y < 0){
            position.y = 0;
        }
    }

    public void jump(){

    }

    public Sprite getBirdImage(){
        return birdImage;
    }

    public float getXPosition(){
        return position.x;
    }

    public float getYPosition(){
        return position.y;
    }
}
