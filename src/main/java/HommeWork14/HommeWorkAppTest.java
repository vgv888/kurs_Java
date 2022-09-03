package HommeWork14;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HommeWorkAppTest {

    @BeforeEach
    void setUp() {
        HommeWorkApp HommeWork14 = new HommeWorkApp();
    }

    @Test
    @DisplayName("Test 1 convertArray")
    void test1ConvertArray(){
        Assertions.assertArrayEquals(new Integer[]{1, 7}, HommeWorkApp.convertArray(1, 2, 4, 4, 2, 3, 4, 1, 7));
    }

    @Test
    @DisplayName("Test 2 convertArray")
    void test2ConvertArray(){
        Assertions.assertArrayEquals(new Integer[]{5, 6}, HommeWorkApp.convertArray(1, 2, 3, 4, 5, 6));
    }

    @Test
    @DisplayName("convertArray. Test array = null")
    public void checkNull() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            Integer[] array = new Integer[0];
            HommeWorkApp.convertArray(array);
        });
    }

    @Test
    @DisplayName("convertArray. The array does not have 4")
    public void checkNot4() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            HommeWorkApp.convertArray(1, 2, 3, 5);
        });
    }

    @Test
    @DisplayName("Test 1 checkArray")
    void test1CheckArray(){
        Assertions.assertTrue(HommeWorkApp.checkArray(1, 1, 1, 4, 4, 1, 4, 4));
    }

    @Test
    @DisplayName("Test 2 checkArray")
    void test2CheckArray(){
        Assertions.assertFalse(HommeWorkApp.checkArray(1, 1, 1, 1, 1, 1));
    }

    @Test
    @DisplayName("Test 3 checkArray")
    void test3CheckArray(){
        Assertions.assertFalse(HommeWorkApp.checkArray(4, 4, 4, 4));
    }


    @Test
    @DisplayName("Test 4 checkArray")
    void test4CheckArray(){
        Assertions.assertFalse(HommeWorkApp.checkArray(1, 4, 4, 1, 1, 4, 3));
    }

    @org.junit.jupiter.api.Test
    void convertArray() {
    }

    @org.junit.jupiter.api.Test
    void checkArray() {
    }
}