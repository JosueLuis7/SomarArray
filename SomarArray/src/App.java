// Josué Luís Pimenta Alecrim
// 1261948087
public class App {

    public static int somarArray(int[] array) {
        int soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};

        int resultado = somarArray(numeros);

        System.out.println("Soma: " + resultado);
    }
}