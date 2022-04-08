public class Alumne {
    public String nom;

    public void saluda() {
        System.out.println("Hola, em dic" + nom);
    }
    public Alumne(String nom) {
        this.nom=nom;
    }

    public static void main(String[] args) {
        Alumne ivan=new Alumne("ivan");
        ivan.saluda();

    }
}
