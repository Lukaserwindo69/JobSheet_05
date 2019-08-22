/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum.pkg3;

/**
 *
 * @author KANG_SNAKE
 */
public class OperatorBitwise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 12; // dikonversi ke biner = 0000 1100
        int y = 20; // dikonversi ke biner = 0001 0100
        
        int z;
        z = x | y;
        System.out.println("Hasil Operasi Bitwise OR: " + z );
        
        z = x & y;
        System.out.println("Hasil Operasi Bitwise AND: " + z );
        
        z = x ^ y;
        System.out.println("Hasil Operasi Bitwisw XOR: " + z );
        
        z = ~x;
        System.out.println("Hasil Operasi Bitwise NOT: " + z );
        
        z = x << 3;
        System.out.println("Hasil Operasi Bitwise LEFT: " + z );
        
        z = x >> 3;
        System.out.println("Hasil Operasi Bitwise RIGHT: " + z );
        
        
       
        
    }
    
}
