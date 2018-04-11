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
            int x, y,minS = 1000000000, result;
            boolean readingLan = false;
            String bestL="";
            
            x = sc.nextInt();
            y = sc.nextInt();
            
            char keyb[][] = new char[y][x];
            for(int i = (y-1); i>=0; i--){
                String temp = sc.next();
                for(int j =(x-1); j>=0; j--){
                    keyb[i][j] =temp.charAt(j);
                }
            }
            
            for(int l = 0; l<3; l++){
                int sum = 0;
                String progL1 = sc.next();
                String storage="";
                String read1 = sc.next();
                if(readingLan==false && read1.equals("%TEMPLATE-START%")){
                    readingLan = true;
                    read1 = sc.next();
                    while(!read1.equals("%TEMPLATE-END%")){
                        storage = storage +read1;
                        read1 = sc.next();
                    }
                    readingLan = false;
                    int n = storage.length();
                    if(n <2){
                        sum = 0;
                    }else{
                        int tempY=0, tempX=0;
                        for(int k = 0; k<n;k++){
                            if(storage.charAt(k)!=' '){
                                for(int i = (y-1); i>=0; i--){
                                    for(int j =(x-1); j>=0; j--){
                                        if(k==0 && storage.charAt(k)==keyb[i][j]){
                                            tempY = i;
                                            tempX = j;
                                        }else if(k!=0 && storage.charAt(k)==keyb[i][j]){
                                            tempY = Math.abs(tempY - i);
                                            tempX = Math.abs(tempX - j);

                                            if(tempX>=tempY){
                                                sum = sum + tempX;
                                            }else{
                                                sum = sum + tempY;
                                            }
                                            tempY = i;
                                            tempX = j;

                                        }

                                    }
                                }
                            }                        

                        }
                    }
                    if(sum<minS){
                        minS = sum;
                        bestL = progL1;
                    }

                }
            }
            
            out.println(bestL+"\n"+minS);
        }

    }
    
}
