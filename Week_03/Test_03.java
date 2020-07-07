import java.util.List;


public class Test_03 {


    public static void main(String[] args) {
        buildTree();
//        combine();

    }


    public static void buildTree() {
        int[] preorder = new int[]{2, 7, 11, 15};
        int[] inorder = new int[]{2, 7, 11, 15};
        TreeNode treeNode = new BuildTree().buildTree(preorder, inorder);
        System.out.println(treeNode);
    }

    public static void combine() {
        int n = 4;
        int k = 2;
        List<List<Integer>> combine = new Combine().combine(n, k);
        System.out.println(combine);
    }
}
