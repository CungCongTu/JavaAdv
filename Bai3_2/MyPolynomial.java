package Bai3_2;

public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    public double[] getCoeffs() {
        return coeffs;
    }

    public int getDegree() {
        return coeffs.length-1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = coeffs.length-1; i >= 0; i--) {
            sb.append(coeffs[i] + (i != 0 ? "*x^"+i+" + ":""));
        }
        return sb.toString();
    }

    public double evaluate(double x)
    {
        double sum  = 0.0;
        double item = 1.0;
        for (int i = 0; i < coeffs.length; i++) {
            item *= (i == 0 ? 1.0 : x);
            sum  += item * coeffs[i] ;
        }
        return sum;
    }

    public MyPolynomial add(MyPolynomial another)
    {
        MyPolynomial result = this;
        if (result.getDegree() < another.getDegree()) {
            result  = another;
            another = this;
        }

        double[] resultCoeffs  = result.getCoeffs();
        double[] anotherCoeffs = another.getCoeffs();
        for (int i = 0; i < resultCoeffs.length; i++)
        {
            if (i > anotherCoeffs.length-1) {
                continue;
            }
            resultCoeffs[i] += anotherCoeffs[i];
        }
        return new MyPolynomial(resultCoeffs);
    }

    public MyPolynomial multiply(MyPolynomial another)
    {
        double[] resultCoeffs  = new double[this.getDegree() + another.getDegree()+1];
        double[] anotherCoeffs = another.getCoeffs();
        for (int i =0; i < resultCoeffs.length; i++)
        {
            double tmp = 0.0;
            for (int j = 0; j <= i; j++)
            {
                if (j > coeffs.length-1) {
                    continue;
                }
                if (i-j > anotherCoeffs.length-1) {
                    continue;
                }
                tmp += coeffs[j] * anotherCoeffs[i-j];
            }
            resultCoeffs[i] = tmp;
        }
        return new MyPolynomial(resultCoeffs);
    }
}
