package factoryMethod1;

public class Main {

    public static void main(String[] args) {
        aterioivaOtus opettaja = new Opettaja();
        aterioivaOtus oppilas = new Oppilas();
        aterioivaOtus siivooja = new Siivooja();
        
        opettaja.aterioi();
        oppilas.aterioi();
        siivooja.aterioi();
    }
}