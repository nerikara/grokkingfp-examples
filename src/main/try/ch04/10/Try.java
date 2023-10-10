import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Try {
    static int score(String word) {
        return word.replaceAll("a", "").length();
    }

    static int scoreWithBonus(String word) {
        int base = score(word);
        if (word.contains("c"))
            return base + 5;
        else
            return base;
    }

    static int scoreWithBonusAndPenalty(String word) {
        int bonus = scoreWithBonus(word);
        return word.contains("s") ? bonus - 7 : bonus;
    }

    static List<String> rankedWords(Function<String, Integer> wordScore, List<String> words) {
        Comparator<String> wordComparator = (w1, w2) -> Integer.compare(wordScore.apply(w2), wordScore.apply(w1));
        return words.stream().sorted(wordComparator).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> words = Arrays.asList("ada", "haskell", "scala", "java", "rust");

        Function<String, Integer> scoreWithBonusAndPenaltyFunction =
            w -> scoreWithBonusAndPenalty(w);
        rankedWords(scoreWithBonusAndPenaltyFunction, words);
    }
}
