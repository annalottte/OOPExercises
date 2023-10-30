package oop.part6.examples.example9;

public class Main {
    public static void main(String[] args) {
        // Using trim() to remove leading and trailing whitespace
        String stringToTrim = "   Hello, world!   ";

        System.out.println("Original string: '" + stringToTrim + "'");
        String trimmed = stringToTrim.trim();
        System.out.println("Trimmed string: '" + trimmed + "'");

        // Using text blocks (Java 15 and later)
        String textBlock = """
                    This is a multi-line
                    text block.
                    It preserves indentation
                    and line breaks.
                """;

        System.out.println("\nText block:");
        System.out.println(textBlock);

        // Using StringBuilder for efficient string concatenation
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello, ");
        stringBuilder.append("world!");
        stringBuilder.append(" Welcome");
        stringBuilder.append(" to Java!");

        System.out.println("\nUsing StringBuilder:");
        System.out.println(stringBuilder.toString());
    }
}
