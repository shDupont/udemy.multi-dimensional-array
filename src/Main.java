import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Integer columns, rows;

        System.out.println("Enter number of rows");
        rows = sc.nextInt();
        System.out.println("Enter number of columns");
        columns = sc.nextInt();

        int[][] n = new int[rows][columns];

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                n[i][j] = sc.nextInt();
            }
        }

        int numberSelected = sc.nextInt();

        for (int i = 0; i < n.length; i++) {
            for (int j = 0; j < n[i].length; j++) {
                if (n[i][j] == numberSelected){
                    System.out.println("Position: "+
                            i + ", " + j);
                    if (n[i][j] != -1 && j-1 >= 0){
                        System.out.println("Left: " + n[i][j-1]);
                    }
                    if (n[i][j] != -1 && j+1 < n[i].length){
                        System.out.println("Right: " + n[i][j+1]);
                    }
                    if (n[i][j] != -1 && i-1 >= 0){
                        System.out.println("Top: " + n[i-1][j]);
                    }
                    if (n[i][j] != -1 && i+1 < n.length) {
                        System.out.println("Down: " + n[i + 1][j]);
                    }
                }

            }
        }
    }

}