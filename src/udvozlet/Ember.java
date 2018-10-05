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
public class Ember {
    private String nev;

    public Ember(String nev) {
        this.nev = nev;
    }
    
    public String koszont() {
        return "Üdvözöllek, " + nev + "!";
    }
    
    
}
