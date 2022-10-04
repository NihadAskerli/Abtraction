/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.abstractiob;

import com.mycompany.abstractiob.bean.BMW;
import com.mycompany.abstractiob.bean.Car;
import com.mycompany.abstractiob.bean.Mustanq;

/**
 *
 * @author ASUS
 */
public class Abstraction {

    public static void main(String[] args) {
//        Car b = new BMW();
//        b.speedUp();
//        Car m = new Mustanq();
//        m.start();
//        Car[] cars = {m, b};
//        startAll(cars);
Car c = new Car() {
    @Override
    public void start() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void stop() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void speedUp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
};
        System.out.println(c.getClass().getName());
    }

    public static void startAll(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            cars[i].start();
        }
    }

}
