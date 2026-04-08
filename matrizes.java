import java.util.Scanner;

public class matrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Matriz 3x3");
            System.out.println("2 - Contar negativos");
            System.out.println("3 - Soma de matrizes");
            System.out.println("4 - Diagonal principal");
            System.out.println("5 - Transposta 3x3");
            System.out.println("6 - Multiplicação de matrizes");
            System.out.println("7 - Verificar simétrica");
            System.out.println("8 - Média linhas/colunas");
            System.out.println("9 - Jogo da Velha");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();

            switch(opcao) {
                case 1: matriz3x3(sc); break;
                case 2: contarNegativos(sc); break;
                case 3: somaMatrizes(sc); break;
                case 4: diagonalPrincipal(sc); break;
                case 5: transposta(sc); break;
                case 6: multiplicacao(sc); break;
                case 7: simetrica(sc); break;
                case 8: medias(sc); break;
                case 9: jogoDaVelha(sc); break;
                case 0: System.out.println("Saindo..."); break;
                default: System.out.println("Opção inválida!");
            }

        } while(opcao != 0);

        sc.close();
    }

    // ===== ATIVIDADE 1 =====
    public static void matriz3x3(Scanner sc) {
        int[][] matriz = new int[3][3];

        System.out.println("Digite matriz 3x3:");
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                matriz[i][j] = sc.nextInt();

        System.out.println("=== MATRIZ ===");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }
    }

    // ===== ATIVIDADE 2 =====
    public static void contarNegativos(Scanner sc) {
        int[][] matriz = new int[5][5];
        int negativos = 0;

        System.out.println("Digite matriz 5x5:");
        for(int i = 0; i < 5; i++)
            for(int j = 0; j < 5; j++) {
                matriz[i][j] = sc.nextInt();
                if(matriz[i][j] < 0) negativos++;
            }

        System.out.println("Total de negativos: " + negativos);
    }

    // ===== ATIVIDADE 3 =====
    public static void somaMatrizes(Scanner sc) {
        int[][] A = new int[4][4];
        int[][] B = new int[4][4];
        int[][] soma = new int[4][4];

        System.out.println("Digite matriz A:");
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Digite matriz B:");
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                B[i][j] = sc.nextInt();

        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                soma[i][j] = A[i][j] + B[i][j];

        System.out.println("=== RESULTADO ===");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++)
                System.out.print(soma[i][j] + " ");
            System.out.println();
        }
    }

    // ===== ATIVIDADE 4 =====
    public static void diagonalPrincipal(Scanner sc) {
        int[][] matriz = new int[4][4];

        System.out.println("Digite matriz 4x4:");
        for(int i = 0; i < 4; i++)
            for(int j = 0; j < 4; j++)
                matriz[i][j] = sc.nextInt();

        System.out.println("Diagonal principal:");
        for(int i = 0; i < 4; i++)
            System.out.print(matriz[i][i] + " ");
    }

    // ===== ATIVIDADE 5 =====
    public static void transposta(Scanner sc) {
        double[][] matriz = new double[3][3];

        System.out.println("Digite matriz 3x3:");
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                matriz[i][j] = sc.nextDouble();

        System.out.println("=== TRANSPOSTA ===");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++)
                System.out.print(matriz[j][i] + " ");
            System.out.println();
        }
    }

    // ===== ATIVIDADE 6 =====
    public static void multiplicacao(Scanner sc) {
        int[][] A = new int[2][3];
        int[][] B = new int[3][2];
        int[][] R = new int[2][2];

        System.out.println("Digite matriz A (2x3):");
        for(int i = 0; i < 2; i++)
            for(int j = 0; j < 3; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Digite matriz B (3x2):");
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 2; j++)
                B[i][j] = sc.nextInt();

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                R[i][j] = 0;
                for(int k = 0; k < 3; k++)
                    R[i][j] += A[i][k] * B[k][j];
            }
        }

        System.out.println("=== RESULTADO ===");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++)
                System.out.print(R[i][j] + " ");
            System.out.println();
        }
    }

    // ===== ATIVIDADE 7 =====
    public static void simetrica(Scanner sc) {
        int[][] matriz = new int[3][3];
        boolean ehSimetrica = true;

        System.out.println("Digite matriz 3x3:");
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                matriz[i][j] = sc.nextInt();

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                if(matriz[i][j] != matriz[j][i])
                    ehSimetrica = false;

        if(ehSimetrica)
            System.out.println("A matriz é simétrica");
        else
            System.out.println("A matriz NÃO é simétrica");
    }

    // ===== ATIVIDADE 8 =====
    public static void medias(Scanner sc) {
        double[][] matriz = new double[3][4];

        System.out.println("Digite matriz 3x4:");
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 4; j++)
                matriz[i][j] = sc.nextDouble();

        System.out.println("=== MATRIZ ===");
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++)
                System.out.print(matriz[i][j] + " ");
            System.out.println();
        }

        for(int i = 0; i < 3; i++) {
            double soma = 0;
            for(int j = 0; j < 4; j++)
                soma += matriz[i][j];
            System.out.println("Média linha " + i + ": " + (soma / 4));
        }

        for(int j = 0; j < 4; j++) {
            double soma = 0;
            for(int i = 0; i < 3; i++)
                soma += matriz[i][j];
            System.out.println("Média coluna " + j + ": " + (soma / 3));
        }
    }

    // ===== ATIVIDADE 9 =====
    public static void jogoDaVelha(Scanner sc) {

        char[][] tabuleiro = new char[3][3];
        char jogador = 'X';
        int jogadas = 0;

        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                tabuleiro[i][j] = ' ';

        while(true) {

            System.out.println("\nTABULEIRO:");
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(" " + tabuleiro[i][j] + " ");
                    if(j < 2) System.out.print("|");
                }
                System.out.println();
                if(i < 2) System.out.println("---+---+---");
            }

            System.out.println("Jogador " + jogador + " (linha e coluna 0-2): ");
            int l = sc.nextInt();
            int c = sc.nextInt();

            if(l < 0 || l > 2 || c < 0 || c > 2) {
                System.out.println("Posição inválida!");
                continue;
            }

            if(tabuleiro[l][c] != ' ') {
                System.out.println("Posição ocupada!");
                continue;
            }

            tabuleiro[l][c] = jogador;
            jogadas++;

            for(int i = 0; i < 3; i++) {
                if((tabuleiro[i][0]==jogador && tabuleiro[i][1]==jogador && tabuleiro[i][2]==jogador) ||
                   (tabuleiro[0][i]==jogador && tabuleiro[1][i]==jogador && tabuleiro[2][i]==jogador)) {
                    System.out.println("Jogador " + jogador + " venceu!");
                    return;
                }
            }

            if((tabuleiro[0][0]==jogador && tabuleiro[1][1]==jogador && tabuleiro[2][2]==jogador) ||
               (tabuleiro[0][2]==jogador && tabuleiro[1][1]==jogador && tabuleiro[2][0]==jogador)) {
                System.out.println("Jogador " + jogador + " venceu!");
                return;
            }

            if(jogadas == 9) {
                System.out.println("Deu velha!");
                return;
            }

            jogador = (jogador == 'X') ? 'O' : 'X';
        }
    }
}