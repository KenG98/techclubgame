package bakpakin.techgame;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TechGame extends Game {

    //Used by all screens for drawing
    public SpriteBatch batch;

	@Override
	public void create () {
		batch = new SpriteBatch();

        Assets.loadGeneral();
        Settings.load();

        setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {

        GL20 gl = Gdx.gl;
		gl.glClearColor(1, 0, 0, 1);
		gl.glClear(GL20.GL_COLOR_BUFFER_BIT | GL20.GL_DEPTH_BUFFER_BIT);

        super.render();
	}
}
