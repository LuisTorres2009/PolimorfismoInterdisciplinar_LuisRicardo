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
    public void exibirResultados(){
        System.out.println("Massa(KG): "+m+ "\nAltura(M): "+h+"\nEnergia Potencial(J): "+(calcularEnergia())+"\n");
    };

}
