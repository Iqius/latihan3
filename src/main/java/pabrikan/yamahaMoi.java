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
public class yamahaMoi extends sepedaMotor{
    public yamahaMoi(String warnaMotor) {
        super(warnaMotor);
        this.ukuranTangki = 5;
    }
    
    public boolean jalan(){
        if(super.jalan()==true){
            System.out.println("Motor Moi akan habis bensin pada "+ super.cekKapanHabis());
            return true;
        } else {
            return false;
        }
    }
}
