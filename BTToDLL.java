public class BTToDLL {
  
  Node prev = null;
  
  Node btToDLL(Node root) {
    if (root == null)
      return root;
    Node head = btToDLL(root.left);
    if (prev == null)
      head = root;
    else {
      root.left = prev;
      prev.right = root;
    }
    prev = root;
    Node btToDLL(root.right);
    return head;
  }
}
