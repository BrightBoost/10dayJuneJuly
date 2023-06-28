import account.Account;

public class App {
    public static void main(String[] args) {
        String name = "Bojan";

        // primitives
        byte b = 5;
        short age2 = 32;
        int age = 25;
        long bigNr = 12345678900L;
        double speed = 30.6;
        float weight = 30.4f;
        char c = 'c';
        boolean niceLanguage = true;

        // problem with doubles (not Java specific problem)
        double x = 0;
        for(int i = 0; i < 100; i++) {
            x = x + 0.01;
            System.out.println(x);
        }

        // account
        Account account = new Account();
        account.setUsername("Gaia");
        account.setBio("Maaike's daughter");
        System.out.println(account.getUsername());
        account.displayUserAccount();


    }
}
