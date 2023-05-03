package training.java15;

public class TextDemo {

    public static void main(String[] args) {
        String text = """
                    "alma" és "körte"              
                    "werwe"               
                    "werwerwerrwe"               
                """;
        System.out.println("***");
        System.out.println(text);
        System.out.println(text + "***");
        System.out.println("***");

        System.out.println("john\tdoe");
        System.out.println("john\\tdoe");
        System.out.println("john\\tdoe".translateEscapes());
    }
}
