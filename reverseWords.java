public class reverseWords {
        public static void main(String[] args) {
            String str = "Hello World";

            String[] words = str.split(" ");

            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String reversedWord = "";

                // Reverse each word using another loop
                for (int j = word.length() - 1; j >= 0; j--) {
                    reversedWord += word.charAt(j);
                }

                result.append(reversedWord).append(" ");
            }
            System.out.println("Original:" + str);
            System.out.println("Reversed Words:" + result.toString().trim());
        }
    }


