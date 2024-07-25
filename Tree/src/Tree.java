import java.awt.*;

public class Tree {
    double heightFt;
    double trunkDiameterInches;
    TreeType treeType;
//    cmd click the class for docs
    static Color TRUNK_COLOR = new Color(
            130, 95, 62
    );

    Tree(double heightFt, double trunkDiameterInches, TreeType treeType) {
        this.heightFt = heightFt;
        this.trunkDiameterInches = trunkDiameterInches;
        this.treeType = treeType;
    }

    void grow() {
        this.heightFt = this.heightFt + 10;
        this.trunkDiameterInches = this.trunkDiameterInches + 1;
    }

    void announceTallTree() {
        if (this.heightFt > 100) {
            System.out.println("Very Tall " + this.treeType + " Tree!");
        }
    }

    static void announceTree() {
        System.out.println("Look out for that " + TRUNK_COLOR + " tree!");
    }
}
