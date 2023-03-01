package solutions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class SolutionTest {

    private List<Integer> numbers1;
    private List<Integer> numbers2;

    @BeforeEach
    public void beforeEach() {
        numbers1 = List.of(2, -1, 6, 3, 8, 22, 10);
        numbers2 = List.of();
    }

    @Test
    public void runTestAsc() {

        var expected1 = List.of(-1, 2, 3, 6, 8, 10, 22);
        var expected2 = numbers2;

        var actual1 = Solution.run(numbers1, "asc");
        var actual2 = Solution.run(numbers2, "asc");

        Assertions.assertEquals(actual1, expected1);
        Assertions.assertEquals(actual2, expected2);

    }

    @Test
    public void runTestDsc() {

        var expected1 = List.of(22, 10, 8, 6, 3, 2, -1);
        var expected2 = numbers2;

        var actual1 = Solution.run(numbers1, "desc");
        var actual2 = Solution.run(numbers2, "desc");

        Assertions.assertEquals(actual1, expected1);
        Assertions.assertEquals(actual2, expected2);

    }

    @Test
    public void runWithOneParameter() {

        var expected1 = List.of(-1, 2, 3, 6, 8, 10, 22);
        var expected2 = numbers2;

        var actual1 = Solution.run(numbers1);
        var actual2 = Solution.run(numbers2);

        Assertions.assertEquals(actual1, expected1);
        Assertions.assertEquals(actual2, expected2);
    }
}
