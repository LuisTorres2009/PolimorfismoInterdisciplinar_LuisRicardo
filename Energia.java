public abstract class Energia {
    public double m;
    public double g = 9.8;
    public double h;
    public double v;

    public double getG(){
        return g;
    }

    public double getM(){
        return m;
    }

    public double getH(){
        return h;
    }

    public double getV(){
        return v;
    }

    public void setM(double m){
        this.m = m;
    }

    public void setH(double h){
        this.h = h;
    }

    public void setV(double v){
        this.v = v;
    }

    public abstract double calcularEnergia();

    public abstract void exibirResultados();
}
