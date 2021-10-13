import javafx.application.Application;
class Main extends Application {
    public static void main(String[] args){
                launch(args);
                }
            public void start(Stage window)throws Exception {
                Button b = new Button("Click");
                Label l = new Label("Hello");
                VBox box = new VBox();
                box.getChildren().addAll(b,l); 
                Scene mainScene = new Scene(box);
                window.setTitle("Ma première fenêtre!");
                window.setScene(mainScene);
                window.show();
             }





            }