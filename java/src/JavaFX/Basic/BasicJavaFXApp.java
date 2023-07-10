package JavaFX.Basic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class BasicJavaFXApp extends Application {



    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX BasicJavaFxApp");

        Label label = new Label("Label");

        Button button= new Button("Button");

        TextArea textArea; // Об'єкт для введення та відображення тексту
        textArea = new TextArea("Text Area");
        textArea.setWrapText(true); // Перенесення тексту на новий рядок при досягненні краю елемента TextAre

        Slider slider = new Slider();

        CheckBox checkBox = new CheckBox("CheckBox");
        List<String> names = new ArrayList<>();
        names.add("Ann");
        names.add("Kat");
        names.add("Nick");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.setValue("choiceBox");
        choiceBox.getItems().addAll(names);

        Hyperlink hyperlink = new Hyperlink("http://google.com");

        ListView<String> listView = new ListView<>();
        listView.getItems().addAll(names);

        ColorPicker colorPicker = new ColorPicker();

        Menu menu1 = new Menu("Menu1");
        MenuItem menuItem1 = new MenuItem("MenuItem1");
        MenuItem menuItem2 = new MenuItem("MenuItem2");
        MenuItem menuItem3 = new MenuItem("MenuItem3");
        menu1.getItems().addAll(menuItem1,menuItem2,menuItem3);

        Menu menu2 = new Menu("Menu2");
        Menu menu3 = new Menu("Menu3");

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(menu1,menu2,menu3);

        Pagination pagination = new Pagination();
        pagination.setCurrentPageIndex(4);


        PasswordField passwordField = new PasswordField();

        ProgressBar progressBar = new ProgressBar();
        //ProgressIndicator progressIndicator = new ProgressIndicator(356);
        progressBar.setMinWidth(50);
        progressBar.setMinHeight(30);

        RadioButton radioButton = new RadioButton("RadioButton");

        ScrollBar scrollBar = new ScrollBar();

        ScrollPane scrollPane = new ScrollPane();

        Separator separator = new Separator();
        separator.setMaxWidth(500);


        SplitMenuButton splitMenuButton = new SplitMenuButton();
        splitMenuButton.getItems().addAll(menu1,menu2,menu3);

        SplitPane splitPane = new SplitPane();
        splitPane.getItems().addAll(pagination,scrollBar);

        Tab tab1 = new Tab("Tab1");

        Tab tab2 = new Tab("Tab2");
        Tab tab3 = new Tab("Tab3");
        TabPane tabPane = new TabPane();

        tabPane.getTabs().addAll(tab1,tab2,tab3);
        tabPane.setMinSize(500,300);

        TableView<String> tableView = new TableView<>();
        tableView.setMinSize(500,500);
        tableView.getColumns().add(new TableColumn<>("One"));

        VBox vbox = new VBox(5);
        vbox.setPadding(new Insets(10));
        vbox.getStyleClass().add("container"); // Додано клас стилів до контейнера VBox
        vbox.getChildren().addAll(menuBar,splitMenuButton,label,button, textArea,slider,checkBox,radioButton,choiceBox,
                hyperlink,listView,colorPicker,passwordField,progressBar,scrollPane,separator,splitPane, tabPane,
                tableView); // Додавання елементів до контейнера VBox


            
        Scene scene = new Scene(vbox, 800, 700); // Створення сцени з контейнером VBox
        scene.getStylesheets().add(getClass().getResource("basic.css").toExternalForm()); // Додано файл стилів CSS до сцени

        primaryStage.setScene(scene); // Встановлення сцени на вікно
        primaryStage.show(); // Відображення вікна
    }




    public static void main(String[] args) {
        launch(args);
    }
}

