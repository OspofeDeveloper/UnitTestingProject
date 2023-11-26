package Controlador;

import java.math.BigInteger;
import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RelojTest {

    //Path Coverage
    //Decision y Condition coverage
    @Test
    void TestReloj(){
        Reloj stopwatch = new Reloj();
        stopwatch.start();
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        stopwatch.stop();
        long expected1 = 5;
        long actual1 = stopwatch.getElapsedSeconds();
        assertEquals(expected1, actual1);

        stopwatch.start();
        try{
            TimeUnit.SECONDS.sleep(0);
        }catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        stopwatch.stop(); //En el stop forzamos stopWatchRunning = false
        long expected2 = 0;
        long actual2 = stopwatch.getElapsedSeconds();
        assertEquals(expected2, actual2);

        //Aseguramos statement coverage
        stopwatch.start(); //En el start forzamos stopWatchRunning = true
        try{
            TimeUnit.SECONDS.sleep(2);
        }catch (InterruptedException e) {
            System.out.println("got interrupted!");
        }
        long expected3 = 2;
        long actual3 = stopwatch.getElapsedSeconds();
        assertEquals(expected3, actual3);
        //Al asegurar statement coverage -> hacemos automaticamente path coverage y condition coverage
    }
}