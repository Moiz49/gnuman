package de.hshannover.inform.gnuman.app.mapeditor;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;

/**
 * Bootstrap the editor.
 * @author Marc Herschel
 */

public class StartEditor {
    private Scene editor;
    private EditorController controller;

    public void start() throws IOException {
        Stage stage = new Stage();
        FXMLLoader l = new FXMLLoader(getClass().getResource("/editor/Editor.fxml"));
        editor = new Scene(l.load());
        controller = l.getController();
        stage.getIcons().add(new Image(getClass().getResourceAsStream("/editor/editor.png")));
        stage.setMinWidth(990);
        stage.setMinHeight(440);
        stage.centerOnScreen();
        stage.setScene(editor);
        stage.setTitle("GNUMAN Editor :: Ready");
        stage.show();
    //Hack to deal with margin issues if an OS makes the decorators a different size
        stage.setHeight(stage.getHeight()+1);
        stage.setWidth(stage.getWidth()+1);
        stage.sizeToScene();
        editor.getStylesheets().add(getClass().getResource("/editor/style.css").toExternalForm());
        editor.getRoot().applyCss();
        controller.setStage(stage);
    }

}
