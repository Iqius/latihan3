/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tp_mod6_1302210086;

import pabrikan.handoBaet;
import pabrikan.yamahaMoi;
/**
 *
 * @author ASUS
 */
public class TP_MOD6_1302210086 {

    public static void main(String[] args) {
        handoBaet motor1 = new handoBaet("glossy");
        yamahaMoi motor2 = new yamahaMoi("cumi");
        
        System.out.println("Motor dengan Class handoBaet");
        motor1.isiTangkiFull();
        motor1.jalan();
        System.out.println("Motor dengan Class yamahaMoi");
        motor2.isiTangkiFull();
        motor2.jalan();
    }
}
