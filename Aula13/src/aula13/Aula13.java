package aula13;
public class Aula13 {
    public static void main(String[] args) {
        //Mamifero x = new Mamifero();
        Cachorro c = new Cachorro();
        
        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(true);
        c.reagir(2, 12.5f);
    }
}
