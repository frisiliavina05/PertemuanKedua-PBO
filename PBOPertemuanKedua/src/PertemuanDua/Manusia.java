/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PertemuanDua;

/**
 *
 * @author HP
 */
public class Manusia {
    private String Bernafas;
    private String Bergerak;

     public Manusia (String Bernafas, String Bergerak) {  
        this.Bernafas = Bernafas;
        this.Bergerak = Bergerak;
    }
    
    /**
     * @return the Bernafas
     */
    protected String getBernafas() {
        return Bernafas;
    }

    /**
     * @param Bernafas the Bernafas to set
     */
    protected void setBernafas(String Bernafas) {
        this.Bernafas = Bernafas;
    }

    /**
     * @return the Bergerak
     */
    protected String getBergerak() {
        return Bergerak;
    }

    /**
     * @param Bergerak the Bergerak to set
     */
    protected void setBergerak(String Bergerak) {
        this.Bergerak = Bergerak;
    }

}
