/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_griglia;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 *
 * @author Simone.Pontalti
 */
public class Gestore_Evento implements EventHandler<MouseEvent>{

    String color = "black";
    String id1= null;
    Object obj= new Object();
    Griglia gr1;
    Griglia2 gr2;
    
    @Override
  public void handle(MouseEvent e) {
      
   if(e.getTarget() instanceof Cella){
                   Cella cell1 = (Cella)e.getSource(); //cella cliccata
                 
     if(Griglia_lineare.gl1.getId() == "f1" && cell1.presenzaPallino == false){
                   
                        
                            Griglia_lineare.showPopup("Libero");
           

                    }
             }   
    }
}

