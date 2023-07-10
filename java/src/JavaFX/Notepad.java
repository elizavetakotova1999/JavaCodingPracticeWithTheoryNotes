package JavaFX;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Notepad extends Application {

    private TextArea textArea; // Об'єкт для введення та відображення тексту
    private FileChooser fileChooser; // Об'єкт для вибору файлів

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX BasicJavaFxApp");

        textArea = new TextArea();
        textArea.setWrapText(true); // Перенесення тексту на новий рядок при досягненні краю елемента TextArea

        Button openButton = new Button("Open");
        openButton.setOnAction(e -> openFile()); // Встановлення обробника подій для кнопки "Open"


        Button saveButton = new Button("Save");
        saveButton.setOnAction(e -> saveFile()); // Встановлення обробника подій для кнопки "Save"

        VBox vbox = new VBox(10);
        vbox.setPadding(new Insets(10));
        vbox.getStyleClass().add("container"); // Додано клас стилів до контейнера VBox
        vbox.getChildren().addAll(openButton, saveButton, textArea); // Додавання елементів до контейнера VBox

        Scene scene = new Scene(vbox, 400, 300); // Створення сцени з контейнером VBox
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm()); // Додано файл стилів CSS до сцени

        primaryStage.setScene(scene); // Встановлення сцени на вікно
        primaryStage.show(); // Відображення вікна
    }

    private void openFile() {
        File file = getFileChooser().showOpenDialog(null); // Відображення діалогового вікна для вибору файлу
        if (file != null) {
            try {
                // Зчитування вмісту файлу та встановлення його в TextArea
                String content = Files.readString(file.toPath());
                textArea.setText(content);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveFile() {
        File file = getFileChooser().showSaveDialog(null); // Відображення діалогового вікна для вибору місця збереження файлу
        if (file != null) {
            try {
                // Отримання шляху файлу та збереження вмісту TextArea у файл
                Path path = file.toPath();
                String content = textArea.getText();
                Files.writeString(path, content, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private FileChooser getFileChooser() {
        if (fileChooser == null) {
            // Ініціалізація FileChooser, який використовується для вибору файлів
            fileChooser = new FileChooser();
            fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text Files", "*.txt"));
        }
        return fileChooser;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
