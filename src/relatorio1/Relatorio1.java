/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package relatorio1;


public class Relatorio1 {

    
    public static void main(String[] args) {
   int valores [][] = new int [2][2];
   String paises [] = {"Brasil","China","Russia","Gabao","italia"};
   double conversao [] = {6.10,7.91,101.70,679.35,1};
   
   String linha="";
   int paises2, totalvalor=0;
   double valotconvertido=0;
  
        for (int i = 0; i < valores.length; i++) {
            for (int j = 0; j < valores[0].length; j++) {
                
                valores[i][j] = (int) (Math.random()*9);
                linha = linha + " " + valores[i][j];
                
                
            }
            System.out.println(linha);
            linha= "";
        }
        for (int i = 0; i < valores.length; i++) {
            
            for (int j = 0; j < valores[0].length; j++) {
                
                totalvalor = totalvalor + valores[i][j];
                
            }
            System.out.println("--------------------------------------------");
             valotconvertido = totalvalor / conversao[i];
             System.out.println(paises[i] +"\t| " + totalvalor + "\t| " +  valotconvertido);
            
        }
      


    }
    
}
