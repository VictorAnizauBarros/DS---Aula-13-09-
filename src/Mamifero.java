public class Mamifero extends Animal{
    public String corPelo;

    public Mamifero(String nome, String raca, String nome_Tutor, String habitat, String corpelo) {
        super(nome, raca, nome_Tutor, habitat);
        this.corPelo = corpelo;
    }

    public void amamentar(){
        System.out.println("Amamentar a cria");
    }
}
