package bakpakin.techgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;

/**
 * Created by Calvin on 9/25/14.
 */
public class Assets {

    public static BitmapFont superScript24;
    public static BitmapFont superScript48;

    public static void loadGeneral() {
        FreeTypeFontGenerator generator = new FreeTypeFontGenerator(Gdx.files.internal("data/superscr.ttf"));
        FreeTypeFontParameter parameter = new FreeTypeFontParameter();
        parameter.size = 24;
        superScript24 = generator.generateFont(parameter);
        parameter.size= 48;
        superScript48 = generator.generateFont(parameter);
        generator.dispose();
    }

}
