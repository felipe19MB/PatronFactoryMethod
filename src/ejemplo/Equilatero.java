package ejemplo;
import java.util.*;
public class Equilatero extends Triangulo {

    public Equilatero(double ladoA, double ladoB,double ladoC){
        super(ladoA,ladoB,ladoC);
    }

    @Override
    public String descripcion() {
        return" SOY UN TRIANGULO EQUILATERO";
    }

    @Override
    public double getArea() {
          double altura=0;
          double area=0;
          altura=(Math.sqrt(3)*getLadoA())/2;
          area=((Math.sqrt(3))/4)*Math.pow(getLadoA(),2);
          return area;


    }




}
