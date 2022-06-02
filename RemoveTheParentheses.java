public class RemoveTheParentheses {
    public static String removeParentheses(final String str) {
       String updated = str.replaceAll("\\([^()]*\\)", "");
        if (updated.contains("(")) updated = removeParentheses(updated);     
        return updated;
    }
}