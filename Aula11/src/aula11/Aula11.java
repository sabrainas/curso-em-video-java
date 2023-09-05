package aula11;

import java.util.HashSet;

public class Aula11 {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();
        
        v1.setNome("sabrina");
        v1.setIdade(19);
        v1.setSexo("F");
        System.out.println(v1.toString());
        
        Aluno a1 = new Aluno();
        a1.setNome("Claudio");
        a1.setMatricula(1111);
        a1.setCurso("Informática");
        a1.setIdade(16);
        a1.setSexo("M");
        System.out.println(a1.toString());
        a1.pagarMensalidade();
        
        Bolsista b1 = new Bolsista();
        b1.setNome("Guanabara");
        b1.setMatricula(1234);
        b1.setBolsa(12);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
