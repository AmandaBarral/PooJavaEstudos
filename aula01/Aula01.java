package aula01;

public class Aula01 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "azul";
        // c1.ponta = 0.5f; atributo privado não pode ser acessado fora da classe que foi criado
        c1.tampar();
        c1.status();
        c1.escrever();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic Cristal";
        c2.cor = "vermelha";
        c2.destampar();
        c2.status();
        c2.escrever();
    }
}