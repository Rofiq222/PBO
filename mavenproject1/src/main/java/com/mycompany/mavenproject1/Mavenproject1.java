/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;





/**
 *
 * @author Lenovo
 */
public class Mavenproject1 {
    
    
    public static void main(String[] args)throws Exception {
        
        int[] arr={1,2,3,4,5,6,7,8,9,10,};
        String[]nama={"Alpa","Delta","Ilham","Indra","Rofi"};
        for (int num : arr){
            System.out.println(num);
        }
        for (String str : nama){
            System.out.print(str+" ");
        }
            
      PrintWriter fileout=new PrintWriter ("receipt.txt");
      fileout.println("Fakhrur Rofiq");
      fileout.println("Umur 20");
      fileout.println("Tinggi 170");
      fileout.println("Alamat Malang");
      fileout.close();
      
      Scanner fin = new Scanner (new File("receipt.txt"));
      
      while (fin.hasNextLine()){
          String text = fin.nextLine();
          System.out.println(text);
         
      }
     
      
}}