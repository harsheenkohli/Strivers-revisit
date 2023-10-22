import java.util.LinkedList;

public class LevelOrderLine{
  public static void printLevelOrderLine(Node root){
    if (root == null)
      return;
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);
    while(q.size() > 1) {
      Node curr = q.poll();
      if (curr == null) {
        System.out.pritnln();
        q.add(null);
        continue;
      }
      System.out.print(curr.data + " ");
      if (curr.left != null)
        q.add(curr.left);
      if (curr.right != null)
        q.add(curr.right);
    }
  }
}
