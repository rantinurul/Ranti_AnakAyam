/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anakayam_rantinurulyunita_xiirplb;

import java.util.Scanner;

/**
 *
 * @author LABKOM01-RPL19
 */
public class AnakAyam_RantiNurulYunita_XIIRPLB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner myscan = new Scanner (System.in);
        int n,m;
        
        System.out.print("banyak anak ayam=");
        n=myscan.nextInt();
        System.out.println();
        
        for(int i=n; i>=2;i--){
            m=i-1;
            
        System.out.println("anak ayam turun "+i+",mati 1 tinggal "+m);
        }
        System.out.println("anak ayam turun 1,mati 1 tinggal induknya");
    }
    
}
