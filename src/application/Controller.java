package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class Controller implements Initializable{

	@FXML
	private ImageView myImage;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
	 
		TranslateTransition translate=new TranslateTransition();
		translate.setNode(myImage);
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setDuration(Duration.millis(1000));
//		translate.setFromX(200);
		translate.setDelay(Duration.millis(2000));
//		translate.setRate(-200);
		translate.setAutoReverse(true);
		translate.setByX(250);
		translate.setByY(100);
		translate.setByZ(200);
		translate.play();
		
		
		RotateTransition rotate=new RotateTransition();
		rotate.setNode(myImage);
		rotate.setByAngle(360);
		rotate.setAutoReverse(true);
		rotate.setCycleCount(RotateTransition.INDEFINITE);
		rotate.setAxis(Rotate.X_AXIS);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setDelay(Duration.millis(2000));
		rotate.play();
		
		
	}
	
	

}
