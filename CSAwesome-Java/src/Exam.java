public class Exam        // Add your class name here!
{
    // 1. copy in your instance variables for class from the last lesson
    private String name;
    private String email;
    private String phoneNumber;

    // 2. Add a constructor with 3 parameters to set all of the instance variables to the given parameters.
    public Exam(String name2,String email2,String phoneNumber2)
    {
        name=name2;
        email=email2;
        phoneNumber=phoneNumber2;

    }


    // 3. Write a print() method that uses System.out.println to print out all the instance variables.

    public void print()
    {
        System.out.println(name);
        System.out.println(email);
        System.out.println(phoneNumber);
    }

    // 4. Write a main method that constructs at least 2 objects of your class
    // using the constructor and then calls their print() methods.
    public static void main(String[] args)
    {
        // Construct 2 objects of your class to test the constructors
        Exam exam = new Exam("omer","@gmail","3333");
        Exam exam2 = new Exam("omer2","@gmail2","33332");
        exam.print();
        exam2.print();


        // call the objects print() methods

    }
}
