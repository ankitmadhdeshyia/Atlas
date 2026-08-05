import java.security.SecureRandom;

class Account {

    private String password;

    public String getPassword() {
        setPassword(new SecureRandom().nextLong(1000000000) + "");// we can set the password here, but we cannot access it from outside the class
                            // because it is private it will generate a random password every time we call
                            // the getPassword method
        return this.password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

}

public class Bank {
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println(account.getPassword());// we can access the password from outside the class because we have a
                                                  // public method to get it
    }
}