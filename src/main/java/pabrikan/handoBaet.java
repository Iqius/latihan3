/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pabrikan;

import kendaraan.sepedaMotor;
/**
 *
 * @author ASUS
 */
public class handoBaet extends sepedaMotor{
    public handoBaet(String warnaMotor){
        super(warnaMotor);
        this.ukuranTangki = 4;
    }
        
    public boolean jalan() {
        if(super.jalan()){
            System.out.println("Motor Baet akan habis bensin pada "+ super.cekKapanHabis());
            return true;
        } else {
            return false;
        }
    }
}
