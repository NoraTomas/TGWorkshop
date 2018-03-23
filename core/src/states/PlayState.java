package states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import nora.tomas.game.FlappyDemo;
import sprites.Bird;

public class PlayState extends State {
    private Texture birdImage;
    private Texture background;
    private Bird bird;

    protected PlayState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        birdImage = new Texture("bird.png");
        bird = new Bird(220, 150);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {
        bird.update(dt);
        if(Gdx.input.justTouched()){
            bird.jump();
        }
    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        sb.draw(bird.getBirdImage(), bird.getXPosition(), bird.getYPosition());
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
