public class Reptil extends Animal{
    public String corEscama;
    public Reptil(String nome, String raca, String nome_Tutor, String habitat, String corescama) {
        super(nome, raca, nome_Tutor, habitat);
        this.corEscama = corescama;
    }

    public void seRasteja(){
        System.out.println("O réptil rastejou");
    }
}
