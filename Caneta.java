package Caneta;

public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;
    void status(){
        System.out.println("modelo "+this.modelo);
        System.out.println("uma caneta "+this.cor);//this = altoreferencia
        System.out.println("ponta: "+this.ponta);
        System.out.println("carga: "+this.carga);
        System.out.println("está tampada? "+this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! nao posso rabiscar");
        }else{
            System.out.println("estou rabiscando");
        }
    }
    void tampar() {
        this.tampada = true;
    }
    void destampar() {
        this.tampada = false;

        /*public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        private boolean tampada;
        void status(){
            System.out.println("modelo "+this.modelo);
            System.out.println("uma caneta "+this.cor);//this = altoreferencia
            System.out.println("ponta: "+this.ponta);
            System.out.println("carga: "+this.carga);
            System.out.println("está tampada? "+this.tampada);
        }
    
        public void rabiscar() {
            if (this.tampada == true) {
                System.out.println("ERRO! nao posso rabiscar");
            }else{
                System.out.println("estou rabiscando");
            }
        }
        public void tampar() {
            this.tampada = true;
        }
        public void destampar() {
            this.tampada = false;
            */
    }
}
