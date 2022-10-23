import org.testng.Assert;
import org.testng.annotations.Test;

public class FizzBuzzTest {

    //1.Positive testing happy path
    //if (start <= end)
    //return array;

    //start < end
    @Test

    public void testStartLessThanEnd_HappyPath() {
        ///AAA
        //Arrange
        int start = 1;
        int end = 20;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8",
                "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz", "16", "17", "Fizz", "19", "Buzz"};
        //act
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);

        //Assert
        Assert.assertEquals(actualResult, expectedResult);
    }

    //2.start == end
    //return "Buzz"
    @Test

    public void testStartEqualsEnd_HappyPath() {

        int start = 20;
        int end = 20;
        String[] expectedResult = {"Buzz"};
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }
    //2.Negative testing
    //if (start > end)
    //return new String [0];

    @Test
    public void testStartLargerEnd_NegativeTest() {

        int start = 20;
        int end = 1;
        String[] expectedResult = {};
        String[] actualResult = new FizzBuzz().fizzBuzz(start, end);
        Assert.assertEquals(actualResult, expectedResult);
    }
}
