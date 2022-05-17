package ejemplo;


public class Escaleno extends Triangulo {

    public Escaleno(double ladoA, double ladoB,double ladoC){
        super(ladoA,ladoB,ladoC);
    }

    @Override
    public String descripcion() {
        return" soy un triangulo escaleno";
    }

    @Override
    public double getArea() {
        double semiPerimetro=0;
        double area=0;
        semiPerimetro=(getLadoA()+getLadoB()+getLadoC())/2;
        area=(Math.sqrt(semiPerimetro*(semiPerimetro-getLadoA())*(semiPerimetro-getLadoB())*(semiPerimetro-getLadoC())));
        return area;
    }



}
