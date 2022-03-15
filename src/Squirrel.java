public class Squirrel {
    
    // Minimum 3 private instance variables
    private String color;
    private String gender;
    private int numberOfOffspring;

    // An empty constructor
    public Squirrel() {
        
    }

    // A constructor that uses only 2 of your 3 variables
    public Squirrel(String color, String gender) {

    }

    // A constructor that uses all 3 of your instance variables
    public Squirrel(String color, String gender, int numberOfOffspring) {

    }

    // Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables
    public String getColor() {
        return color;
    }
    public String getGender() {
        return gender;
    }
    public int getNumberOfOffspring() {
        return numberOfOffspring;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public void setNumberOfOffspring(int numberOfOffspring) {
        this.numberOfOffspring = numberOfOffspring;
    }

    // A method that returns a Boolean
    public static boolean isPregnant(boolean answer) {
        return answer;
    }

    // A method that returns a String
    public static String name(String name) {
        return name;
    }
}
