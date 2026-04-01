import java.util.Scanner;

public class matrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Matriz 3x3 (entrada e exibição)");
            System.out.println("2 - Contar negativos (5x5)");
            System.out.println("3 - Soma de matrizes 4x4");
            System.out.println("4 - Diagonal principal 4x4");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1:
                    matriz3x3(sc);
                    break;
                case 2:
                    contarNegativos(sc);
                    break;
                case 3:
                    somaMatrizes(sc);
                    break;
                case 4:
                    diagonalPrincipal(sc);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while(opcao != 0);

        sc.close();
    }

   //1.  Crie  um  programa  que  preencha  uma  matriz  3x3  com  números  inteiros informados pelo usuário e, em seguida, exiba a matriz.
    public static void matriz3x3(Scanner sc) {
        int[][] matriz = new int[3][3];

        System.out.println("Digite os valores da matriz 3x3:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatriz:");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 2.  Escreva um programa que lê uma matriz 5x5 de números inteiros e conta quantos elementos são negativos.
    public static void contarNegativos(Scanner sc) {
        int[][] matriz = new int[5][5];
        int negativos = 0;

        System.out.println("Digite os valores da matriz 5x5:");

        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] < 0) {
                    negativos++;
                }
            }
        }

        System.out.println("Quantidade de números negativos: " + negativos);
    }

    // 3.  Escreva um programa que lê duas matrizes 4x4 de números inteiros e calcula a soma das duas matrizes, exibindo o resultado. 
    public static void somaMatrizes(Scanner sc) {
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] soma = new int[4][4];

        System.out.println("Digite a matriz A (4x4):");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("Digite a matriz B (4x4):");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                soma[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("\nMatriz soma:");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(soma[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 4.  Faça  um  programa  que  lê  uma  matriz  4x4  de  números  inteiros  e  exibe  os elementos da diagonal principal.
    public static void diagonalPrincipal(Scanner sc) {
        int[][] matriz = new int[4][4];

        System.out.println("Digite os valores da matriz 4x4:");

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("Diagonal principal:");
        for(int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
        }
        System.out.println();
    }
}