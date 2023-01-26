import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    int[] myInput = {1, 2, 3, 4, 5};
    ArrayExamples.reverseInPlace(myInput);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, myInput);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    int[] myInput = {1, 2, 3, 4, 5};
    ArrayExamples.reversed(myInput);
    assertArrayEquals(new int[]{5, 4, 3, 2, 1}, myInput);
  }

}
