import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class leetcode210_CourseSchedule2 {

    private int courses;
    private boolean isCycleFound = false;
    private HashSet<Integer> visitedSet = new HashSet<>();
    private HashSet<Integer> visitingSet = new HashSet<>();
    private HashMap<Integer, List<Integer>> graph = new HashMap<>();
    private HashMap<Integer, Integer> degreeMap = new HashMap<>();
    private Deque<Integer> deque  = new ArrayDeque<>();

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        courses = numCourses;
        for(int i=0; i<numCourses; i++) {
            //degree
            degreeMap.put(i,0);
        }

        for(int[] edge: prerequisites) {
            int u = edge[1];
            int v = edge[0];
            addEdge(u,v);
            degreeMap.put(v,degreeMap.get(v)+1);
        }

        for(int i=0;i<numCourses;i++) {
            if(isCycleFound)
                break;
            if(!visitedSet.contains(i)) {
                deque.clear();
                dfs(i);

            }
            //if()
        }
        return null;
    }

    private void dfs(int vertex) {
       /* if(isCycleFound)
            return;

        visitedSet.add(vertex);
        if(graph.get(vertex) != null) {
            List<Integer> adjacentNodes = graph.get(vertex);
            for(int i=0;i < adjacentNodes.size(); i++) {
                int adjacentNode = adjacentNodes.get(i);
                if(visitedSet.contains(adjacentNode)) {
                    isCycleFound =true;
                    return;
                }
                if(!visitedSet.contains(adjacentNode))
                    dfs(adjacentNode);
            }
        }
        visitedSet.remove(vertex);
        visitedSet.add(vertex);
        visitedSet*/

    }

    private void addEdge(int u, int v) {
        List<Integer> adjacent = graph.getOrDefault(u, new ArrayList<>());
        adjacent.add(v);
        graph.put(u, adjacent);
    }


    public static void main(String[] args) {
        leetcode210_CourseSchedule2 obj = new leetcode210_CourseSchedule2();
        //obj.findOrder();
    }
}
