/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_griglia;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Simone.Pontalti
 */
public class Cella extends StackPane{
    
     
    int rigaPos =0;
    int colPos =0;
    boolean presenzaPallino=false;
    boolean cellaColpita = false;
    String color = "lightblue";
    String color1 = "black";
   
   
    public Cella(int i, int  j , String nome){
       
       this.rigaPos = i;
       this.colPos = j;
    //this.setStyle("-fx-background-color:"+color+";-fx-border-color: black;");
          
        if(nome.equals("f1")){
            Gestore_Evento ge = new Gestore_Evento();
            this.addEventHandler(MouseEvent.MOUSE_PRESSED, ge);
        }
        else if(nome.equals("f3")){
            Gestore_Evento2 ge2 = new Gestore_Evento2();
            this.addEventHandler(MouseEvent.MOUSE_PRESSED, ge2);
        }
        
   /*     
        else if(nome.equals("f2")){
            GestoreEvento2 ge2 = new GestoreEvento2();
            this.addEventHandler(MouseEvent.MOUSE_PRESSED, ge2);
            
        }
  */      
    }
    
    void DisegnaPallino(int i, int j ,  String n)         
    {
//in questo caso i e j sono recuperati dalla finestra cliccata
        Cella nd1 = Griglia_lineare.gl2.getCellaAT(i, j); 
       
//#############################################################################
//#############################################################################
//Se è stato selezionato il ToggleButton con il tasto 1
//#############################################################################
//#############################################################################
          Cella ac1 = (Cella)nd1;

           if(ac1.presenzaPallino==false){
           try{
               Circle cr1 = new Circle(150,150,15);
               cr1.setFill(Color.LIGHTBLUE);
               this.getChildren().add(cr1);
               ac1.presenzaPallino=true;
           }catch(Exception e){
           
               e.printStackTrace(); //dare il messaggio che crea il problema
           }
         //   Griglia_lineare.btn1.decrementa();
           }
    }
    void DisegnaPallino2( Cella cel)         
    {
          System.out.println("SONO dentro disegnPallino");

           if(cel.presenzaPallino==false){
               
                    try{
                        Circle cr1 = new Circle(150,150,10);
                        cr1.setFill(Color.LIGHTBLUE);
                        this.getChildren().add(cr1);

                        this.presenzaPallino=true;
                        
                    }catch(Exception e){
                    //dare il messaggio che crea il problema 
                       e.printStackTrace(); 
                    }
            }
    }
    
    void EliminaPallino()         
    {
         
          System.out.println("ELIMINA CERCHIO");
          this.getChildren().clear();
           this.presenzaPallino=false;
         
        
    }
}   
