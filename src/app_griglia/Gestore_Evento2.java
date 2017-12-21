/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_griglia;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.shape.Circle;

/**
 *
 * @author Simone.Pontalti
 */
public class Gestore_Evento2 implements EventHandler<Event>{

    
    
    @Override
    public void handle(Event e1) {
        
         System.out.println("QUAAAAA");
         
    if(e1.getTarget() instanceof Cella)  
    {
                 
        System.out.println("Hai cliccato su una cella vuota "); 
         Cella cell2 = (Cella)e1.getSource(); //cella cliccata
         int x= cell2.rigaPos; // riga della cella cliccata
         int y= cell2.colPos; // colonna della cella cliccata
         System.out.println("Cella cliccata: "+cell2.colPos+"//"+cell2.rigaPos);
         System.out.println("SONO A CHARLIE");
        // cell2.DisegnaPallino(x,y, "f3");
         cell2.DisegnaPallino2(cell2);    

             
    }
    else if(e1.getTarget() instanceof Circle){

        System.out.println("Hai cliccato su una cella che contiene un cerchio");
        Cella cell2 = (Cella)e1.getSource(); //cella cliccata
        cell2.EliminaPallino();    
    }
    }
    
}
