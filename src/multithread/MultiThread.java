/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithread;

import java.util.Timer;

/**
 *
 * @author rashed
 */
public class MultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Timer time = new Timer(); // Instantiate Timer Object

        Thread1 t1 = new Thread1(); // Instantiate Thread1 class
        time.schedule(t1, 0, 1000);

        Thread2 t2 = new Thread2(); // Instantiate Thread1 class
        time.schedule(t2, 0, 2000);
    }

}
