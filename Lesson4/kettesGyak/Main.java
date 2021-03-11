package kettesGyak;

import kettesGyak.utils.doubleVector;

public class Main {

    public static void main(String[] args) {

        double[] arr = {1, 2, 3, 4, 5};
        double[] arr2 = {6, 7, 8, 9, 10};
        double d = new doubleVector(arr).scalar(new doubleVector(arr2));
        doubleVector v = new doubleVector(arr).add(new doubleVector(arr2));
        doubleVector v2 = new doubleVector(arr).sub(new doubleVector(arr2));
        doubleVector v3 = new doubleVector(arr).mulWithScalar(5);
        System.out.println(new doubleVector(arr).toString());
        System.out.println(new doubleVector(arr2).toString());
        System.out.println("skalárszorzat");
        System.out.println(d);
        System.out.println("összeadás");
        System.out.println(v.toString());
        System.out.println("kivonás");
        System.out.println(v2.toString());
        System.out.println("skalárral szorzás (1. vector * 5)");
        System.out.println(v3.toString());
    }
}
