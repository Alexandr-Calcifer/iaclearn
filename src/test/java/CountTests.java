import book.chapter7.tasks.FunctionSolver;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import strings.StringTaskSolver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountTests {

    @ParameterizedTest(name = "Tested {index} tasks {displayName}")
    @CsvFileSource(
            resources = "/countPunctuationMarksTest.csv",
            delimiter = '|',
            nullValues = {"NULL"},
            numLinesToSkip = 1
    )
    public void countPunctuationMarksTest(
            String input,
            int expected) {
        assertEquals(expected, StringTaskSolver.countPunctuationMarks(input));
    }

    @ParameterizedTest(name = "Tested {index} tasks {displayName}")
    @CsvFileSource(
            resources = "/sumOfDigitsTest.csv",
            delimiter = ';',
            nullValues = {"NULL"},
            numLinesToSkip = 1
    )
    public void sumOfDigitsTest(
            String input,
            int expected) {
        assertEquals(expected, StringTaskSolver.sumOfDigits(input));
    }

    @ParameterizedTest(name = "Tested {index} tasks {displayName}")
    @CsvFileSource(
            resources = "/countWordOccurrencesTest.csv",
            delimiter = ';',
            nullValues = {"NULL"},
            numLinesToSkip = 1
    )
    public void countWordOccurrencesTest(
            String input,
            String word,
            int expected) {
        assertEquals(expected, StringTaskSolver.countWordOccurrences(input, word));
    }

    @ParameterizedTest(name = "Tested {index} tasks {displayName}")
    @CsvFileSource(
            resources = "/countWordsStartingWithUppercaseTest.csv",
            delimiter = ';',
            nullValues = {"NULL"},
            numLinesToSkip = 1
    )
    public void countWordsStartingWithUppercaseTest(
            String input,
            int expected) {
        assertEquals(expected, StringTaskSolver.countWordsStartingWithUppercase(input));
    }

    @ParameterizedTest(name = "Tested {index} tasks {displayName}")
    @CsvFileSource(
            resources = "/countWordOccurrencesInTextsTest.csv",
            delimiter = ';',
            nullValues = {"NULL"},
            numLinesToSkip = 1
    )
    public void countWordOccurrencesInTextsTest(
            String input,
            String word,
            int expected) {
        assertEquals(expected, StringTaskSolver.countWordOccurrencesInTexts(input, word));
    }

    @ParameterizedTest(name = "Tested {index} tasks {displayName}")
    @CsvFileSource(
            resources = "/countOccurrencesTest.csv",
            delimiter = ';',
            nullValues = {"NULL"},
            numLinesToSkip = 1
    )
    public void countOccurrencesTest(
            String input,
            String word,
            int expected
    ) {
        assertEquals(expected, FunctionSolver.countOccurrences(input, word));
    }
}
