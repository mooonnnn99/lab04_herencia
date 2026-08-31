public class Main {
    public static void main(String[] args){
        System.out.println("\t---Batalla RPG---\n");
        Guerrero guerrero = new Guerrero("Black Widow", 9, 100, 200, "Armadura de Cuero");
            guerrero.atacar();
            guerrero.defender();
        
        Mago mago = new Mago("Doctor Strange", 10, 80, 100, "Varita de Hechicería");
            mago.atacar();
            mago.defender();
            mago.recibirDanio(20);

        Arquero arquero = new Arquero("Hawkeye", 8, 90, "Arco Compuesto", 50);
            arquero.atacar();
            arquero.defender();
            arquero.recibirDanio(90);
        
        System.out.println(guerrero.toString());
        System.out.println(mago.toString());
        System.out.println(arquero.toString());
    }
}
