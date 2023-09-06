package aula14;
public class Aula14 {
    public static void main(String[] args) {
        Video v[] = new Video[5];
        v[0] = new Video("Aula 1 de poo");
        v[1] = new Video("Aula 2 de poo");
        v[2] = new Video("Aula 3 de poo");
        v[3] = new Video("Aula 4 de poo");
        v[4] = new Video("Aula 5 de poo");
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Sabrina", 19, "F", "sa");
        g[1] = new Gafanhoto("Guanabara", 30, "M", "guanabara");
       
        System.out.println(v[0].toString());
        System.out.println(g[0].toString());
    }
    
}
