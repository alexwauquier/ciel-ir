// Fractales - Question 3 : Écrivez la classe SetOfRules
public class SetOfRules {
    private final Rule[] rules;

    public SetOfRules(Rule[] rules) {
        this.rules = rules;
    }

    public String apply(String sequence) {
        StringBuilder newSequence = new StringBuilder();

        // Parcourt chaque caractère de la séquence
        for (char c : sequence.toCharArray()) {
            boolean replaced = false;

            // Parcourt les règles pour trouver une correspondance
            for (Rule rule : rules) {
                if (rule.getSymbol() == c) {
                    newSequence.append(rule.getSequence());
                    replaced = true;
                    break;
                }
            }

            // Si aucune règle ne correspond, conserve le caractère original
            if (!replaced) {
                newSequence.append(c);
            }
        }

        return newSequence.toString();
    }
}
