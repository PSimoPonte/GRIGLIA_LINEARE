/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app_griglia;

import static app_griglia.Griglia_lineare.gp;
import javafx.geometry.HPos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 *
 * @author Simone.Pontalti
 */
public class Griglia2 extends GridPane {
         
    int nRow;
    int nCol;

    /////COSTRUTTORE PER LA GRIGLIA ////////
    public Griglia2(String nome, int x, int y){
    
        this.nRow= x;
        this.nCol= y;         

         this.add(new Rectangle(21,15), 0, 0);
          

            ColumnConstraints column1 = new ColumnConstraints(0);
            ColumnConstraints column2 = new ColumnConstraints(0);
            ColumnConstraints column3 = new ColumnConstraints(0); 
            ColumnConstraints column4 = new ColumnConstraints(0);
            ColumnConstraints column5 = new ColumnConstraints(0);
            ColumnConstraints column6 = new ColumnConstraints(0);
            ColumnConstraints column7 = new ColumnConstraints(0);
            ColumnConstraints column8 = new ColumnConstraints(0);
            ColumnConstraints column9 = new ColumnConstraints(0);
            ColumnConstraints column10 = new ColumnConstraints(0);
            ColumnConstraints column11 = new ColumnConstraints(0);
            ColumnConstraints column12 = new ColumnConstraints(0);
            ColumnConstraints column13 = new ColumnConstraints(0); 
            ColumnConstraints column14 = new ColumnConstraints(0);
            ColumnConstraints column15 = new ColumnConstraints(0);
            ColumnConstraints column16 = new ColumnConstraints(0);
            ColumnConstraints column17 = new ColumnConstraints(0);
            ColumnConstraints column18 = new ColumnConstraints(0);
            ColumnConstraints column19 = new ColumnConstraints(0);
            ColumnConstraints column20 = new ColumnConstraints(0);
            ColumnConstraints column21 = new ColumnConstraints(0);
            ColumnConstraints column22 = new ColumnConstraints(0);
            ColumnConstraints column23 = new ColumnConstraints(0);
            ColumnConstraints column24 = new ColumnConstraints(0);
            ColumnConstraints column25 = new ColumnConstraints(0);
            
            
     
            column1.setPercentWidth(5);
            column2.setPercentWidth(5);
            column3.setPercentWidth(5);
            column4.setPercentWidth(5);
            column5.setPercentWidth(5);
            column6.setPercentWidth(5);
            column7.setPercentWidth(5);
            column8.setPercentWidth(5);
            column9.setPercentWidth(5);
            column10.setPercentWidth(5);
            column11.setPercentWidth(5);
            column12.setPercentWidth(5);
            column13.setPercentWidth(5);
            column14.setPercentWidth(5);
            column15.setPercentWidth(5);
            column16.setPercentWidth(5);
            column17.setPercentWidth(5);
            column18.setPercentWidth(5);
            column19.setPercentWidth(5);
            column20.setPercentWidth(5);
            column21.setPercentWidth(5);
            column22.setPercentWidth(5);
            column23.setPercentWidth(5);
            column24.setPercentWidth(5);
            column25.setPercentWidth(5);
            
          
            column1.setHgrow(Priority.ALWAYS);
            column2.setHgrow(Priority.ALWAYS);
            column3.setHgrow(Priority.ALWAYS);
            column4.setHgrow(Priority.ALWAYS);
            column5.setHgrow(Priority.ALWAYS);
            column6.setHgrow(Priority.ALWAYS);
            column7.setHgrow(Priority.ALWAYS);
            column8.setHgrow(Priority.ALWAYS);
            column9.setHgrow(Priority.ALWAYS);
            column10.setHgrow(Priority.ALWAYS);
            column11.setHgrow(Priority.ALWAYS);
            column12.setHgrow(Priority.ALWAYS);
            column13.setHgrow(Priority.ALWAYS);
            column14.setHgrow(Priority.ALWAYS);
            column15.setHgrow(Priority.ALWAYS);
            column16.setHgrow(Priority.ALWAYS);
            column17.setHgrow(Priority.ALWAYS);
            column18.setHgrow(Priority.ALWAYS);
            column19.setHgrow(Priority.ALWAYS);
            column20.setHgrow(Priority.ALWAYS);
            column21.setHgrow(Priority.ALWAYS);
            column22.setHgrow(Priority.ALWAYS);
            column23.setHgrow(Priority.ALWAYS);
            column24.setHgrow(Priority.ALWAYS);
            column25.setHgrow(Priority.ALWAYS);
            
            this.getColumnConstraints().addAll(column1, column2,column3,column4,column5,column6,column7,column8,column9,column10,column11, column12,column13,column14,column15,column16,column17,column18,column19,column20,column21,column22,column23,column24,column25);

            this.setGridLinesVisible(true);
        
        
        
        
    }
    
    //metodo public void add(int x, int y){}
//#############################################################################
//#############################################################################
    //////funzione che mi restituisce l'elemento nella cella  i - j ////////
    
     public  Cella getCellaAT(int i, int j){
    
        for(Node x : this.getChildren()) {
        
          try{
            Cella y=(Cella)x;
            System.out.println("=============="+i+"========="+j);
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
