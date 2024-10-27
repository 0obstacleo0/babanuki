/**
 * トランプのカードを表すクラス。
 */
public class Card {
    public static final int JOCKER = 0;
    public static final int SUIT_SPADE = 1;
    public static final int SUIT_DIAMOND = 2;
    public static final int SUIT_CLUB = 3;
    public static final int SUIT_HEART = 4;

    private int suit_;
    private int number_;

    public Card(int suit, int number) {
        this.suit_ = suit;
        this.number_ = number;
    }

    public int getNumber() {
        return number_;
    }

    public String toString() {
        StringBuffer string = new StringBuffer();

        if (number_ > 0) {
            switch (suit_) {
                case SUIT_SPADE -> string.append("S");
                case SUIT_DIAMOND -> string.append("D");
                case SUIT_CLUB -> string.append("C");
                case SUIT_HEART -> string.append("H");
                default -> {
                }
            }
            switch (number_) {
                case 1 -> string.append("A");
                case 10 -> string.append("T");
                case 11 -> string.append("J");
                case 12 -> string.append("Q");
                case 13 -> string.append("K");
                default -> {
                }
            }
        } else {
            string.append("JK");
        }

        return string.toString();
    }
}
