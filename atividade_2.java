public class main {
    public static void main(String[] args) {
    Random rand = new Random(); 
    int numeroAleatorio = rand.nextInt(100) + 1;
    int tentativas = 0; 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha um número entre 1 e 100:");
    
        while (true) { 
            System.out.print("Digite sua escolha: ");
            int palpite = scanner.nextInt(); 
            tentativas++; 
    
            if (palpite < numeroAleatorio) {
                System.out.println("Tente um número mais alto."); 
            } else if (palpite > numeroAleatorio) {
                System.out.println("Tente um número mais baixo."); 
            } else {
                System.out.println("Você acertou o número em " + tentativas + " tentativas.");
                break
            }
        }
    
        scanner.close(); 
    }
    }