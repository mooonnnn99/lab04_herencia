public class Mago extends Personaje{
    private int nivelMagia;
    private String Varita;

    public Mago(String nombre, int nivel, int puntosVida, int nivelMagia, String varita) {
        super(nombre, nivel, puntosVida);
        this.nivelMagia = nivelMagia;
        this.Varita = varita;
    }
    public int getnivelMagia(){
        return nivelMagia;
    }
    public String getVarita(){
        return Varita;
    }

    @Override
    public void atacar(){
        super.atacar();
    }
    @Override
    public void defender(){
        super.defender();
    }
    @Override
    public String toString(){
        return super.toString() + " (Nivel de Magia: " + nivelMagia + ", Varita: " + Varita + ")";
    }
}
