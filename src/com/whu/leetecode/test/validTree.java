package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hongliang
 */
public class validTree {
    
    public boolean validTree(int n, int[][] edges){
        List<Integer>[] graph=new List[n];
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }
        boolean[] visited=new boolean[n];
        if(!dfs(graph,0,visited,-1)){
            return false;
        }
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                return false;
            }
        }
        
        return true;
    }

    /**
     * @param graph
     * @param i
     * @param visited
     * @param j
     * @return
     */
    private boolean dfs(List<Integer>[] graph, int i, boolean[] visited, int prev) {
        // TODO Auto-generated method stub
        if(visited[i])
            return false;
        visited[i]=true;
        for(int num:graph[i]){
            if(prev!=num&&!dfs(graph,num,visited,i)){
                return false;
            }
        }
        return true;
    }

}
