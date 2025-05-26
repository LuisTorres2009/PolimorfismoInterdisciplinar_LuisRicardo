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
    public void exibirResultados(){
        System.out.println("Massa(KG): "+m+ "\nVelocidade(M/S): "+v+"\nEnergia Cinética(J): "+(calcularEnergia())+"\n");
    };
}
