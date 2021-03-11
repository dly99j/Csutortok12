package masodikOra;

public class Complex {

    public double re;
    public double im;

    public double abs() {

        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }

    public void add(Complex c) {

        re += c.re;
        im += c.im;
    }

    public void sub(Complex c) {

        re -= c.re;
        im -= c.im;
    }

    public void mul(Complex c) {

        re = re * c.re - im * c.im;
        im = im * c.re + re * c.im;
    }

    public void conjugate() {

        im *= -1;
    }

    public void reciprocate() {

        re = re/(Math.pow(re, 2) + Math.pow(im, 2));
        im = -im/(Math.pow(re, 2) + Math.pow(im, 2));
    }

    public void div(Complex c) {

        re = ((re * c.re) + (im * c.im)) / (Math.pow(c.re, 2) + Math.pow(c.im, 2));
        im = ((im * c.re) + (re * c.im)) / (Math.pow(c.re, 2) + Math.pow(c.im, 2));
    }
}