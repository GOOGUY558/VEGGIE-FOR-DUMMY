import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
////////////////////////////////////////////////////////////////////////////
class Vegetable implements Comparable<Vegetable> {
    public int vID;
    public String vNAME;
    public String vCOLOR;
    public String vZONE;
    public String vEAT;




////////////////////////////////////////////////////////////////////////////

    /////////////////////////////////////////////////////////////////////////////////
    public Vegetable(int id, String zone, String color, String eat, String name) {
        vID = id;
        vNAME = name;
        vCOLOR = color;
        vZONE = zone;
        vEAT = eat;
    }
///////////////////////////////////////////////////////////////////////////////////////



    //////////////////////////////////////////////////////////////////////////////////
    public String getName() {
        return vNAME;
    }

    @Override
    public int compareTo(Vegetable other) {
        return this.vNAME.compareTo(other.vNAME);
    }
    ////////////////////////////////////////////////////////////////////////////////////

    ///////////////////////////////////////////////////////////////////////////////////////
    @Override
    public String toString() {
        return "Vegetable{" +
                "vID=" + vID +
                ", vNAME='" + vNAME + '\'' +
                ", vCOLOR='" + vCOLOR + '\'' +
                ", vZONE='" + vZONE + '\'' +
                ", vEAT='" + vEAT + '\'' +
                '}';
    }
    ///////////////////////////////////////////////////////////////////////////////////////
}

class MyNode {
    String node;
    List<Vegetable> vegetables;
    MyNode left, right;

    public MyNode(String node, Vegetable vegetable) {
        this.node = node;
        this.vegetables = new ArrayList<>();
        this.vegetables.add(vegetable);
        this.left = this.right = null;

    }


}

class BinarySearchTree {

    private MyNode root;

    public MyNode getRoot() {
        return root;
    }


    public BinarySearchTree() {
        this.root = null;
    }



    public void insert(Vegetable vegetable) {
        root = insertRec(root, vegetable);
    }

    private MyNode insertRec(MyNode root, Vegetable vegetable) {
        if (root == null) {
            return new MyNode(vegetable.vZONE, vegetable);
        }

        if (vegetable.vZONE.compareTo(root.node) < 0) {
            root.left = insertRec(root.left, vegetable);
        } else if (vegetable.vZONE.compareTo(root.node) > 0) {
            root.right = insertRec(root.right, vegetable);
        } else {
            // Same zone, add to the list
            root.vegetables.add(vegetable);
            root.vegetables.sort(Comparator.comparing(Vegetable::getName));
        }

        return root;
    }

    public void inOrder(String targetZone, String targetColor, String targetEat) {
        inOrderRec(root, targetZone, targetColor, targetEat);
    }

    private void inOrderRec(MyNode root, String targetZone, String targetColor, String targetEat) {
        if (root != null) {
            inOrderRec(root.left, targetZone, targetColor, targetEat);
            if (root.node.equals(targetZone)) {
                System.out.println("Zone: " + root.node);
                for (Vegetable vegetable : root.vegetables) {
                    if ((targetColor == null || vegetable.vCOLOR.equals(targetColor)) &&
                            (targetEat == null || vegetable.vEAT.equals(targetEat))) {
                        System.out.println("   " + vegetable);
                    }
                }
            }
            inOrderRec(root.right, targetZone, targetColor, targetEat);
        }
    }



    private static List<Vegetable> searchVegetableByName(BinarySearchTree tree, String name) {
        List<Vegetable> foundVegetables = new ArrayList<>();
        searchVegetableByNameRec(tree.getRoot(), name, foundVegetables);
        return foundVegetables;
    }

    private static void searchVegetableByNameRec(MyNode root, String name, List<Vegetable> foundVegetables) {
        if (root != null) {
            for (Vegetable vegetable : root.vegetables) {
                if (vegetable.getName().equalsIgnoreCase(name)) {
                    foundVegetables.add(vegetable);
                }
            }
            searchVegetableByNameRec(root.left, name, foundVegetables);
            searchVegetableByNameRec(root.right, name, foundVegetables);
        }
    }
    private static List<Vegetable> getAllVegetablesWithSameData(BinarySearchTree tree, String name) {
        List<Vegetable> allVegetables = new ArrayList<>();
        getAllVegetablesWithSameDataRec(tree.getRoot(), name, allVegetables);
        return allVegetables;
    }

    private static void getAllVegetablesWithSameDataRec(MyNode root, String name, List<Vegetable> allVegetables) {
        if (root != null) {
            for (Vegetable vegetable : root.vegetables) {
                allVegetables.add(vegetable);
            }
            getAllVegetablesWithSameDataRec(root.left, name, allVegetables);
            getAllVegetablesWithSameDataRec(root.right, name, allVegetables);
        }
    }

}