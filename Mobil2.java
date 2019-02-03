public class Mobil2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Mobil sedan = new Mobil();

        sedan.start(true);
        sedan.gantiGigi(4);
        sedan.gas();
        sedan.rem(true);
        sedan.stop(true);
        sedan.gas();
    }
    
}
