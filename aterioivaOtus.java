package factoryMethod1;

public abstract class aterioivaOtus {
	Juoma juoma = null;

    public abstract Juoma createJuoma();


    public void aterioi(){
        syö();
        juo();
    }

    public void syö(){
        System.out.println("Kylläpä ruoka maistuukin hyvältä");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian jälkeen " + juoma + " tekee terää");
    }
}
