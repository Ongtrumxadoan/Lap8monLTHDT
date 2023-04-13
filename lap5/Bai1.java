/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lap5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai1 {     
    public static ArrayList<Double> sothuc = new ArrayList<>();
    public static void main(String[] args) {
                NhapDsach();
                XuatDsach();
                TongDsach();
    }
private static void NhapDsach(){
        
    Scanner sc = new Scanner(System.in);
       while(true){
           System.out.print("nhap so thuc tu ban phim la: ");
        double x = sc.nextDouble();
        sothuc.add(x);
           System.out.println("nhap them Y/N");
           sc.nextLine();
        if(sc.nextLine().equals("N")){
            break;
        }
  }
    }       
private static void XuatDsach(){
            for(int i =0; i<sothuc.size();i++){
            System.out.println(sothuc.get(i).toString());
        }
        }
private static void TongDsach(){
    double tong = 0;
    for(int i= 0; i<sothuc.size();i++){
        tong = tong+ sothuc.get(i);
    }
    System.out.println("tong cua cac so thuc la: "+tong);
}              
 
    }
        

