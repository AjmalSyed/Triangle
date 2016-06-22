/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangle;

/**
 *
 * @author Ajmal Syed
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int i,j;
       for(i=0;i<5;i++){
       for(int k=0;k<i;k++){
           System.out.print(" ");
       }
           for(j=5;j>=2*i-1;j--){
              System.out.print("*");
           
       }
           
           System.out.println("");
       }
           }}
    

