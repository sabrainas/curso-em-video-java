public class Caneta {
    public String modelo;
    public String cor;
    protected float ponta;
    private int carga;
    private boolean tampada;
    
    //void - sem retorno
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("carga:  " + this.carga);
        System.out.println("esta tampada? " + this.tampada);
    }
    public void rabiscar(){
        if(this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        }else{
            System.out.println("Estou rabiscando");
        }
    }
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
}
