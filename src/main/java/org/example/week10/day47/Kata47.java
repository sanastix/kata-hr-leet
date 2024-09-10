package org.example.week10.day47;

public class Kata47 {

    public static Boolean isSatorSquare(char[][] tablet) {
        int N = tablet.length;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tablet[i][j] != tablet[j][i] ||
                        tablet[i][j] != tablet[N - 1 - i][N - 1 - j] ||
                        tablet[i][j] != tablet[N - 1 - j][N - 1 - i])
                {
                    return false;
                }
            }
        }
        return true;
    }

}
