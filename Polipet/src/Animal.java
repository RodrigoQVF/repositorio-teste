public abstract class Animal {

    private String nome;
    private Double peso;
    //COMENTARIOS FODAS PRA AJUDAR O OUTRO A LER O CODIGO

    public Animal(String nome, Double peso){
        this.nome = nome;
        this.peso = peso;
    }



    public abstract void emitirSom();
    public abstract Double calcularDiariaCuidado();
    public abstract String listarAnimal();
    public abstract boolean getDomesticado();

}