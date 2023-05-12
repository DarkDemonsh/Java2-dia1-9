package dia1introduccion;

import java.util.ArrayList;

public class Dia1introduccion {

    public static void main(String[] args) {
      
        //Arrays
     String[] nombresArray = new String[5];
     
        for (int i = 0; i < nombresArray.length; i++) {
           nombresArray[i] = "chiquito " + (i+1); 
        }
     
        for (String var : nombresArray) {
            System.out.println(var);
        }
       
        //Collections
        ArrayList<String> nombresArrayList = new ArrayList();
        
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        nombresArrayList.add("Chiquito");
        
        System.out.println(nombresArrayList.size());
        
        nombresArrayList.remove("Chiquito");
        
        System.out.println(nombresArrayList.size());
    }    
}
