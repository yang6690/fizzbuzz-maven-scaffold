import org.junit.Test;

import java.util.ArrayList;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTestZy {

    FizzBuzzImplZy fizzBuzzImpl = new FizzBuzzImplZy();

    @Test
    public void hello_world_test(){
        assertThat("Hello World").isEqualTo("Hello World");
    }

    @Test
    public void when_trible_should_return_fizz_when_three() {
        assertThat(fizzBuzzImpl.numOff(3)).isEqualTo("fizz");
    }

    @Test
    public void when_trible_should_return_fizz_when_six() {
        assertThat(fizzBuzzImpl.numOff(6)).isEqualTo("fizz");
    }

    @Test
    public void when_five_should_return_buzz_when_five() {
        assertThat(fizzBuzzImpl.numOff(5)).isEqualTo("buzz");
    }

    @Test
    public void when_five_should_return_buzz_when_fifteen() {
        assertThat(fizzBuzzImpl.numOff(20)).isEqualTo("buzz");
    }

    @Test
    public void when_other_should_return_num() {
        assertThat(fizzBuzzImpl.numOff(8)).isEqualTo("8");
    }

    @Test
    public void should_return_one() {
        ArrayList<Integer> params = new ArrayList<Integer>();
        params.add(1);
        assertThat(fizzBuzzImpl.initArray(params)).isEqualTo(1);
    }

    @Test
    public void should_return_FizzWhizz() {
        assertThat(fizzBuzzImpl.numOff(21)).isEqualTo("FizzWhizz");
    }

    @Test
    public void should_return_BuzzWhizz() {
        assertThat(fizzBuzzImpl.numOff(35)).isEqualTo("BuzzWhizz");
    }

    @Test
    public void should_return_FizzBuzzWhizz() {
        assertThat(fizzBuzzImpl.numOff(105)).isEqualTo("FizzBuzzWhizz");
    }

    @Test
    public void should_return_invalid_input() {
        assertThat(fizzBuzzImpl.numOff(-1)).isEqualTo("invalid input");
    }


}

