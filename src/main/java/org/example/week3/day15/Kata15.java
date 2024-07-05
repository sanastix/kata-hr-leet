package org.example.week3.day15;

public class Kata15 {

    public static String makeComplement(String dna) {
        char[] proteins = dna.toCharArray();
        char[] result = new char[proteins.length];
        char curr = 0;
        for (int i = 0; i < proteins.length; i++) {
            switch (proteins[i]) {
                case 'A':
                    curr = 'T';
                    break;
                case 'T':
                    curr = 'A';
                    break;
                case 'C':
                    curr = 'G';
                    break;
                case 'G':
                    curr = 'C';
                    break;
            }
            result[i] = curr;
        }
        return String.valueOf(result);
    }

}
