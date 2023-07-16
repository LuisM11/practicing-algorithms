package hashset;

import java.util.HashSet;
import java.util.Set;

public class MoviesinFlight {


    public static boolean canTwoMoviesFillFlight(int[] moviesizes, int flightsize) {

        // movie sizes we've seen so far
        Set<Integer> moviesizesSeen = new HashSet<>();

        for (int firstMoviesize : moviesizes) {

            int matchingSecondMoviesize = flightsize - firstMoviesize;
            if (moviesizesSeen.contains(matchingSecondMoviesize)) {
                return true;
            }

            moviesizesSeen.add(firstMoviesize);
        }

        // we never found a match, so return false
        return false;
    }

}
