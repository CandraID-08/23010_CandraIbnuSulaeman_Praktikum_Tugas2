/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas_2;

/**
 *
 * @author User
 */
public class Matematika implements InterfaceMatematika {

    // method pertambahan
    public void pertambahan(int a, int b) {
        int c = a + b;
        System.out.println("pertambahan " + a + " + " + b + " = " + c);
    }
    // method pengurangan
    public void pengurangan(int a, int b) {
        int c = a - b;
        System.out.println("pengurangan " + a + " - " + b + " = " + c);
    }

    // method perkalian
    public void perkalian(int a, int b) {
        int c = a * b;
        System.out.println("perkalian   " + a + " * " + b + " = " + c);
    }

    // method pembagian
    public void pembagian(float a, float b) {
        float c = a / b;
        System.out.println("pembagian   " + a + " / " + b + " = " + c);
    }
}

