/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kendaraan;

import java.time.LocalDateTime;
/**
 *
 * @author ASUS
 */
public class sepedaMotor {
    private String warnaMotor;
    protected int ukuranTangki;
    private LocalDateTime waktuIsiBensin;
    
    public sepedaMotor(String warnaMotor) {
        this.warnaMotor = warnaMotor;
        this.ukuranTangki = 3;
    }
    public void isiTangkiFull(){
        this.waktuIsiBensin = LocalDateTime.now();
    }
    public String cekKapanHabis(){
        LocalDateTime  waktuHabis;
        waktuHabis = this.waktuIsiBensin.plusHours(1*this.ukuranTangki);
        String jamHabis =waktuHabis.toString();
        return jamHabis.substring(0,10)+ " "+ jamHabis.substring(11,19);
    }
    public boolean jalan(){
        if(this.waktuIsiBensin == null) {
            System.out.println("Bensin habis, sepeda motor tidak dapat jalan");
            return false;
        } else {
            System.out.println("Sepeda motor  sedang berjalan");
            return true;
        }
    }
}