/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas_cth.hitungluasvolume;

/**
 *
 * @author Marsy
 */
public class DemoHitungLuasVolume {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Balok b = new Balok(12, 6, 4);
        Kubus k = new Kubus(3);
        
        System.out.print("balok; ");
        System.out.print("Volume: " + b.HitungVolume());
        System.out.print("Luas Permukaan: " + b.HitungLuasPermukaan());
        
        System.out.print("kubus: ");
        System.out.print("volume: " + k.HitungVolume());
        System.out.print("luaspermukaan: " + k.HitungLuasPermukaan());
    }
    
}
