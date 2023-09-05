package aula12;
public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        Cachorro c = new Cachorro();
        Tartaruga t = new Tartaruga();
        PeixeDourado pd = new PeixeDourado();
        Arara ar = new Arara();
        Canguru ca = new Canguru();
        
        a.locomover();
        p.locomover();
        r.locomover();
        c.locomover();
        ca.locomover();
        c.emitirSom();
    }
}
