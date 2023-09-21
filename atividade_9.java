public class main {
    public static void main(String[] args) {
    Random rand = new Random();
    int[] numeros = new int[25];
    
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(100) + 1;
        }
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Digite um número para buscar no array: ");
        int numeroBusca = scanner.nextInt();
    
        boolean encontrado = false;
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBusca) {
                encontrado = true;
                break; 
            }
        }
        if (encontrado) {
            System.out.println("O número " + numeroBusca + " foi encontrado no array.");
        } else {
            System.out.println("O número " + numeroBusca + " não foi encontrado no array.");
        }
    
        scanner.close(); 
    }
}