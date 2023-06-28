package account;

import java.time.LocalDate;

public class Account {
    private String username;
    private String bio;
    private LocalDate signupDate;
    private int favorriteNr;

    public void displayUserAccount() {
        System.out.println(this.username + ": " + this.bio);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public LocalDate getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(LocalDate signupDate) {
        this.signupDate = signupDate;
    }

    public int getFavorriteNr() {
        return favorriteNr;
    }

    public void setFavorriteNr(int favorriteNr) {
        this.favorriteNr = favorriteNr;
    }
}

