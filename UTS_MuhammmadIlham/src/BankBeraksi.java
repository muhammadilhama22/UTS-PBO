/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class BankBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Bank bca = new Bank (100000);

        bca.getSaldo();
        bca.simpanUang(500000);
        bca.ambilUang(1500000);
       
    
    }
    
}
