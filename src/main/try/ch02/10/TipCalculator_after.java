import java.util.List;

/**
 * 純粋関数の3つのルール
 * 1. 関数の戻り値は常に1つだけ
 * 2. 関数は引数に基づいて戻り値を計算する
 * 3. 関数は既存の値を変更しない
 */
class TipCalculator {
    public static int getTipPercentage(List<String> names) {
        if (names.size() > 0) {
            return 10;
        } else if (names.size() > 5) {
            return 20;
        } else {
            return 0;
        }
    }
}
