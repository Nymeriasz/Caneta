package Caneta;

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "fabercastell";
        c2.cor = "preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();

        /*Caneta c1 = new Caneta(); //objeto c1 que utiliza classe caneta
        c1.modelo = "bic";
        c1.cor = "azul";
        //c1.ponta = 0.5f;
        c1.carga = 80; //deixa mexer porque o atributo ta dentro de uma classe que utiliza a classe caneta
        c1.tampar(); 
        c1.status();
        c1.rabiscar();
        */
    }
}
