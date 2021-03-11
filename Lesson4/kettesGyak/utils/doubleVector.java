package kettesGyak.utils;

public class doubleVector {

    private double[] vector;

    public doubleVector(double[] arr) {

        vector = arr.clone();
    }

    public int getLen() {

        return vector.length;
    }

    public double getAt(int i) {

        return vector[i];
    }

    public double scalar(doubleVector v) {

        if (this.getLen() == v.getLen()) {

            double sum = 0;
            for (int i = 0; i < this.getLen(); i++) {

                sum += this.getAt(i) * v.getAt(i);
            }
            return sum;
        } else {

            throw new IllegalArgumentException();
        }
    }

    public doubleVector add(doubleVector v) {

        if (this.getLen() == v.getLen()) {

            double[] arr = new double[this.getLen()];
            for (int i = 0; i < this.getLen(); i++) {

                arr[i] = this.getAt(i) + v.getAt(i);
            }
            return new doubleVector(arr);
        } else {

            throw new IllegalArgumentException();
        }
    }

    public doubleVector sub(doubleVector v) {

        if (this.getLen() == v.getLen()) {

            double[] arr = new double[this.getLen()];
            for (int i = 0; i < this.getLen(); i++) {

                arr[i] = this.getAt(i) - v.getAt(i);
            }
            return new doubleVector(arr);
        } else {

            throw new IllegalArgumentException();
        }
    }

    public doubleVector mulWithScalar(double s) {

        double[] arr = new double[this.getLen()];
        for (int i = 0; i < this.getLen(); i++) {

            arr[i] = this.getAt(i) * s;
        }
        return new doubleVector(arr);
    }

    public String toString() {

        String str = "(";
        for (int i = 0; i < this.getLen(); i++) {

            str += Double.toString(this.getAt(i)) + ", ";
        }
        String res = str.substring(0, str.length()-2);
        res += ")";
        return res;
    }
}
