import java.util.*;

public class alumnos extends Thread{
    @Override
    public void run() {
            int sleepingTime=0;
            Random r = new Random();
            boolean llegaTarde = r.nextBoolean();
            if (!llegaTarde) {
                sleepingTime = r.nextInt(5000);
            } else
                sleepingTime = r.nextInt(20000) + 8000;

            try {
                sleep(sleepingTime);
                llegar(getName());
                Claseppal.llegada.add(getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    }

    public static void llegar(String name){
        System.out.println("Ha llegado Alumno "+name);
        System.out.println("El Alumno "+name+" espera a que el profesor le desinfecte");
    }
}
