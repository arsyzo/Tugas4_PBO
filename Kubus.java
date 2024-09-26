/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas_cth.hitungluasvolume;

/**
 *
 * @author Marsy
 */
public class Kubus implements hitungLuasVolume{
    private double sisi;
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    //untuk menghitung volume dari kubus
    public double HitungVolume(){
        return sisi * sisi * sisi;
    }
    //untuk menghitung luas permukaan dari kubus
    public double HitungLuasPermukaan(){
        return 6 * (sisi * sisi);
    }
}
