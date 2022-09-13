package leet1582;

public class Special_Positions_in_a_Binary_Matrix {
    public static void main(String[] args) {
        int[][] mat = {{0, 0}, {0, 0}, {1, 0}};
        System.out.println(numSpecial(mat));
    }

    public static int numSpecial(int[][] mat) {
        int result = 0;

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) result += check(i, j, mat);
            }
        }

        return result;
    }

    public static int check(int i, int j, int[][] mat) {
        int count = 0;
        for (int k = 0; k < mat[i].length; k++)
            if (mat[i][k] == 1) count++;

        for (int n = 0; n < mat.length; n++)
            if (mat[n][j] == 1) count++;

        if (count == 2) return 1;
        else return 0;
    }
}
