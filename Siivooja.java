package factoryMethod1;

public class Siivooja extends aterioivaOtus {

    public Juoma createJuoma(){
        return new Maito();
    };
}
