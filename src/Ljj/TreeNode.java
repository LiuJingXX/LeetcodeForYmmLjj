package Ljj;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName TreeNode
 * @Description Convert Integer[] to Tree
 * @Author LiuJing
 * @Date 2018/11/30 15:59
 * @Version 1.0
 **/
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
    public TreeNode(){

    }
    public TreeNode create(Integer[] array){
        TreeNode treeNode = new TreeNode(array[0]);
        TreeNode tmp;
        int i = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(treeNode);
        while(!queue.isEmpty() && i < array.length){
            tmp = ((LinkedList<TreeNode>) queue).pop();
            if(array[i] != null){
                tmp.left = new TreeNode(array[i]);
                queue.offer(tmp.left);
            }
            i++;
            if(array[i] != null){
                tmp.right = new TreeNode(array[i]);
                queue.offer(tmp.right);
            }
            i++;

        }
        return treeNode;
    }
}
