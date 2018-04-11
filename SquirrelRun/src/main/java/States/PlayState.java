package States;

import Controllers.*;
import mainPackage.*;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.input.*;
import World.*;
import States.*;
import Utilities.*;
import GameObjects.*;

public class PlayState extends GameState {

	/********************
	*					*
	*	  VARIABLES		*
	*					*
	*********************/

	/** The main game world. */
	World world;





	/********************
	*					*
	*	 CONSTRUCTOR	*
	*					*
	*********************/

	public PlayState(GameController gc) {
		super(gc);
		world = new World(this);




		/* Add stuff to the game state. */





		root.getChildren().addAll(canvas);
		scene = new Scene(root, Main.WIDTH, Main.HEIGHT);

		handleInput();
	}




	/********************
	*					*
	*	  FUNCTIONS		*
	*					*
	*********************/

	/** Handles all the input in the game. */
	public void handleInput() {
		Rock r = (Rock)world.gameObjects.get(0);

		scene.setOnKeyPressed(e -> {
			KeyCode keyCode = e.getCode();

			switch(keyCode) {
				case DOWN:
					r.down = true;
					r.up = false;
					// r.setPosition(r.getPosition().X, r.getPosition().Y + 1);
					break;
				case UP:
					r.up = true;
					r.down = false;
					// r.setPosition(r.getPosition().X, r.getPosition().Y - 1);
					break;
			}
		});
		scene.setOnKeyReleased(e -> {
			KeyCode keyCode = e.getCode();

			switch(keyCode) {
				case DOWN:
					r.down = false;
					// r.setPosition(r.getPosition().X, r.getPosition().Y + 1);
					break;
				case UP:
					r.up = false;
					// r.setPosition(r.getPosition().X, r.getPosition().Y - 1);
					break;
			}
		});
	}




	public void initialize() {
		world.initialize();
	}

	public void update() {
		world.update();
	}

	public void draw() {
		clear();
		graphics.setFill(Color.RED);
		graphics.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);

		world.draw();
	}



}