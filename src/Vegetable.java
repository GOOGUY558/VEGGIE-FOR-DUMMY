class Vegetable implements Comparable<Vegetable> {
    private int vID;
    private String vNAME;
    private String vCOLOR;
    private String vZONE;
    private String vEAT;

    public Vegetable(int id, String zone, String color, String eat, String name) {
        vID = id;
        vNAME = name;
        vCOLOR = color;
        vZONE = zone;
        vEAT = eat;
    }

    public String getName() {
        return vNAME;
    }

    @Override
    public int compareTo(Vegetable other) {
        return this.vNAME.compareTo(other.vNAME);
    }

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
}

class BinarySearchTree {
    private TreeNode root;

    private static class TreeNode {
        Vegetable vegetable;
        TreeNode left, right;

        public TreeNode(Vegetable vegetable) {
            this.vegetable = vegetable;
            this.left = this.right = null;
        }
    }

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Vegetable vegetable) {
        root = insertRec(root, vegetable);
    }

    private TreeNode insertRec(TreeNode root, Vegetable vegetable) {
        if (root == null) {
            return new TreeNode(vegetable);
        }

        if (vegetable.compareTo(root.vegetable) < 0) {
            root.left = insertRec(root.left, vegetable);
        } else if (vegetable.compareTo(root.vegetable) > 0) {
            root.right = insertRec(root.right, vegetable);
        }

        return root;
    }

    public void inOrder() {
        inOrderRec(root);
    }

    private void inOrderRec(TreeNode root) {
        if (root != null) {
            inOrderRec(root.left);
            System.out.println(root.vegetable);
            inOrderRec(root.right);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(new Vegetable(1, "ZoneA", "Green", "Yes", "Zucchini"));
        bst.insert(new Vegetable(2, "ZoneB", "Red", "No", "Tomato"));
        bst.insert(new Vegetable(3, "ZoneC", "Orange", "Yes", "Carrot"));
        bst.insert(new Vegetable(4, "ZoneD", "Yellow", "Yes", "Banana"));

        System.out.println("In-order traversal:");
        bst.inOrder();
    }
}