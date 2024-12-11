// Fractales - Question 2 : Écrivez la classe Rule
public class Rule {
    private final char symbol;
    private final String sequence;

    public Rule(char symbol, String sequence) {
        this.symbol = symbol;
        this.sequence = sequence;
    }

    public char getSymbol() {
        return this.symbol;
    }

    public String getSequence() {
        return this.sequence;
    }
}
