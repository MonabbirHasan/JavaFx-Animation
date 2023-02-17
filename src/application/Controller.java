package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
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
	 
//		TranslateTransition translate=new TranslateTransition();
//		translate.setNode(myImage);
//		translate.setCycleCount(TranslateTransition.INDEFINITE);
//		translate.setDuration(Duration.millis(1000));
//		translate.setFromX(200);
//		translate.setDelay(Duration.millis(2000));
//		translate.setRate(-200);
//		translate.setAutoReverse(true);
//		translate.setByX(250);
//		translate.setByY(100);
//		translate.setByZ(200);
//		translate.play();
//		
		
		RotateTransition rotate=new RotateTransition();
		rotate.setNode(myImage);
		rotate.setByAngle(360);
		rotate.setAutoReverse(true);
		rotate.setCycleCount(RotateTransition.INDEFINITE);
		rotate.setAxis(Rotate.X_AXIS);
//		rotate.setDuration(Duration.INDEFINITE);
		rotate.setInterpolator(Interpolator.LINEAR);
		rotate.setDelay(Duration.millis(2000));
		rotate.play();
		
		FadeTransition fade=new FadeTransition();
		fade.setNode(myImage);
		fade.setFromValue(0);
//		fade.setDuration(Duration.INDEFINITE);
		fade.setCycleCount(RotateTransition.INDEFINITE);
		fade.setDelay(Duration.millis(2000));
		fade.setToValue(1);
		fade.play();
		
		ScaleTransition scale=new ScaleTransition();
		scale.setNode(myImage);
		scale.setAutoReverse(true);
		scale.setToX(1);
		scale.setByX(1.6);
		scale.setByY(1.4);
		scale.setCycleCount(RotateTransition.INDEFINITE);
		scale.setDelay(Duration.millis(2000));
		scale.setDuration(Duration.INDEFINITE);
		scale.play();
		
		
	}
	
	

}
