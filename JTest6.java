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
            int n, counter=0,maxT=18000, timeUsed=0, res=-999;
            
            n = sc.nextInt();
            int arr[] = new int[n];
            
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            
                while((timeUsed+arr[counter])<=maxT){
                    timeUsed = timeUsed+arr[counter];
                    counter++;
                    if(counter==n){
                        break;
                    }
                }

            out.println(counter);
        }

    }
    
}
