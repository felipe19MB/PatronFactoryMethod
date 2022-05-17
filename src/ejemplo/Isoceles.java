package ejemplo;

public class Isoceles extends Triangulo {

    public Isoceles(double ladoA, double ladoB,double ladoC){
        super(ladoA,ladoB,ladoC);
    }

    @Override
    public String descripcion() {
        return" soy un triangulo Isoceles";
    }

    @Override
    public double getArea() {
        double area=0;
        double altura=0;
        if(getLadoA()!=getLadoB()){
           altura= Math.sqrt((Math.pow(getLadoA(),2))-(Math.pow(getLadoB(),2)/4));
            area=(getLadoB()*altura)/2;

        }
        if(getLadoA()!=getLadoC()){
            altura= Math.sqrt((Math.pow(getLadoA(),2))-(Math.pow(getLadoC(),2)/4));
            area=(getLadoB()*altura)/2;

        }
        return area;

    }



}