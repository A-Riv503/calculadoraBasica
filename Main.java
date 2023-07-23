import javax.swing.*;

public class Main {

    public static void interfaz(int eleccion){
        switch (eleccion){
            case 1:
                System.out.println("suma");
                calcularResultado(eleccion);
            break;

            case 2:
                System.out.println("resta");
                calcularResultado(eleccion);
            break;

            case 3:
                System.out.println("multiplicacion");
                calcularResultado(eleccion);
            break;

            case 4:
                System.out.println("divicion");
                calcularResultado(eleccion);
            break;
        }
    }

    public static void calcularResultado(int operacion){
        float num1=Float.parseFloat(JOptionPane.showInputDialog("ingrese su primer numero:"));
        float num2=Float.parseFloat(JOptionPane.showInputDialog("ingrese su segundo numero:"));
        Calculadora seleccionOperacion=new Calculadora(num1,num2);//llamamiento del constructor

        if(operacion==1){
           float resultadoSuma= seleccionOperacion.suma();
           seleccionOperacion.mostrarResultados(resultadoSuma);
        }if(operacion==2){
            float resultadoResta=seleccionOperacion.resta();
            seleccionOperacion.mostrarResultados(resultadoResta);
        }if(operacion==3){
            float resultadoMulti=seleccionOperacion.multi();
            seleccionOperacion.mostrarResultados(resultadoMulti);
        }if(operacion==4){
            float resultadoDivicion=seleccionOperacion.divicion();
            if(resultadoDivicion==0.0f){
                System.out.println("no se puede dividir entre 0");
            }else{
              seleccionOperacion.mostrarResultados(resultadoDivicion);
            }
        }
    }

    public static void main(String[] args) {
        /*crea una calculadora basica que pueda realizar las operaciones simples, suma resta multiplicacion y divicion, la calculadora debe de tener metodos para
        * realizar cada una de estas operaciones y un metodo para mostrar resultados, ademas debe de tener un constructor que inicialice los valores necesarios,
        * debe de tener su menu, debe de preguntar si desea realizar otro calculo y subdividir las funcionalidades en dos metodos: un metodo llamar para realizar
        * las operaciones del switch*/

    int continuar;

    do{
        int seleccionInterfaz=Integer.parseInt(JOptionPane.showInputDialog("Que Operacion decea realizar: 1-suma 2-resta 3-multiplicacion 4-divicion"));
        interfaz(seleccionInterfaz);

        continuar=Integer.parseInt(JOptionPane.showInputDialog("DESEA HACER OTRA OPERACION: 1-SI 2-NO"));

    }while(continuar==1);

        System.out.println("programa finalizado");







    }
}