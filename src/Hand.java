import java.util.ArrayList;

/**
 * ばば抜きの手札を表すクラス。
 */
public class Hand {
    // 手札にあるカードを保持するためのリスト
    private ArrayList<Card> hand_ = new ArrayList<>();

    public void addCard(Card card) {
        hand_.add(card);
    }

    public Card pickCard() {
        return hand_.removeFirst();
    }

    public void shuffle() {
        // 手札の枚数を取得
        int number = hand_.size();
        // カードを抜き出す位置
        int pos;

        for (int count = 0; count < number * 2; count++) {
            pos = (int) (Math.random() * number);
            Card pickedCard = hand_.remove(pos);
            hand_.add(pickedCard);
        }
    }

    public int getNumberOfCards() {
        return hand_.size();
    }

    public Card[] findSameNumberCard() {
        int numberOfCards = hand_.size();
        Card[] sameCards = null;

        if (numberOfCards > 0) {
            int lastIndex = numberOfCards - 1;
            Card lastAddedCard = hand_.get(lastIndex);

            int lastAddedCardNum = lastAddedCard.getNumber();

            for (int index = 0; index < lastIndex; index++) {
                Card card = hand_.get(index);
                if (card.getNumber() == lastAddedCardNum) {
                    sameCards = new Card[2];
                    sameCards[0] = hand_.remove(lastIndex);
                    sameCards[1] = hand_.remove(index);
                    break;
                }
            }
        }

        return sameCards;
    }

    public String toString() {
        StringBuffer string = new StringBuffer();

        int size = hand_.size();
        if (size > 0) {
            for (int index = 0; index < size; index++) {
                Card card = hand_.get(index);
                string.append(card);
                string.append(" ");
            }
        }

        return string.toString();
    }
}
