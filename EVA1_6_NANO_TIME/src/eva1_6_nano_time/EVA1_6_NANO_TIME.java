/*
 * "Evaluación 1 Practica 6 "Nano Time"
 *  25-25 / 08 / 2022"
 */
package eva1_6_nano_time;

/**
 * @author Quintana Juarez Bryan Alexis
 */
public class EVA1_6_NANO_TIME {

    public static void main(String[] args) {
        long ini = System.nanoTime();
        System.out.println(ini);
        long fin = System.nanoTime();
        long tiempo = fin - ini;
        System.out.println(tiempo);
    }
    
}
