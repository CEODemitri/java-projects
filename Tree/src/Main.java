public class Main {
    public static void main(String[] args) {
       Tree myFavBirchTree = new Tree(125, 5, TreeType.BIRCH);


       Tree myFavPineTree = new Tree(145, 10, TreeType.PINE);

       System.out.println(myFavBirchTree.treeType);

       myFavBirchTree.announceTallTree();
       myFavPineTree.announceTallTree();

       System.out.println(Tree.TRUNK_COLOR);
       Tree.announceTree();
    }
}
