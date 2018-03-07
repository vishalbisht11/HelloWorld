import java.io.*;
import java.util.*;
class GraphB
{
private int ver;	//no of vertices
private LinkedList<Integer> adj[];	//Adjacency List
GraphB(int v)
{
ver=v;
adj=new LinkedList[ver];
for(int i=0;i<ver;i++){
adj[i]=new LinkedList();
}
}

void add(int v,int w)
{
adj[v].add(w);
}

void BFS(int s)
{
boolean visited[] = new boolean[ver];
LinkedList<Integer> q =new LinkedList<Integer>();
visited[s]=true;
q.add(s);

while(q.size()!=0)
{
s=q.poll();
System.out.println(s+" ");
Iterator<Integer> i=adj[s].listIterator();

while(i.hasNext()){
int n=i.next();
if(!visited[n])
{
visited[n]=true;
q.add(n);
}
}//while
}//outer while

}

public static void main(String[] args){
GraphB g=new GraphB(6);	//6 indiactes number of vertices
g.add(0,1);
g.add(0,4);
g.add(0,5);
g.add(1,3);
g.add(1,4);
g.add(2,1);
g.add(3,2);
g.add(3,4);
System.out.println("Following is BFS:");
g.BFS(0);			//0 indicates the source node

}

}


 