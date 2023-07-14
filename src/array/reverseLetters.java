package array;

import java.util.stream.IntStream;

public class reverseLetters {
    public static  char [] getreversedWords(char [] array){
         reverse(array, 0, array.length);
         int currentInitIndex = 0;
        for (int i = 0; i <= array.length ; i++) {
            if( i == array.length || array[i] == ' ' ){
                reverse(array, currentInitIndex,i);
                currentInitIndex = i +1;
            }
        }
        return array;

    }
    public static char [] reverse( char[]array , int init, int end){
        int length =end - init;
        end--;
        for (int i = init; i < (length/2)+init ; i++) {
            char aux;
            int invPosition = end --;
            aux = array[invPosition];
            array[invPosition] = array[i];
            array[i] = aux;
        }
        return array;
    }

    public static void main(String[] args) {
        char [] array = getreversedWords("the eagle has landed".toCharArray());
        IntStream.rangeClosed(0, array.length-1).forEach(x -> System.out.println(array[x]));
    }
}
