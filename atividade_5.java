public class main{
    public static void main(String[] args) {
    Random rand = new Random(); 
    int[] numeros = new int[30]; /
    
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }
    
        int contadorImpares = 0; 
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                contadorImpares++; 
            }
        }
        System.out.println("Números mostrados:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
    
        System.out.println("Números ímpares:  " + contadorImpares);
    }
    }