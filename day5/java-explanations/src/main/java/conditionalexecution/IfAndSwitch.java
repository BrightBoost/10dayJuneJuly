package conditionalexecution;

public class IfAndSwitch {
    public static void main(String[] args) {
        int x = 2;
        if(x < 10) {
            System.out.println("x is smaller than 10");
        } else if(x == 10) {
            System.out.println("x is 10");
        } else {
            System.out.println("x is not smaller than 10");
        }

        String favoriteFruit = "blueberries";
        switch(favoriteFruit) {
            case "banana":
                System.out.println("they are great!");
                break;
            case "apple":
                System.out.println("apples are amazing");
                break;
            case "grapefruit":
                System.out.println("the best in the morning");
                break;
            case "strawberries":
                System.out.println("yum");
                break;
            default:
                System.out.println("I dont know " + favoriteFruit);
                break;
        }
    }
}
