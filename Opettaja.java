package factoryMethod1;

public class Opettaja extends aterioivaOtus {

    public Juoma createJuoma(){
        return new Vesi();
    };

}
