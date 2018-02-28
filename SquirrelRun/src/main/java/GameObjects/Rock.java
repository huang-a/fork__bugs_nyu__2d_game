package GameObjects;

import javafx.scene.paint.Color;
import World.*;

public class Rock extends GameObject {

	/********************
	*					*
	*	  VARIABLES		*
	*					*
	*********************/

	









	/********************
	*					*
	*	  VARIABLES		*
	*					*
	*********************/

	public Rock(World world) {
		super(world);
	}




	/********************
	*					*
	*	  FUNCTIONS		*
	*					*
	*********************/







	/********************
	*					*
	*	   ABSTRACT		*
	*					*
	*********************/

	public void initialize() {

	}

	public void update() {

	}

	public void draw() {
		world.getPlayState().graphics.setFill(Color.GREEN);
		world.getPlayState().graphics.fillRect(position.X, position.Y, width, height);
	}




}