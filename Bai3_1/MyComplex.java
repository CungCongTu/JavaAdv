package Bai3_1;

public class MyComplex {
    private double real;
    private double imag;

    public MyComplex() {
        real = 0.0;
        imag = 0.0;
    }

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public String toString() {
        return "(" + real + "+" + imag + "i" + ")";
    }

    public boolean isReal() {
        imag = (Math.pow(imag, 2));
        if (imag != -1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean isImaginary() {
        imag = (Math.pow(imag, 2));
        if (imag == -1) {
            return true;
        }else {
            return false;
        }
    }

    public boolean equals(double real, double imag) {
        return (this.real == real && this.imag == imag);
    }

    public boolean equals(MyComplex another) {
        return (this.real == another.real && this.imag == another.imag);
    }

    public MyComplex add(MyComplex right) {
        double real = this.real + right.real;
        double imag = this.imag + right.imag;
        return new MyComplex(real, imag);
    }

    public MyComplex subtract(MyComplex right) {
        double real = this.real - right.real;
        double imag = this.imag - right.imag;
        return new MyComplex(real, imag);
    }

    public MyComplex multiply(MyComplex right) {
        double real = this.real * right.real - this.imag * right.imag;
        double imag = this.real * right.imag + this.imag * right.real;
        return new MyComplex(real, imag);
    }

    public MyComplex divide(MyComplex right) {
        double real = this.real / right.real - this.imag * right.imag;
        double imag = this.real / right.imag + this.imag * right.real;
        return new MyComplex(real, imag);
    }

    public MyComplex conjugate() {
        return new MyComplex(real, -imag);
    }
}