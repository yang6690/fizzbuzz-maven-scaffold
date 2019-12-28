import java.util.ArrayList;
import java.util.List;

public class FizzBuzzImplZy {

    private List<Integer> array = new ArrayList();

    public String numOff(int param) {
        if(param % 3 == 0 && param % 5 == 0 && param % 7 == 0 ){
            return "FizzBuzzWhizz";
        }else if (param % 3 == 0 && param % 5 == 0) {
            return "fizzbuzz";
        } else if (param % 7 == 0 && param % 3 == 0){
            return "FizzWhizz";
        } else if (param % 7 == 0 && param % 5 == 0){
            return "BuzzWhizz";
        } else if (param % 3 == 0) {
            return "fizz";
        } else if (param % 5 == 0) {
            return "buzz";
        } else if(param <= 0) {
            return "invalid input";
        }
        return String.valueOf(param);
    }

    public int initArray(List<Integer> params) {
        this.array = params;
        return array.size();
    }
}
