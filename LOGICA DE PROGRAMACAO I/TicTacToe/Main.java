import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    static Set<Integer> slotsAvailable = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
    static char[][] gameCharMatrix = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};

    static byte[][] gameMatrixId = new byte[3][3];
    static byte playerId = 1;//Indica de qual jogador é a vez (1 ou -1)

    static void putInMatrix(int num) {
        char c = (playerId == 1) ? 'X' : '0';
        num--;
        gameCharMatrix[num / 3][num % 3] = c;
        gameMatrixId[num / 3][num % 3] = playerId;
    }

    static boolean isMoveAllowed(int num) {
        if (slotsAvailable.contains(num)) {
            slotsAvailable.remove(num);
            return true;
        } else return false;
    }

    static void makeAMove() {
        System.out.printf("\nVez do Jogador %d\n", (playerId == 1) ? 1 : 2);
        System.out.print("As casas disponiveis são: ");
        System.out.println(Arrays.toString(slotsAvailable.toArray()));
        System.out.print("Insira uma casa: ");
        byte num;

        try {
            num = scan.nextByte();
        } catch (InputMismatchException error) {
            System.out.println("Você digitou uma entrada invádilda, tente novamente");
            scan.next();
            return;
        }

        if (!isMoveAllowed(num)) {
            System.out.println("Movimento indisponível");
            return;
        }

        putInMatrix(num);
        printBoard();
        playerId *= -1;
    }

    static boolean isTheGameOver() {
        int[] rowSum = {0, 0, 0};
        int[] columnSum = {0, 0, 0};
        int[] diagnonalSum = {0, 0, 0};//apesar de ter somente 2 diagonais foi usado um vetor de tamanho 3 para usar dentro do loop.
        for (int i = 0; i < 3; i++) {
            diagnonalSum[0] += gameMatrixId[i][i];
            diagnonalSum[1] += gameMatrixId[2 - i][i];
            for (int j = 0; j < 3; j++) {
                rowSum[i] += gameMatrixId[i][j];
                columnSum[j] += gameMatrixId[i][j];
            }
        }
        for (int i = 0; i < 3; i++) {
            if (rowSum[i] == 3 || columnSum[i] == 3 || diagnonalSum[i] == 3) {
                System.out.println("O jogador 1 Ganhou o jogo.");
                return true;
            }
            if (rowSum[i] == -3 || columnSum[i] == -3 || diagnonalSum[i] == -3) {
                System.out.println("O jogador 2 Ganhou o jogo.");
                return true;
            }
        }
        if (slotsAvailable.size() < 1) {
            System.out.println("O tabuleiro está completo, deu velha!");
            return true;
        }
        return false;
    }

    static void printBoard() {
        System.out.printf("  %c | %c | %c \n", gameCharMatrix[0][0], gameCharMatrix[0][1], gameCharMatrix[0][2]);
        System.out.printf("  %c | %c | %c \n", gameCharMatrix[1][0], gameCharMatrix[1][1], gameCharMatrix[1][2]);
        System.out.printf("  %c | %c | %c \n", gameCharMatrix[2][0], gameCharMatrix[2][1], gameCharMatrix[2][2]);
    }

    static void play() {
        System.out.println("Iniciando o jogo da velha.");
        System.out.println("As entradas são os numeros de 1 a 9 conforme mostrado a baixo.");
        System.out.print("  1 | 2 | 3 \n");
        System.out.print("  4 | 5 | 6 \n");
        System.out.print("  7 | 8 | 9 \n");

        while (!isTheGameOver()) {
            makeAMove();
        }
    }

    public static void main(String[] args) {
        play();
    }
}