import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;
class Pair{
    int n;
    int distance;
    public Pair(int n , int distance){
        this.n=n;
        this.distance=distance;
    }
}
public class Djkistra_algo {
   
    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {   
        PriorityQueue<Pair> pq = new PriorityQueue<>((x,y) -> x.distance - y.distance);
        int[] dist = new int[V];
        
        for(int i=0;i<V;i++){
            dist[i]=(int)1e9;
        }
        dist[S]=0;
        pq.add(new Pair(S,0));
        
        while(pq.size()!=0){
            int distance =pq.peek().distance;
            int node = pq.peek().n;
            pq.remove();
            for(int i=0;i<adj.get(node).size();i++){
                int weight = adj.get(node).get(i).get(1);
                int adjnode= adj.get(node).get(i).get(0);
                if(distance+weight<dist[adjnode]){
                    dist[ adjnode ]= distance+weight;
                    pq.add(new Pair(adjnode, dist[adjnode]));
                }
            }
        }
        return dist;
    }
    
}
class main{
    public static void main(String[] args) throws IOException {
        BufferedReader read =new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String str[] = read.readLine().trim().split(" ");
            int V = Integer.parseInt(str[0]);
            int E = Integer.parseInt(str[1]);
    
            ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<ArrayList<ArrayList<Integer>>>();
            for(int i=0;i<V;i++)
            {
                adj.add(new ArrayList<ArrayList<Integer>>());
            }
            
            int i=0;
            while (i++<E) {
                String S[] = read.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                int w = Integer.parseInt(S[2]);
                ArrayList<Integer> t1 = new ArrayList<Integer>();
                ArrayList<Integer> t2 = new ArrayList<Integer>();
                t1.add(v);
                t1.add(w);
                t2.add(u);
                t2.add(w);
                adj.get(u).add(t1);
                adj.get(v).add(t2);
            }
            
            int S = Integer.parseInt(read.readLine());
            
            Djkistra_algo ob = new Djkistra_algo();
            
            int[] ptr = Djkistra_algo.dijkstra(V, adj, S);
            
            for(i=0; i<V; i++)
                System.out.print(ptr[i] + " ");
            System.out.println();
        }

    }   
}
