/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appmusica;

/**
 *
 * @author Leo
 */
public class AppMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PlayerMusica play = new PlayerMP3();
    System.out.println("Tocando música do tipo: " + play.play());
    PlayerMusica play1 = new PlayWAV();
    System.out.println("Tocando música do tipo: " + play1.play());
    play=play1;
    System.out.println("Tocando música do tipo: " + play.play());
    }
 }
    

