package aula01;

public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;
    public void status() {
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?" + this.tampada);
    }


    public void escrever() {
        if(this.tampada == true) {
            System.out.println("Erro! Não posso escrever");
        }else {
            System.out.println("Estou escrevendo");
        }
    }

    public void tampar() {
        this.tampada = true; //este método público pode mexer no atributo privado "tampada" pois está dentro da mesma classe
    }

    public void destampar() {
        this.tampada = false;
    }
}
