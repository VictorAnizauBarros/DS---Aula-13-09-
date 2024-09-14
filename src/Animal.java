public class Animal {
    public String nome;

    public Animal(String nome, String raca, String nome_Tutor, String habitat) {
        this.nome = nome;
        this.raca = raca;
        this.nome_Tutor = nome_Tutor;
        this.habitat = habitat;
    }

    private String raca;
    private String nome_Tutor;
    private String habitat;


    public void fazerRuido(){
        System.out.println("Animal emite um urro ");
    }

    public void alimentarSe(){
        System.out.println("Animal se alimenta");
    }

}


