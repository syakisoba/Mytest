/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtestab;
import java.io.*;
import java.util.*;
import java.math.*;
/**
 *
 * @author michael
 */
public class JTestAB {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try(Scanner sc = new Scanner(new File("input.txt"));
        PrintWriter out = new PrintWriter("output.txt")){
            int n,result, count, pC, tC, diff;
            count = 0;
            pC=0;
            tC=0;

            n = sc.nextInt();
            int[] p = new int[n];
            int[] t = new int[n];
            
            for(int i=0; i<n;i++){
                p[i] = sc.nextInt();
            }
            
            for(int i=0; i<n;i++){
                t[i] = sc.nextInt();
            }
            
            if(t[0]>p[0]){
                diff = t[0]-p[0];
            }else{
                diff = p[0]-t[0];
            }
            
            for(int i=0; i<n;i++){
                int temp;
                if(p[i]>=t[i]){
                    count = count + p[i];
                    pC++;
                    temp = p[i]-t[i];
                    
                    if(temp<diff){
                        diff = temp;
                    }
                }else if(t[i]>p[i]){
                    count = count + t[i];
                    tC++;
                    temp = t[i]-p[i];
                    
                    if(temp<diff){
                        diff = temp;
                    }
                }
                
            }
            
            if(tC!=0&&pC!=0){
                result = count;
            }else{
                result = count-diff;
            }
            out.println(result);
        }

    }
    
}
