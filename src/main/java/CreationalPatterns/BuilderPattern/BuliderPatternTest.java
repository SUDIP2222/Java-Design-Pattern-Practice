package CreationalPatterns.BuilderPattern;

//Builder constructs complex objects by separating construction and representation

public class BuliderPatternTest {
    public static void main(String args[]) {
        BankAccount bankAccount = new BankAccount
                .BankAccountBuilder("Sudip","3435676766")
                .withEmail("sudipdiu@gmail.com")
                .wantNewsLetter(true).build();

        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getAccountNumber());
        System.out.println(bankAccount.getEmail());
        System.out.println(bankAccount.isNewsletter());
    }
}
