import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class FizzBuzzTest {
    @Test
    public void shouldReturnFizzGivenNumberDivisibleBy3() {
        //given
        int number = 3;
        //when
        String result = FizzBuzz.of(number);
        ///then
        assertThat(result).isEqualTo("Fizz");
    }
}