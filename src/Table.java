import java.util.ArrayList;

/**
 * テーブルを表すクラス。
 */
public class Table {
    private ArrayList<Card[]> disposedCards_ = new ArrayList<>();

    public void disposeCard(Card[] card) {
        for (int index = 0; index < card.length; index++) {
            System.out.print(card[index] + "");
        }
        System.out.println("を捨てました");
        disposedCards_.add(card);
    }
}
