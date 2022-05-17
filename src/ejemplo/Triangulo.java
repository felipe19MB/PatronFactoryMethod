package ejemplo;

public abstract class Triangulo {
    private double ladoA;
    private  double ladoB ;
    private  double ladoC;

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    public double getLadoA() {
        return ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public Triangulo(double ladoA, double ladoB, double ladoC){
        setLadoA(ladoA);
        setLadoB(ladoB);
        setLadoC(ladoC);
    }

    public abstract String descripcion();

    public abstract double getArea();


}
