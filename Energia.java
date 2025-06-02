// Classe abstrata base para os tipos de energia
public abstract class Energia {
    public double m; // massa
    public double g = 9.8; // gravidade (valor fixo)
    public double h; // altura
    public double v; // velocidade

    // Métodos getters e setters
    public double getG() { 
        return g; 
    }
    public double getM() { 
        return m; 
    }
    public double getH() { 
        return h; 
    }
    public double getV() { 
        return v; 
    }

    public void setM(double m) { 
        this.m = m; 
    }
    public void setH(double h) { 
        this.h = h; 
    }
    public void setV(double v) { 
        this.v = v; 
    }

    // Métodos abstratos que serão implementados pelas subclasses
    public abstract double calcularEnergia();
    public abstract void exibirResultados();
}