package factoryMethod1;

public class Oppilas extends aterioivaOtus {
	public Juoma createJuoma(){
        return new Mehu();
    }
}
