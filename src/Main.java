public class Main {
    public static void main(String[] args) {
        Ave ave = new Ave("Jurema","Sabiá","Lebron","Gaiola","preto");
        Mamifero mamifero = new Mamifero("José", "Bode", "Zé do Bode", "roça","branco");
        Reptil reptil = new Reptil("André", "Aligattor","Daniel","Lago", "verde");

        mamifero.amamentar();
        reptil.seRasteja();

    }
}