public class EmailExampleTest {
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
    public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };
    private static final String EMAIL_REGEX =   "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    public static void main(String[] args) {
        for (String email : validEmail) {
            boolean isvalid = email.matches(EMAIL_REGEX);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
        for (String email : invalidEmail) {
            boolean isvalid = email.matches(EMAIL_REGEX);
            System.out.println("Email is " + email +" is valid: "+ isvalid);
        }
    }
}
