/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_griglia;

import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author Simone.Pontalti
 */
public class Griglia3 extends GridPane {
    
         
    int nRow=1;
    int nCol=25;
    
    
    /////COSTRUTTORE PER LA GRIGLIA ////////
    public Griglia3(String nome){
    
                
        this.setGridLinesVisible(true);
//#############################################################################
//#############################################################################
/////// COSTRUZIONE DELLLA GRIGLIA 10x10 CELLE  //////////

        for(int i=0;i<nRow;i++) 
        {
           for(int j = 0;j<nCol;j++)
                
            {
                 Cella acq = new Cella(i,j,nome);
                  
//il metodo add appartiene al GridPane, j sta per colonna e i sta per riga 
//(prima riceve la colonna e poi la riga) ma in una matrice normale prima si 
//mette la riga e poi la colonna
                 this.add(acq, j, i);
                
            }
        }
        
        for (int i = 0; i < nRow; i++) {
            
            this.getRowConstraints().add(new RowConstraints(35, 
                    Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, 
                    Priority.ALWAYS, VPos.CENTER, true));
        }
        
        for (int i = 0; i < nCol; i++) {
            this.getColumnConstraints().add(new ColumnConstraints(35, 
                    Control.USE_COMPUTED_SIZE, Double.POSITIVE_INFINITY, 
                    Priority.ALWAYS, HPos.CENTER, true));
            
        }
        
       
    
    }
    
    //metodo public void add(int x, int y){}
//#############################################################################
//#############################################################################
    //////funzione che mi restituisce l'elemento nella cella  i - j ////////
    
     public  Cella getCellaAT(int i, int j){
    
        for(Node x : this.getChildren()) {
        
          try{
            Cella y=(Cella)x;
           // System.out.println("=============="+i+"========="+j);
            if((y.colPos==j) && (y.rigaPos==i)) {
                       return y;
            }
            
          }catch(Exception e){
          
              System.out.println(e.getMessage());
          }
        }
        return null;
     } 
}
