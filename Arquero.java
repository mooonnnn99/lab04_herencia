public class Arquero extends Personaje{
    private String tipoArco;
    private int flechasDisponibles;

    public Arquero(String nombre, int nivel, int puntosVida, String tipoArco, int flechasDisponibles){
        super(nombre, nivel, puntosVida);
        this.tipoArco = tipoArco;
        this.flechasDisponibles = flechasDisponibles;
    }
    public String getTipoArco(){
        return tipoArco;
    }
    public int getflechasDisponibles(){
        return flechasDisponibles;
    }

    @Override
    public void atacar(){
        super.atacar();
        if(flechasDisponibles > 0){
            flechasDisponibles--;
            System.out.println(getNombre() + " dispara una flecha con su " + tipoArco + ". Flechas restantes: " + flechasDisponibles);
        } else {
            System.out.println(getNombre() + " no tiene flechas disponibles para atacar.");
        }
    }
    @Override
    public void defender(){
        super.defender();
        System.out.println(getNombre() + " se protege con su arco " + tipoArco + ".");
    }
    @Override
    public String toString(){
        return super.toString() + " (Tipo de Arco: " + tipoArco + ", Flechas Disponibles: " + flechasDisponibles + ")";
    }
}
