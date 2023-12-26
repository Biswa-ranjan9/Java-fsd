package package1.src;

public class StringConversionExample {
    public static void main(String[] args) {
        // Predefined String
        String originalString = "Hello, World!";

        // Convert String to StringBuilder
        StringBuilder stringBuilder = new StringBuilder(originalString);

        // Convert String to StringBuffer
        StringBuffer stringBuffer = new StringBuffer(originalString);

        // Display the original String
        System.out.println("Original String: " + originalString);

        // Display the converted StringBuilder
        System.out.println("StringBuilder Conversion: " + stringBuilder.toString());

        // Display the converted StringBuffer
        System.out.println("StringBuffer Conversion: " + stringBuffer.toString());
    }
}
