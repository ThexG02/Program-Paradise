import java.util.*;

public class graph {
     static void dfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int node){
        System.out.print(node + " ");
        visited[node]= true;
        for(Integer i: graph.get(node)){
            if(visited[i]==false){
                dfs(graph, visited, node);
            }
        }
    }
    static void bfs(ArrayList<ArrayList<Integer>> graph, boolean[] visited, int v){
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        while(!q.isEmpty()){
            Integer node = q.poll();
            System.out.println(node+" ");
            for(Integer i: graph.get(node)){
                if(visited[i]==false){
                    visited[i]= true;
                    q.add(i);
                }
            }
        }
    }
public static void main(String[] args) {
    int v=4;
    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    for(int i =0; i<=v; i++){
        graph.add(new ArrayList<Integer>());
    }
    graph.get(1).add(2);
    graph.get(1).add(4);
    graph.get(1).add(12);
    graph.get(2).add(1);
    graph.get(2).add(3);
    graph.get(3).add(2);
    graph.get(3).add(4);
    graph.get(4).add(1);
    graph.get(4).add(3);

    for(int i=0;i<=v;i++){
        System.out.print(i+ "-> [");
        for(int j=0;j<graph.get(i).size();j++){
            System.out.print(graph.get(i).get(j)+ " ");
        }
        System.out.println("]");
    }
    boolean visited[]= new boolean[v+1];
    dfs(graph,visited,1);
    bfs(graph,visited,1);
}
}
