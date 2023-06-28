package methods;

import java.util.ArrayList;
import java.util.List;

public class DoggyDaycare {
    private List<Dog> dogList = new ArrayList<>();

    private String name;
    private String phoneNumber;


    public List<Dog> getDogList() {
        return dogList;
    }

    public  void setDogList(List<Dog> dogList) {
        this.dogList = dogList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
