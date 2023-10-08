//Unit test for finding friends

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

class FriendFinderTest {
    
	@Test
    void testGetFriendNames() {
        String[] expected = {"Van Halen", "Steve Vai", "Robert Plant", "Mickey Dee", "Mick Mars"};
        String[] actual = FriendFinder.getFriendNames("src/main/resources/names.txt");
        assertArrayEquals(expected, actual);
    }


    @Test
    void testPerformanceGetFriendNames() {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            FriendFinder.getFriendNames("src/main/resources/names.txt");
        }

        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;

        System.out.println("Total time taken for 1000 executions: " + totalTime + " milliseconds");
    }
}
