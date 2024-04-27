public class Calculadora{

    private int num1;
    private int num2;
    
    public Calculadora(){
    }
    public Calculadora(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
            }

    public void setNum1(int num1){
        this.num1 = num1;
    }
    public int getNum1(){
        return num1;
    }
    public void setNum2(int num2){
        this.num2 = num2;
        }
    public int getNum2(){
        return num2;
    }

    public String operacionSuma(){
        int resultado = num1 + num2;
            return "La suma de " + num1 + " + "+ num2 + " es: " + resultado;

    }
    public String operacionResta(){
        int resultado = num1 - num2;
        return "Este es el resultado de la resta: " + resultado;
    }
    public String operacionMulti(){
        int resultado = num1 * num2;
        return "Este es el resultado de la multiplicación: " + resultado;
    }
    public String operacionDiv(){
        int resultado = num1 / num2;
        return "Este es el resultado de la división: " + resultado;
    }

    
}