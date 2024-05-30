package org.example;

public class Main {
    public static void main(String[] args) throws Exception {
        Vector vector1 = new Vector(1, 2, 3);
        Vector vector2 = new Vector(4, 5, 6);

        Vector sumVector = vector1.add(vector2);
        System.out.println("Сумма векторов: (" + sumVector.getX() + ", " + sumVector.getY() + ", " + sumVector.getZ() + ")");

        Vector subtractVector = vector1.subtract(vector2);
        System.out.println("Вычитание векторов: (" + subtractVector.getX() + ", " + subtractVector.getY() + ", " + subtractVector.getZ() + ")");

        int multiply = vector1.multiply(vector2);
        System.out.println("Умножение векторов: " + multiply);

        double lengthVector1 = vector1.length_of_vector();
        System.out.println("Длина 1 вектора: " + lengthVector1);

        double lengthVector2 = vector2.length_of_vector();
        System.out.println("Длина 2 вектора: " + lengthVector2);

        double cos = vector1.find_cos(vector2);
        System.out.println("Косинус угла между векторами: " + cos);
    }
}