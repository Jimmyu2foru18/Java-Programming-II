import java.awt.HeadlessException;
import javax.swing.JOptionPane;

// Regular class
class Animal {
    static String name;

    Animal(String name) {
        this.name = name;
    }

    void speak() {
        JOptionPane.showMessageDialog(null, name + " makes a sound.");
    }

    // Inner class
    class Food {
        String foodName;

        Food(String foodName) {
            this.foodName = foodName;
        }

        void eat() {
            JOptionPane.showMessageDialog(null, name + " is eating " + foodName);
        }
    }

    // Static nested class
    static class Habitat {
        String habitatName;

        Habitat(String habitatName) {
            this.habitatName = habitatName;
        }

        void description() throws HeadlessException {
            try {
				try {
					JOptionPane.showMessageDialog(null, name + " lives in " + habitatName);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} catch (HeadlessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
    }

    // Anonymous inner class
    void performAction() {
        Action action = new Action() {
            @Override
            void execute() {
                JOptionPane.showMessageDialog(null, name + " is performing an action.");
            }
        };
        action.execute();
    }

    // Abstract inner class
    abstract class Action {
        abstract void execute();
    }
}

public class MainClass {
    public static void main(String[] args) {
        // Create an instance of the Animal class
        Animal lion = new Animal("Lion");
        lion.speak();

        // Create an instance of the inner class Food
        Animal.Food meat = lion.new Food("Meat");
        meat.eat();

        // Create an instance of the static nested class Habitat
        Animal.Habitat savannah = new Animal.Habitat("Savannah");
        savannah.description();

        // Anonymous inner class
        lion.performAction();

        // Inheritance
        Bird eagle = new Bird("Eagle");
        eagle.speak();
        eagle.fly();
    }
}

// Inherited class
class Bird extends Animal {
    Bird(String name) {
        super(name);
    }

    @Override
    void speak() {
        JOptionPane.showMessageDialog(null, name + " chirps.");
    }

    void fly() {
        JOptionPane.showMessageDialog(null, name + " is flying.");
    }
}
