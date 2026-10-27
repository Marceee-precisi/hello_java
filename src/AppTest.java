import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testSwap_values() {
        int[] input = {1, 2};
        App.swap_values(input);
        assertArrayEquals(new int[]{2, 1}, input);

        input = new int[] {97, 23};
        App.swap_values(input);
        assertArrayEquals(new int[]{23, 97}, input);
    }

    @Test
    void testSwap_invalid() {

          int[] input1 = null;
          
          assertThrows(IllegalArgumentException.class,
                () -> App.swap_values(input1));

          int[] input2 = new int[] {1,2,3,4};
          assertThrows(IllegalArgumentException.class,
                () -> App.swap_values(input2));

          int[] input3 = new int[] {1};
          assertThrows(IllegalArgumentException.class,
                () -> App.swap_values(input3));
    }
}
