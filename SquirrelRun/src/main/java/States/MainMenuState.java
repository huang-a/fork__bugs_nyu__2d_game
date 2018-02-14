package States;

import Controllers.*;
import mainPackage.*;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class MainMenuState extends GameState {

	/********************
	*					*
	*	  VARIABLES		*
	*					*
	*********************/

	HBox holder;
	Label titleLabel;
	Button playGameBtn;
	Button creditsBtn;







	/********************
	*					*
	*	     INIT		*
	*					*
	*********************/

	public MainMenuState(GameController gc) {
		super(gc);

		// Initialize the title screen elements.
		holder = new HBox();
		titleLabel = new Label("Squirrel Run");
		playGameBtn = new Button("Play Game");
		creditsBtn = new Button("Credits");


		// Add those elements to the holder view.
		holder.getChildren().addAll(titleLabel, playGameBtn, creditsBtn);


		// Add action on button.
		playGameBtn.setOnAction(e -> { this.gc.switchState(1); });
		creditsBtn.setOnAction(e -> { this.gc.switchState(2); });


		root.getChildren().addAll(canvas, holder);
		scene = new Scene(root, Main.WIDTH, Main.HEIGHT);
	}




	/********************
	*					*
	*	  FUNCTIONS		*
	*					*
	*********************/

	public void initialize() {
		// System.out.println("Initialized!");
	}

	public void update() {
		// System.out.println("Updating");
	}

	public void draw() {
		clear();

		graphics.setFill(Color.GREEN);
		graphics.fillRect(0, 0, Main.WIDTH, Main.HEIGHT);
	}



}