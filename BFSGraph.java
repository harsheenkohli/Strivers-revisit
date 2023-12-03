import java.util.LinkedList;

class BFSGraph {
  
  void BFSDis(ArrayList<ArrayList<Integer>> adj, int V){
    boolean visited [V + 1];
    for (int i = 0; i < V; i++)
      if (!visited[i])
        BFS(adj, V, i, visited);
  }

  void DFS(ArrayList<ArrayList<Integer>> adj, int V, int s, boolean visited[]) {
    Queue<Integer> q = new LinkedList<>();
    visited[s] = true;
    q.add(s);
    while (!q.isEmpty()){
      int u = q.poll();
      System.out.print(u + " ");
      for (int v : adj.get(u)){
        if (!visited[v]){
          visited[v] = true;
          q.add(v);
        }
      }
    }
  }
}
