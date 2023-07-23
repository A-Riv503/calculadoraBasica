public class Calculadora {
    float num1;
    float num2;

    public Calculadora(float num1, float num2){
        this.num1=num1;
        this.num2=num2;
    }

    public float suma(){
        float resultadoSuma=num1+num2;
        return resultadoSuma;
    }

    public float resta(){
        float resultadoResta=num1-num2;
        return resultadoResta;
    }

    public float multi(){
        float resultadoMulti=num1*num2;
        return resultadoMulti;
    }

    public  float divicion(){

        if(num2!=0){
            float resultadoDivicion=num1/num2;
            return resultadoDivicion;

        }
        float error=0.0f;

        return error;


   }

    public void mostrarResultados(float resultado){
        System.out.println("el resultado de la operacion es de: "+resultado);
    }
}
