public class Operations {
    /*
        They are basically of 7 types:
        Arithmetic Operators: +, -, *, /, %
        Relational Operators: ==, !=, >, <, >=, <=
        Logical Operators: &&, ||, !
        Assignment Operators: =, +=, -=, *=, /=, %=
        Unary Operators: +, -, ++, --, !
        Ternary Operator: condition ? value_if_true : value_if_false
        Bitwise Operators: &, |, ^, ~, <<, >>, >>>
    */
    void findSign(int a){
        if(a > 0){
            System.out.println("positive");
        } else if (a < 0) {
            System.out.println("Negative");
        }else{
            System.out.println("ZERO");
        }
    }
    void isVoterCheck(int age, boolean check){
        if(age >= 18 && check) {
            System.out.println("Candidate is valid for vote");
        }else{
            System.out.println("Candidate is not valid for vote");
        }
    }
    void checkNumIsEvenOrDivisibleByFive(int number){
        if(number % 2 == 0 || number % 5 == 0) {
            System.out.println(number + " is either even or divisible by 5");
        }else{
            System.out.println(number + " is not either even or divisible by 5");
        }
    }
    void loginAuthentication(String username, String password){
        if(username.equals("admin") && password.equals("1234")){
            System.out.println("Login Successful");
        }else{
            System.out.println("Login Unsuccessful");
        }
    }
    void checkGrade(int marks){
        String gradeValue = (marks >= 90) ? "A" : (marks >= 75) ? "B" : (marks >= 55) ? "C" : "Fail";
        System.out.println(gradeValue);
    }
    public static void main(String[] args) {
        int a = 4;
        if(a % 2 == 0) {
            System.out.println(a + " is even number");
        }else{
            System.out.println(a + " is odd number");
        }
        Operations obj1 = new Operations();
        obj1.findSign(-4);
        obj1.isVoterCheck(21,true);
        obj1.checkNumIsEvenOrDivisibleByFive(25);
        obj1.loginAuthentication("admin","1234");
        obj1.checkGrade(77);
    }
}
