
package app_griglia;



/**
 *
 * @author Simone.Pontalti
 */
public class ProvaSeno {
    
    
      public static void main(String[] args) {
        
          double y1=0;
          double y2=0;
          double x1=0;
          double x2=0;
          double result = 0;
          double maxy = 0;
           double miny = 0;
          int indice1 = 0;
          int indice2 = 0;
          double ymin= -0.9999902065507035;  // -1.00;// Math.sin(  0.000);
          double ymax= 0.9906073556948704; //1.00;// Math.sin(  24.000);
          int nmax = 25;
          
         System.out.println(" ------ciao-------");
          System.out.println(ymin +" --------"+ ymax);
          
          maxy= Math.sin(0);
           System.out.println(" ------max y iniziale -------"+maxy);
          
          for(int i=0; i<25; i++){
          
             
               result= Math.sin(i);
               System.out.println("=>  input = "+i+" ______  outpout della funzione seno : "+result+"====");
               if( result > maxy){
                   maxy = result;
                    indice1 = i;
               }
               if( result < miny){
                   miny = result;
                    indice2 = i;
               }
             x1= Math.toDegrees(i); // converto il numero della colonna dell GL in gradi
              y1= Math.sin(x1);
             // System.out.println(x1 +" °°°°°°"+ y1);
              y2= discretizza(y1,ymin,ymax,nmax);
              
            // System.out.println("=>  i= "+i+" - x1= "+x1+" -y1= "+y1+" - y2= "+y2+"  ");
              
              
          }
          //System.out.println("=>  input = "+indice1+" ___MAX MAX :"+ maxy +"  =======");
          //System.out.println("=>  input = "+indice2+" ___MIN MIN  :"+ miny +"  =======");
          
    }
      
       public static long discretizza (double y, double ymin, double ymax, int nmax){

            return (int) ((nmax-1)*(1-(y-ymin)/(ymax-ymin)));

        }
}
