package treeSet;

/**
 * Created on 14. June. 16.
 *
 * @author Evgeniy
 */

public class Main {

    public static void main(String[] args) {

        MyTreeSet<Integer> tree = new MyTreeSet<>();

        System.out.println("Size of collection before adding: " + tree.size() + " units");

        tree.add(15);
        tree.add(3);
        tree.add(61);
        tree.add(23);
        tree.add(21);
        tree.add(17);
        tree.add(-41);
        tree.add(14);
        tree.add(4);
        tree.add(5);
        tree.add(13);

        System.out.println("Size of collection after adding: " + tree.size() + " units");

        System.out.print("Tree collection: ");
        for(Integer i: tree){
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < 25; i++) {
            System.out.println("Presence of " + i + " - " + tree.contains(i));
        }

        System.out.println();

        tree.show(tree.getRoot(), 0);
        System.out.println();

        System.out.print("Sorting our tree by growing: ");

        tree.showSort(tree.getRoot());
        System.out.println();
    }
}
