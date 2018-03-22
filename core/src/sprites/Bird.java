package sprites;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

public class Bird {
    private Vector3 position;
    private Vector3 velocity;
    private Texture birdImage;

    public Bird(int x, int y){
        position = new Vector3(x, y, 0);
        velocity = new Vector3(0, 0, 0);
        birdImage = new Texture("bird.png");
    }

    public void update(float dt){
        if(Gdx.input.justTouched()){
            velocity.add(0, 5, 0);
        }
    }

    public Texture getBirdImage(){
        return birdImage;
    }

    public float getXPositionCoordinate(){
        return position.x;
    }
}
