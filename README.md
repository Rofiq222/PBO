# PBO
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kuis;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class Kuis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int nilaiC;
    System.out.println("Penjumlahan");
    System.out.println("Variable A");
    int nilaiA = input.nextInt();
    System.out.println("Variable B");
    int nilaiB = input.nextInt();
    nilaiC = nilaiA + nilaiB;
    
    System.out.println();
    System.out.println("Variable A + Variable B = Variable C");
    System.out.println("Variable A adalah"+nilaiA);
    System.out.println("Variable B adalah"+nilaiB);
    System.out.println("Variable C adalah"+nilaiC);
    
    System.out.println("Data Mahasiswa");
    String nama = "Fakhrur Rofiq";
    int nim = 22201286;
    
    System.out.println("Nama:"+nama);
    System.out.println("Nim:"+nim);
    }
    
}
