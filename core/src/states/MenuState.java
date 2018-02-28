package states;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import nora.tomas.game.FlappyDemo;

public class MenuState extends State {

    private Texture background;
    private Texture playbtn;

    public MenuState(GameStateManager gsm) {
        super(gsm);
        background = new Texture("bg.png");
        playbtn = new Texture("playbtn.png");
    }

    @Override
    public void handleInput() {

    }

    @Override
    public void update(float dt) {

    }

    @Override
    public void render(SpriteBatch sb) {
        sb.begin();
        sb.draw(background, 0, 0, FlappyDemo.WIDTH, FlappyDemo.HEIGHT);
        sb.draw(playbtn, FlappyDemo.WIDTH/2 - playbtn.getWidth()/2, FlappyDemo.HEIGHT/2);
        sb.end();
    }
}
