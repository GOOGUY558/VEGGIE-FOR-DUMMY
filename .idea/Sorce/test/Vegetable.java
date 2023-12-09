import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

////////////////////////////////////////////////////////////////////////////
public class Vegetable implements Comparable<Vegetable> {

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
                "ID =" + vID +
                ", NAME ='" + vNAME + '\'' +
                ", COLOR ='" + vCOLOR + '\'' +
                ", ZONE ='" + vZONE + '\'' +
                ", EAT ='" + vEAT + '\'' +
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



    public MyNode root;

    public MyNode getRoot() {
        return root;
    }


    public BinarySearchTree() {
        this.root = null;
    }

    public static String storedInorderResult = "";

    public void insert(Vegetable vegetable) {
        root = insertRec(root, vegetable);
    }

    public MyNode insertRec(MyNode root, Vegetable vegetable) {
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

    private  void searchAndStoreInorder(MyNode root, String targetZone, String targetColor, String targetEat) {
        storedInorderResult = "";
        inOrder(targetZone, targetColor, targetEat);
    }

    public  void inOrder(String targetZone, String targetColor, String targetEat) {
        inOrderRec(root, targetZone, targetColor, targetEat);
    }

    public static void inOrderRec(MyNode root, String targetZone, String targetColor, String targetEat) {
        if (root != null) {
            inOrderRec(root.left, targetZone, targetColor, targetEat);
            if (root.node.equals(targetZone)) {
                storedInorderResult += "Zone: " + root.node + "\n";
                for (Vegetable vegetable : root.vegetables) {
                    if ((targetColor == null || vegetable.vCOLOR.equals(targetColor)) &&
                            (targetEat == null || vegetable.vEAT.equals(targetEat))) {
                        System.out.println("   " + vegetable);
                        storedInorderResult += "   " + vegetable + "\n";
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
    public void delete(String vegetableName) {
        root = deleteRec(root, vegetableName);
    }

    public MyNode deleteRec(MyNode root, String vegetableName) {
        if (root == null) {
            return null;
        }

        List<Vegetable> vegetablesToRemove = new ArrayList<>();

        for (Vegetable vegetable : root.vegetables) {
            if (vegetable.getName().equalsIgnoreCase(vegetableName)) {
                vegetablesToRemove.add(vegetable);
            }
        }

        root.vegetables.removeAll(vegetablesToRemove);

        if (root.vegetables.isEmpty()) {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.node = minValue(root.right);
            root.right = deleteRec(root.right, root.node);
        }

        return root;
    }

    private String minValue(MyNode root) {
        String minValue = root.node;
        while (root.left != null) {
            minValue = root.left.node;
            root = root.left;
        }
        return minValue;
    }

    public List<Vegetable> searchByName(String name) {
        List<Vegetable> foundVegetables = new ArrayList<>();
        searchByNameRec(root, name, foundVegetables);
        return foundVegetables;
    }

    private void searchByNameRec(MyNode root, String name, List<Vegetable> foundVegetables) {
        if (root != null) {
            for (Vegetable vegetable : root.vegetables) {
                if (vegetable.getName().equalsIgnoreCase(name)) {
                    foundVegetables.add(vegetable);
                }
            }
            searchByNameRec(root.left, name, foundVegetables);
            searchByNameRec(root.right, name, foundVegetables);
        }
    }





}