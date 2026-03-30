public class Main {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.insert(13);
        tree.insert(22);
        tree.insert(36);
        tree.insert(5);
        tree.insert(48);
        tree.insert(17);
        tree.insert(39);
        tree.insert(2);
        tree.insert(26);
        tree.insert(40);
        tree.insert(29);
        tree.insert(34);
        tree.insert(10);

        // delete the element 17 from BST
        System.out.println(tree.delete(17)); // should return true

        System.out.println("Inorder Traversal:");// should print the elements in sorted order
        tree.inorder();
        System.out.println("\nPostorder traversal:");
        tree.postorder(); // should print the elements in postorder
        System.out.println("\nPreorder traversal:");
        tree.preorder(); // should print the elements in preorder

        //Search for the element 36 and 37
        System.out.println("\nSearch for 36: " + tree.search(36)); // should return true
        System.out.println("Search for 37: " + tree.search(37)); // should return false

        //Using the path() method, display the path from the root to the element 2 and 34
        System.out.println("Path from root to 2: " + tree.path(2)); // should return [13, 5, 2]
        System.out.println("Path from root to 34: " + tree.path(34)); // should return [13, 22, 36, 29, 34]
    }



}
