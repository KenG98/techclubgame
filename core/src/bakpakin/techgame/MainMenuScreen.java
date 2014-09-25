package bakpakin.techgame;

import com.badlogic.gdx.Screen;

/**
 * Created by Calvin on 9/25/14.
 */
public class MainMenuScreen implements Screen {

    private TechGame game;

    public MainMenuScreen(TechGame game) {
        super();
        this.game = game;
    }

    @Override
    public void render(float delta) {
        game.batch.begin();
        Assets.superScript48.draw(game.batch, "Hello World!", 200, 200);
        game.batch.end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {

    }
}
