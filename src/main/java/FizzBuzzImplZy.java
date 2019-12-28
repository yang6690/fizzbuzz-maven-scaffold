import java.util.ArrayList;
import java.util.List;

public class FizzBuzzImplZy {

    private List<Integer> array = new ArrayList();

    public String numOff(int param) {
        String res = String.valueOf(param);
        if (param % 3 == 0 && param % 5 == 0 && param % 7 == 0) {
            res = "FizzBuzzWhizz";
        } else if (param % 3 == 0 && param % 5 == 0) {
            res = "fizzbuzz";
        } else if (param % 7 == 0 && param % 3 == 0) {
            res = "FizzWhizz";
        } else if (param % 7 == 0 && param % 5 == 0) {
            res = "BuzzWhizz";
        } else if (param % 3 == 0) {
            res = "fizz";
        } else if (param % 5 == 0) {
            res = "buzz";
        } else if (param <= 0) {
            res = "invalid input";
        }
        return res;
    }

    public int initArray(List<Integer> params) {
        this.array = params;
        return array.size();
    }
}
