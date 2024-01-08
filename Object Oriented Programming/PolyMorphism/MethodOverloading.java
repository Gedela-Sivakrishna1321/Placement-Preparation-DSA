package PolyMorphism;

public class MethodOverloading {
    
    public static void main(String[] args) {
     
       Calculator calculator = new Calculator();
       System.out.println( calculator.sum(2.3f, 2.9f));
       System.out.println( calculator.sum(2, 3));
       System.out.println( calculator.sum(2, 8, 11));
       
       
       
       
       
       
       
    }

}

class Calculator {
    
    int sum(int a, int b) {
        return a+b;
    }

    float sum(float a, float b) {
        return a+b;
    }

    int sum(int a, int b, int c) {
        return a+b+c;
    }
}
