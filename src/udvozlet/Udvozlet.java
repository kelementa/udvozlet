/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udvozlet;

/**
 *
 * @author t1
 */
public class Udvozlet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ember ferfi = new Ember("Ádám");
        Ember no = new Ember("Éva");
        
        System.out.println(ferfi.koszont());
        System.out.println(no.koszont());
        
    }
    
}
