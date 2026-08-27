package org.tsebom.impatient;

public class ControlFlow {
    public static void main(String[] args) {

        String seasonName = switch (6) {
            case 0 -> "Winter";
            case 1 -> "Spring";
            case 2 -> "Summer";
            case 3 -> "Fall";
            default -> {
                System.out.println("qqqq");
                yield "ZZZZ";
            }
        };

        System.out.println(seasonName);
    }
}
