package HommeWork4;

import java.util.Random;
import java.util.Scanner;

public class Implementation {
    private static final int SIZE = 3;
    private static final char DOT_MAN = 'X';
    private static final char DOT_COMP  = '0';
    private static final char DOT_EMPTY = '.';

    public static final String HADER_FERST = "*";
    public static final String SPACE_MAP = " ";

    private static char[][] MAP = new char[SIZE][SIZE];

    private static Scanner in = new Scanner(System.in);
    private static Random random = new Random();
    private static int turnsCount;
    private static int lastTurnRow;
    private static int lastTurnColumn;


    public static void main(String[] args) {
        initMap();
        printMap();
        playGame();
    }

    private static void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printMapHader();
        printMapBody();

    }

    private static void printMapHader(){
        System.out.print(HADER_FERST + SPACE_MAP);
        for (int i = 0; i < SIZE ; i++) {
            prinMapNumber(i);

        }
        System.out.println();

    }

    private static void prinMapNumber(int i) {
        System.out.print(i + 1 + SPACE_MAP);
    }
    private static void printMapBody() {
        for (int i = 0; i < SIZE; i++) {
            prinMapNumber(i);
            for (int j = 0; j < SIZE; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP);
            }
            System.out.println();
        }

    }

    private static void playGame() {
       while (true){
        manTurn();
        printMap();
        if(checkEnd(DOT_MAN)){
            break;
        }

        copTurn();
        printMap();
        if(checkEnd(DOT_COMP)) {
            break;
    }
    }
    }

    private static boolean checkEnd(char symbol) {
        if (checkWin(symbol)){
            if(symbol == DOT_MAN){
                System.out.println(" Поздравляю вы победили!!!");
            } else {
                System.out.println("Вам не повезло, победил компютер!!!");
            }
            return true;
        }

        if(checkDraw()){
            System.out.println("Ничья");
            return true;
        }
        return  false;
    }

    private static boolean checkDraw() {
        return turnsCount >= SIZE * SIZE;
    }


    private static void manTurn() {
        System.out.println("Ваш ход: ");
        int rowNumber;
        int columnNumber;

        while (true) {

            System.out.println("Введите номер строки: ");
            rowNumber = in.nextInt() - 1;

            System.out.println("Введите номер столбца: ");
            columnNumber = in.nextInt() - 1;

            if (isCallFree(rowNumber, columnNumber)) {
                break;
            }
            System.out.println("Ячейка с координатами" + rowNumber + 1 + ":" + columnNumber + 1 + " уже заняты");

        }
            MAP[rowNumber][columnNumber] = DOT_MAN;
        turnsCount++;

    }

    private static boolean checkWin(char symbol) {
        if (MAP[0][0] == symbol && MAP[0][1] == symbol && MAP[0][2] == symbol) {
            return true;
        }
        if (MAP[1][0] == symbol && MAP[1][1] == symbol && MAP[1][2] == symbol) {
            return true;
        }
        if (MAP[2][0] == symbol && MAP[2][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][0] == symbol && MAP[2][0] == symbol) {
            return true;
        }
        if (MAP[0][1] == symbol && MAP[1][1] == symbol && MAP[2][1] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][2] == symbol && MAP[2][2] == symbol) {
            return true;
        }

        if (MAP[0][0] == symbol && MAP[1][1] == symbol && MAP[2][2] == symbol) {
            return true;
        }
        if (MAP[0][2] == symbol && MAP[1][1] == symbol && MAP[2][0] == symbol) {
            return true;
        }

        return false;
    }

    private static void copTurn() {
        System.out.println("\n ход компютера ");
        int rowNumber;
        int columNumber;
        do{
            rowNumber = random.nextInt(SIZE);
            columNumber = random.nextInt(SIZE);
        } while (!isCallFree(rowNumber,columNumber));
        MAP[rowNumber][columNumber] = DOT_COMP;
    }
        private static boolean isCallFree(int rowNumber, int columNumber) {
        return MAP[rowNumber][columNumber] == DOT_EMPTY;
    }


    private static void logik(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j <  SIZE ; j++) {

            }

        }



        }



    }









