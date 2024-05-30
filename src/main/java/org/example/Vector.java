package org.example;

public class Vector {
    private int x;
    private int y;
    private int z;

    public Vector(int x, int y, int z) throws Exception {
        if (x == 0 && y == 0 && z == 0) {
            throw new Exception("Задание нулевого вектора");
        }
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public Vector add(Vector vector) throws Exception {
        return new Vector(x + vector.getX(), y + vector.getY(), z + vector.getZ());
    }

    public Vector subtract(Vector vector) throws Exception {
        return new Vector(x - vector.getX(), y - vector.getY(), z - vector.getZ());
    }

    public int multiply(Vector vector) {
        return x * vector.getX() + y * vector.getY() + z * vector.getZ();
    }

    public double length_of_vector(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double find_cos(Vector vector){
        return  multiply(vector)/(this.length_of_vector() * vector.length_of_vector());
    }
}