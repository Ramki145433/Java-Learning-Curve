package CodingQuestions;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "D!iw*a@l!i'❤️";
        StringBuilder clean = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z' || ch <= 9 || ch == ' '){
                clean.append(ch);
            }
        }
        System.out.println(clean);
    }
}