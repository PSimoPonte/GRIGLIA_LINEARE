package app_griglia;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author Simone.Pontalti
 */
public class Griglia_lineare extends Application {

    Scene scene;
    static Stage mainWindow=null; 
    BorderPane bp1,bp2;
    HBox hb;
    VBox vb1;
    static GridPane gp;
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    double base=1000;
    double altezza=1000;
    static Griglia gl1;
    static Griglia2 gl2;
    static Griglia3 gl3;


    @Override
    public void start(Stage primaryStage) {



        btn1 = new Button("linear");
        btn2 = new Button("sin");
        btn3 = new Button("cos");
        btn4 = new Button("Random");
        btn5 = new Button("All on");
        btn6 = new Button("All off");

        btn1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

              int i=0;
              int j=0;

               for (int k=0;k<25;k++){
                    for (int n=0;n<25;n++){
                        Cella cel = (Cella) gl1.getCellaAT(k, n);            
                        cel.EliminaPallino();
                    }
                }


              System.out.println(" Hai cliccato il bottone linear ");

               for (int k=0;k<25;k++)
                {
                    Cella cel = (Cella) gl3.getCellaAT(0, k);            
                     if(cel.presenzaPallino==true){

                         System.out.println(" C'è una pallina nella cella   "+
                                 cel.colPos +"---"+ cel.rigaPos);
                         j= cel.colPos;
                         i= 24-j;
                         Cella cel2 = (Cella) gl1.getCellaAT(i, j);    
                         cel2.DisegnaPallino2(cel2);   
                     }
                } 
            }
          }); 

          btn2.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {

              int i=0;
              int j=0;

               for (int k=0;k<25;k++){
                    for (int n=0;n<25;n++){
                        Cella cel = (Cella) gl1.getCellaAT(k, n);            
                        cel.EliminaPallino();
                    }
                }
               System.out.println(" Hai cliccato il bottone sin ");
          //     long discretizza (double y,double ymin, double ymax,int nmax){

               double a=0;
               int b=0;
               double ymin= -0.9999902065507035; // -1.00;// Math.sin(  0.000);
               double ymax=  0.9906073556948704; //1.00;// Math.sin(  24.000);


                for (int k=0;k<25;k++){
                   Cella cel = (Cella) gl3.getCellaAT(0,k);          
                    if(cel.presenzaPallino==true){
                         System.out.println(" MA CI ARRIVO??");                  

                         a=(double)k;

                         a=(double) Math.toDegrees(k);


                         a=(double) Math.sin(a);
                         b=(int) discretizza(a, ymin, ymax, 25);
                         System.out.println(":::::: Coordinate--> "+k+"   "+b);

                        // prima b e k erano invertiti al giorno 30 giugno
                         Cella cel1 = (Cella) gl1.getCellaAT(b,k);   
                         cel1.DisegnaPallino2(cel1);
///////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////
                   }
                }


            }
          }); 

       btn4.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

                System.out.println("Hai cliccato il bottone Random!");
                int x ;

                for (int j=0;j<25;j++)
                {
                    Cella cel = (Cella) gl3.getCellaAT(0, j);            
                     cel.EliminaPallino();
                }


                for (int j=0;j<25;j++)
                {
                    x = randInt(0, 1); // genera un numero casuale   0 oppure 1

                          if( x == 1 ){ // disegnare il cerchio
                              try{ 
                                   Cella cel = (Cella) gl3.getCellaAT(0, j);

                                  cel.DisegnaPallino2(cel);
                               }catch(Exception e){
                             //dare il messaggio che crea il problema
                                e.printStackTrace(); 
                               }
                          }  
                }  
            }
        });


       // evento quando clicchi sul bottone All on
        btn5.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

               for (int j=0;j<25;j++)
                {
                    Cella cel = (Cella) gl3.getCellaAT(0, j);            
                     cel.EliminaPallino();
                }

               for (int j=0;j<25;j++)
                {
                    Cella cel = (Cella) gl3.getCellaAT(0, j);            
                     cel.DisegnaPallino2(cel);
                }

            }
          });

          // evento quando clicchi sul bottone All off
        btn6.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {

               for (int j=0;j<25;j++)
                {
                    Cella cel = (Cella) gl3.getCellaAT(0, j);            
                     cel.EliminaPallino();
                }



            }
          });

        hb = new HBox(10);
        hb.getChildren().addAll(btn1,btn2,btn3,btn4,btn5,btn6);
        hb.setPadding(new Insets(5, 5, 5, 5));

        gl1 = new Griglia("f1");
        gl1.setId("f1");

        gl2 = new Griglia2("f2",25,1);
        gl2.setId("f2");

        gl3 = new Griglia3("f3");
        gl3.setId("f3");

        bp2 = new BorderPane();
        bp2.setCenter(gl3);
        bp2.setBottom(hb);
        bp2.setAlignment(hb, Pos.BOTTOM_CENTER);
        bp2.setPadding(new Insets(5, 5, 5, 5));



        bp1 = new BorderPane();
        bp1.setCenter(gl1);
        //bp1.setCenter(gl3);
        bp1.setBottom(bp2);
        bp1.setAlignment(gl1, Pos.CENTER);
        bp1.setPadding(new Insets(5, 5, 5, 5));



        Scene scene = new Scene(bp1, base, altezza);

        primaryStage.setTitle("Plotter");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();



       primaryStage.setOnCloseRequest((new EventHandler<WindowEvent>(){

              @Override
              public void handle(WindowEvent arg0) {
                  Platform.exit();
              }
              }));



    }
/////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////
//funzione per generare un valore casuale tra 0 e 5
      public static int randInt(int min,int max) { 
        return (min+ (int)(Math.random()* ((max-min)+1)));
    }
 /////////////////////////////////////////////////////////////////////////////
 /////////////////////////////////////////////////////////////////////////////

     public static void showPopup(String message) { 

        Label label = new Label(message);
        label.setAlignment(Pos.CENTER);
        label.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        Scene sc = new Scene(label, 500, 200);
        Stage stage = new Stage();
        stage.setScene(sc);
        stage.setX(100);
        stage.setY(100);
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initOwner(mainWindow);
        stage.show();
    }

     long discretizza (double y, double ymin, double ymax, int nmax){

         return (int) ((nmax-1)*(1-(y-ymin)/(ymax-ymin)));

     }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
