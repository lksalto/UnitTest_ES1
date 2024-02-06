package leandro;

public class Calculadora {

    public double add(double a, double b)
    {
        return a + b;
    }

    public double multiplica(double a, double b)
    {
        return a * b;
    }


    public double divide(double a, double b)
    {
        if(b!=0)
        {
            return a/b;
        }
        else
        {
            return 0;
        }
        
    }

    public boolean maior(double a, double b)
    {
        return a > b;
    }

    public double raiz(double a, int b)
    {
        return Math.pow(b, 1/a);
    }

    public double exp(double a, double b)
    {
        return Math.pow(a,b);
    }


    
}
