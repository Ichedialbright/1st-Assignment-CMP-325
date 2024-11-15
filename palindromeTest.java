import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class palindromeTest {
    @Test
    public void testforpalindrome(){
        palindrome p = new palindrome();

        assertEquals(true, p.isitaPalindrome("racer"));

    }

}