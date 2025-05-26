public class EnergiaC extends Energia {
    
    public EnergiaC (double m, double v){
        this.m = m;
        this.v = v;
    }

    @Override
    public double calcularEnergia(){
        return m * (v * v) * 1 / 2;
    };

    @Override
    public void exibirResultados() {
        System.out.println("Massa (KG): " + String.format("%.2f", m));
        System.out.println("Velocidade (M/S): " + String.format("%.2f", v));
        System.out.println("Energia Cinética (J): " + String.format("%.2f", calcularEnergia()));
        System.out.println();
    }   
}