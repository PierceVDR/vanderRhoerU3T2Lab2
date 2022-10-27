public class Cat
{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    // add a getAge() getter below for
    // obtaining the Cat's age
    public int getAge() {
        return age;
    }

    // MODIFY this method so that the Cat randomly
    // returns one of three different messages
    // (make any messages you want!) rather than always returning "meow".
    // Each message should have equal chance of being returned.
    public String speak() {
        int option = (int) (Math.random() * 3); // 0 to 2

        if (option == 0) {
            return "Meowow!";
        } else if (option == 1) {
            return "MEEEEEEEEEOOOOOOOOOOOOOWWWWW!!!";
        } else {
            return "Meow meow meow. Meow? Meow.";
        }
    }

    public void introduce() {
        System.out.println("Hello. My name is " + name + " and I am " + age + " years old. Now, mind your own business.");
    }
}