package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField nameField;
    @FXML
    private Button registerButton;
    @FXML
    private Button loginButton;
    @FXML
    private CheckBox firstCheckBox;
    @FXML
    private Label ourLabel;
    @FXML
    public void initialize() {
        registerButton.setDisable(true);
        loginButton.setDisable(true);
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if(e.getSource().equals(registerButton)) {
            System.out.println("registerButton pressed. " + nameField.getText());
        } else if (e.getSource().equals(loginButton)) {
            System.out.println("loginButton pressed. " + nameField.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try {
                    String s = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I'm going to sleep on the: " + s);
                    Thread.sleep(5000);
                    Platform.runLater(() -> {
                        String s1 = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                        System.out.println("I'm updating the label on the: " + s1);
                        ourLabel.setText("We did something");
                    });
                } catch(InterruptedException event) {
                    // we don't care about this
                }
            }
        };

        new Thread(task).start();

        if(firstCheckBox.isSelected()) {
            nameField.clear();
            registerButton.setDisable(true);
            loginButton.setDisable(true);
        }
    }

    @FXML
    public void handleKeyReleased() {
        String text = nameField.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        registerButton.setDisable(disableButtons);
        loginButton.setDisable(disableButtons);
    }

    public void handleChange() {
        System.out.println("The checkbox is " + (firstCheckBox.isSelected() ? "checked" : "not checked"));
    }
}
