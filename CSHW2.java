/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//Reference taken from cgi.csc.liv.uk and stackoverflow
package cshw2;

import java.util.*;
/**
 *
 * @author shivamgupta
 */
public class CSHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Please enter 2 variables X and Y");
        int a=0,b=0;
        
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b= sc.nextInt();
        
        if( a==0 || b==0 ){
            System.out.println("Please enter valid values");
        }
        
        CSHW2 ob = new CSHW2();
        
        ob.euclidean(a,b);
        
        
    }
    
    public void euclidean(int a, int b){
        
        int x=0,y=1,x_sign=1, y_sign=0, tmp; 
        
        while(b!=0){
            int q= a/b;
            int rem = a%b;
            
            a=b;
            b=rem;
            
            tmp = x;
            x = x_sign - q*x;
            x_sign = tmp;
            

        }
        System.out.println("GCD of X and Y:"+ x_sign);
    }
}
