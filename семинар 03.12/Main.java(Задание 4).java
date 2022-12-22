public class Main {

    public static void main(String[] args) {

        binary_search_tree tree1 = new binary_search_tree();

        tree1.Add(125, "Binary ");
        tree1.Add(150, "Search ");
        tree1.Add(125, "Tree");

        tree1.WalkInOrder(tree1.root);
        System.out.println("\n");

        try{
            tree1.findNode(150).describeNode();
        }catch (NullPointerException e){
            System.out.println("Существование узла отсутствует");
        }

    }
}