/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programameunadolatela;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author salcu
 */
public class ProgramameUnaDolaTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entI=new Scanner(System.in);
        long casos=Long.valueOf(entI.nextLine());
        for (; casos >0; casos--) {
            
            
            //String text=entSt.nextLine();
            //String ocult=entSt.nextLine().replaceAll("\\p{Space}", "");
            //String regexp="[^"+ocult+"]";
            //text.replaceAll(regexp, "");
            //text=Pattern.compile(regexp).matcher(text).replaceAll("");
            
            String[] datos=entI.nextLine().split(" ");
            ArrayList<String> peregrinos=new ArrayList<>();
            int i;
            for (i = 0; ; i++) {
                if(!datos[i].equals("F")){
                    peregrinos.add(datos[i]);
                }
                else break;                
            }
            int numCamas=Integer.valueOf(datos[++i]);
            int numPalabras=Integer.valueOf(datos[++i]);
            if(numCamas>=peregrinos.size()){
                System.out.println("TODOS TIENEN CAMA");
                continue;
            }        
            if(numCamas==0){
                System.out.println("NADIE TIENE CAMA");
                continue;
            }   
            int borrar=(numPalabras)%peregrinos.size();
            while(peregrinos.size()>numCamas){
                if(borrar>0){
                    peregrinos.remove(borrar-1);
                    borrar=((borrar-1+numPalabras)%peregrinos.size()); 
                }
                else {
                    peregrinos.remove(peregrinos.size()-1);
                    borrar=((borrar+numPalabras)%peregrinos.size());            
                }
                
            }        
            for (int k=0;k<peregrinos.size();k++) {
                if (k!=peregrinos.size()-1) System.out.print(peregrinos.get(k)+" ");
                else  System.out.print(peregrinos.get(k));
            }
            System.out.println("");
        }
        entI.close();
    }
    
}
 