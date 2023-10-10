import java.util.Scanner;

public class pruebaCalculadora {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        double num1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        double num2 = scanner.nextDouble();

        System.out.println("Ingrese la operación a realizar (suma, resta, multiplicacion, division):");
        String operacion = scanner.next();

        double resultado;

        switch (operacion) {
            case "suma":
                resultado = num1 + num2;
                System.out.println("El resultado de la suma es: " + resultado);
                break;

            case "resta":
                resultado = num1 - num2;
                System.out.println("El resultado de la resta es: " + resultado);
                break;

            case "multiplicacion":
                resultado = num1 * num2;
                System.out.println("El resultado de la multiplicación es: " + resultado);
                break;

            case "division":
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("El resultado de la división es: " + resultado);
                } else {
                    System.out.println("Error! División por cero no está permitida.");
                }
                break;

            default:
                System.out.println("Operación no reconocida. Por favor ingrese suma, resta, multiplicacion o division.");
                break;
        }

        scanner.close();
    }
}

