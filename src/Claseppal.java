import java.util.*;

public class Claseppal {
    public static final ArrayList<String> llegada = new ArrayList<>();
    final int maximo=10;

    public Claseppal() throws InterruptedException{
        profesor prof = new profesor();
        prof.start();
        for(int i=0;i<maximo;i++) {
            alumnos al1 = new alumnos();
            al1.start();
            al1.setName((i+1)+"");
        }
    }
}
