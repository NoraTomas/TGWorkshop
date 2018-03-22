package states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import nora.tomas.game.FlappyDemo;
import sprites.Bird;

public class PlayState extends State {
    private Texture birdImage;
    private Texture background;
    private Bird flappyBird;

    protected PlayState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        birdImage = new Texture("bird.png");
        flappyBird = new Bird(50, 50);
    }

    @Override
    protected void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        sb.draw(flappyBird.getBirdImage(), flappyBird, 50);
        sb.end();
    }

    @Override
    public void dispose() {

    }
}
