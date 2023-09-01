package aula05;
public class ContaBanco {
    //atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    //metodos
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }else if("CP".equals(t)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!!");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Saque seu dinheiro para fechar a conta");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta em débito");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso!!");
        }
    }
    
    public void depositar(double v){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + getDono());
        }else{
            System.out.println("Impossível depositar");
        }
    }
    public void sacar(double v){
        if(this.getStatus()){
            if(this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível sacar");
        }
    }
    public void mensalidade(){
        int v = 0;
        if("CC".equals(this.getTipo())){
            v = 12;
        }else if(this.getTipo() == "CP"){
            v = 20;
        }
        if(this.getStatus()){
            if(this.getSaldo() > v){
                this.setSaldo(this.getSaldo() - v);
            }else{
                System.out.println("Saldo insuficiente");
            }
        }else{
            System.out.println("Impossível pagar");
        }    
    }
    //metodos especiais

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    //metodo construtor
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }
}
