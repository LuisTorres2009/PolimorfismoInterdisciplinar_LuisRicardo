public class EnergiaM extends Energia{
    
    public EnergiaM (double m, double g, double h, double v){
        this.m = m;
        this.g = 9.8;
        this.h = h;
        this.v = v;
    }

    @Override
    public double calcularEnergia(){
        return (m * g * h) + (m * (v * v) * 1 / 2);
    };

    @Override
    public void exibirResultados(){
        System.out.println("Massa(KG): "+m+ "\nAltura(M): "+h+"\nVelocidade(M/S): "+v+"\nEnergia Potencial(J): "+(m * g * h)+"\nEnergia Cinética(J): "+((m * (v * v) * 1/2))+"\nEnergia Mecânica: "+(calcularEnergia())+"\n");
    };
}
