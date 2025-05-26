public class EnergiaP extends Energia{

    public EnergiaP (double m, double g, double h){
        this.m = m;
        this.g = 9.8;
        this.h = h;
    }

    @Override
    public double calcularEnergia(){
        return m * g * h;
    };

    @Override
    public void exibirResultados() {
        System.out.println("Massa (KG): " + String.format("%.2f", m));
        System.out.println("Altura (M): " + String.format("%.2f", h));
        System.out.println("Energia Potencial (J): " + String.format("%.2f", calcularEnergia()));
        System.out.println();
    }
}