import javax.swing.JOptionPane;
public class Vegetabletest {
    private static int nextVegetableID = 76;



    public static void main(String[] args) {




        BinarySearchTree BinaryTree = new BinarySearchTree();


        BinaryTree.insert(new Vegetable(1, "ZoneA", "Green", "Yes", "Zucchini"));
        BinaryTree.insert(new Vegetable(2, "ZoneB", "Red", "No", "Tomato"));
        BinaryTree.insert(new Vegetable(3, "ZoneC", "Orange", "Yes", "Carrot"));
        BinaryTree.insert(new Vegetable(4, "ZoneD", "Yellow", "Yes", "Banana"));
        BinaryTree.insert(new Vegetable(5, "ZoneC", "Yellow", "Yes", "Apple"));
        BinaryTree.insert(new Vegetable(6, "ZoneA", "Purple", "Yes", "Eggplant"));
        BinaryTree.insert(new Vegetable(7, "ZoneB", "Yellow", "Yes", "Bell Pepper"));
        BinaryTree.insert(new Vegetable(8, "ZoneC", "Red", "No", "Beet"));
        BinaryTree.insert(new Vegetable(9, "ZoneD", "Green", "Yes", "Cucumber"));
        BinaryTree.insert(new Vegetable(10, "ZoneA", "Orange", "No", "Pumpkin"));
        BinaryTree.insert(new Vegetable(11, "ZoneD", "Purple", "Yes", "Eggplant"));
        BinaryTree.insert(new Vegetable(12, "ZoneB", "Green", "No", "Lettuce"));
        BinaryTree.insert(new Vegetable(13, "ZoneA", "Yellow", "Yes", "Corn"));
        BinaryTree.insert(new Vegetable(14, "ZoneC", "Red", "Yes", "Radish"));
        BinaryTree.insert(new Vegetable(15, "ZoneD", "Green", "No", "Broccoli"));
        BinaryTree.insert(new Vegetable(16, "ZoneB", "Orange", "Yes", "Sweet Potato"));
        BinaryTree.insert(new Vegetable(17, "ZoneA", "Red", "Yes", "Cherry Tomato"));
        BinaryTree.insert(new Vegetable(18, "ZoneB", "Purple", "No", "Cabbage"));
        BinaryTree.insert(new Vegetable(19, "ZoneC", "Green", "Yes", "Spinach"));
        BinaryTree.insert(new Vegetable(20, "ZoneD", "Yellow", "No", "Yellow Squash"));
        BinaryTree.insert(new Vegetable(21, "ZoneA", "Orange", "Yes", "Carrot"));
        BinaryTree.insert(new Vegetable(22, "ZoneB", "Green", "Yes", "Asparagus"));
        BinaryTree.insert(new Vegetable(23, "ZoneC", "Yellow", "No", "Yellow Bell Pepper"));
        BinaryTree.insert(new Vegetable(24, "ZoneD", "Red", "Yes", "Tomato"));
        BinaryTree.insert(new Vegetable(25, "ZoneA", "Green", "No", "Green Bean"));
        BinaryTree.insert(new Vegetable(26, "ZoneB", "Orange", "Yes", "Pumpkin"));
        BinaryTree.insert(new Vegetable(27, "ZoneC", "Purple", "No", "Purple Potato"));
        BinaryTree.insert(new Vegetable(28, "ZoneD", "Green", "Yes", "Okra"));
        BinaryTree.insert(new Vegetable(29, "ZoneA", "Yellow", "No", "Yellow Tomato"));
        BinaryTree.insert(new Vegetable(30, "ZoneB", "Red", "Yes", "Radish"));
        BinaryTree.insert(new Vegetable(31, "ZoneC", "Green", "Yes", "Green Pepper"));
        BinaryTree.insert(new Vegetable(32, "ZoneD", "Orange", "No", "Orange Bell Pepper"));
        BinaryTree.insert(new Vegetable(33, "ZoneA", "Red", "Yes", "Red Cabbage"));
        BinaryTree.insert(new Vegetable(34, "ZoneB", "Green", "Yes", "Green Onion"));
        BinaryTree.insert(new Vegetable(35, "ZoneC", "Yellow", "No", "Yellow Onion"));
        BinaryTree.insert(new Vegetable(36, "ZoneD", "Orange", "Yes", "Orange Tomato"));
        BinaryTree.insert(new Vegetable(37, "ZoneA", "Purple", "No", "Purple Onion"));
        BinaryTree.insert(new Vegetable(38, "ZoneB", "Red", "Yes", "Red Bell Pepper"));
        BinaryTree.insert(new Vegetable(39, "ZoneC", "Green", "Yes", "Green Tomato"));
        BinaryTree.insert(new Vegetable(40, "ZoneD", "Orange", "No", "Orange Onion"));
        BinaryTree.insert(new Vegetable(41, "ZoneA", "Yellow", "Yes", "Yellow Pepper"));
        BinaryTree.insert(new Vegetable(42, "ZoneB", "Red", "No", "Red Potato"));
        BinaryTree.insert(new Vegetable(43, "ZoneC", "Green", "Yes", "Green Squash"));
        BinaryTree.insert(new Vegetable(44, "ZoneD", "Purple", "No", "Purple Squash"));
        BinaryTree.insert(new Vegetable(45, "ZoneA", "Orange", "Yes", "Orange Squash"));
        BinaryTree.insert(new Vegetable(46, "ZoneB", "Yellow", "No", "Yellow Squash"));
        BinaryTree.insert(new Vegetable(47, "ZoneC", "Red", "Yes", "Red Squash"));
        BinaryTree.insert(new Vegetable(48, "ZoneD", "Green", "Yes", "Green Eggplant"));
        BinaryTree.insert(new Vegetable(49, "ZoneA", "Orange", "No", "Orange Eggplant"));
        BinaryTree.insert(new Vegetable(50, "ZoneB", "Purple", "Yes", "Purple Eggplant"));
        BinaryTree.insert(new Vegetable(51, "ZoneC", "Green", "No", "Green Cabbage"));
        BinaryTree.insert(new Vegetable(52, "ZoneD", "Yellow", "Yes", "Yellow Cabbage"));
        BinaryTree.insert(new Vegetable(53, "ZoneA", "Red", "Yes", "Red Spinach"));
        BinaryTree.insert(new Vegetable(54, "ZoneB", "Green", "No", "Green Spinach"));
        BinaryTree.insert(new Vegetable(55, "ZoneC", "Orange", "Yes", "Orange Spinach"));
        BinaryTree.insert(new Vegetable(56, "ZoneD", "Purple", "No", "Purple Spinach"));
        BinaryTree.insert(new Vegetable(57, "ZoneA", "Green", "Yes", "Green Broccoli"));
        BinaryTree.insert(new Vegetable(58, "ZoneB", "Red", "No", "Red Broccoli"));
        BinaryTree.insert(new Vegetable(59, "ZoneC", "Yellow", "Yes", "Yellow Broccoli"));
        BinaryTree.insert(new Vegetable(60, "ZoneD", "Purple", "Yes", "Purple Broccoli"));
        BinaryTree.insert(new Vegetable(61, "ZoneA", "Orange", "No", "Orange Broccoli"));
        BinaryTree.insert(new Vegetable(62, "ZoneB", "Green", "Yes", "Green Lettuce"));
        BinaryTree.insert(new Vegetable(63, "ZoneC", "Red", "Yes", "Red Lettuce"));
        BinaryTree.insert(new Vegetable(64, "ZoneD", "Yellow", "No", "Yellow Lettuce"));
        BinaryTree.insert(new Vegetable(65, "ZoneA", "Orange", "Yes", "Orange Lettuce"));
        BinaryTree.insert(new Vegetable(66, "ZoneB", "Purple", "No", "Purple Lettuce"));
        BinaryTree.insert(new Vegetable(67, "ZoneC", "Green", "Yes", "Green Zucchini"));
        BinaryTree.insert(new Vegetable(68, "ZoneD", "Red", "No", "Red Zucchini"));
        BinaryTree.insert(new Vegetable(69, "ZoneA", "Yellow", "Yes", "Yellow Zucchini"));
        BinaryTree.insert(new Vegetable(70, "ZoneB", "Purple", "Yes", "Purple Zucchini"));
        BinaryTree.insert(new Vegetable(71, "ZoneC", "Orange", "No", "Orange Zucchini"));
        BinaryTree.insert(new Vegetable(72, "ZoneD", "Green", "Yes", "Green Bell Pepper"));
        BinaryTree.insert(new Vegetable(73, "ZoneA", "Red", "No", "Red Bell Pepper"));
        BinaryTree.insert(new Vegetable(74, "ZoneB", "Yellow", "Yes", "Yellow Bell Pepper"));
        BinaryTree.insert(new Vegetable(75, "ZoneC", "Purple", "No", "Purple Bell Pepper"));
        BinaryTree.insert(new Vegetable(76, "ZoneD", "Orange", "Yes", "Orange Bell Pepper"));


        BinaryTree.insert(getVegetableFromUserInput());


        System.out.println("In-order traversal for ZoneC (Green, Yes):");
        BinaryTree.inOrder("ZoneC", "Green", "Yes");

        BinaryTree.inOrder("ZoneC", "Green", "Yes");

    }

    public static Vegetable getVegetableFromUserInput() {

        String zone = JOptionPane.showInputDialog("Enter vegetable zone:");
        String color = JOptionPane.showInputDialog("Enter vegetable color:");
        String eat = JOptionPane.showInputDialog("Enter whether vegetable is edible (Yes/No):");
        String name = JOptionPane.showInputDialog("Enter vegetable name:");

        // Use the nextVegetableID and increment for each new vegetable
        int id = nextVegetableID++;

        return new Vegetable(id, zone, color, eat, name);

    }


}