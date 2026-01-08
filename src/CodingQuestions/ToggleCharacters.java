package CodingQuestions;

public class ToggleCharacters {
    public static void main(String[] args) {
        String str = "@tEsT#123";
        StringBuilder updatedStr = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
             if(Character.isLetter(ch)) {
                 if(Character.isUpperCase(ch)) {
                     updatedStr.append(Character.toLowerCase(ch));
                 } else {
                     updatedStr.append(Character.toUpperCase(ch));
                 }
             }
             else {
                updatedStr.append(ch);
            }
        }
        System.out.println(updatedStr);
    }
}
