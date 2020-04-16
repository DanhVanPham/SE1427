/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1427;

import data.MyToys;

/**
 *
 * @author DELL
 */
public class SE1427 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! = " + MyToys.cF(5));//hy vọng 120
        System.out.println("6! = " + MyToys.cF(6));//hy vọng 720
        System.out.println("0! = " + MyToys.cF(0));//hy vọng 1
        System.out.println("-5! = " + MyToys.cF(-5)); //JVM sẽ giết app, ném ra ngoại lệ của chính mình
                                                      //chửi user đưa tham số vào
    }
    
}
