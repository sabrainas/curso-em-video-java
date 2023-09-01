package aula05;
import java.util.HashSet;
public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1234);
        p1.setDono("Sabrina");
        p1.abrirConta("CC");
        p1.depositar(300);
        p1.estadoAtual();
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(5678);
        p2.setDono("Mendonca");
        p2.abrirConta("CP");
        p2.depositar(500);
        p2.sacar(100);
        p2.estadoAtual();

    }  
}
