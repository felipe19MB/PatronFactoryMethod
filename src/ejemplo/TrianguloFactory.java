package ejemplo;

public class TrianguloFactory implements TrianguloFactoryMethod {
    @Override
    public Triangulo createTriangulo(double ladoA, double ladoB, double ladoC) {
        if ((ladoA == ladoB) && (ladoA == ladoC)) {
            return new Equilatero(ladoA, ladoB, ladoC);
        }else if((ladoA!=ladoB) &&(ladoA!=ladoC) && (ladoB!=ladoC)){
            return new Escaleno(ladoA, ladoB, ladoC);
        }else{
            return new Isoceles(ladoA, ladoB, ladoC);
        }

    }
}
