public class profesor  extends Thread{
    @Override
    public void run() {
        try {
            int x=0;
            synchronized (Claseppal.llegada){
                Claseppal.llegada.wait(3000);
                System.out.println("===== Empiezo la PRIMERA desinfeccion =====");
                for(int i=0;i<Claseppal.llegada.size();i++){
                    desinfetar(Claseppal.llegada.get(i));
                    x=i;
                }
                Claseppal.llegada.wait(31000);
                System.out.println("===== Empiezo la SEGUNDA desinfeccion =====");
                for(int i=x+1;i<Claseppal.llegada.size();i++){
                    desinfetar(Claseppal.llegada.get(i));
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void desinfetar(String numero) throws InterruptedException {
        System.out.println("El profesor empieza a desinfectar a Alumno "+numero);
        sleep(1000);
        System.out.println("Alumno "+numero+" desinfectado");
    }
}
