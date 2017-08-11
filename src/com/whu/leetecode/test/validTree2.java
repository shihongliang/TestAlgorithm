package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author hongliang
 */
public class validTree2 {
    
    public boolean validTree(int n, int[][] edges){
        List<Integer>[] graph=new List[n];
        Set<Integer> inDegree=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            graph[i]=new ArrayList<Integer>();
        }
        for(int i=0;i<edges.length;i++){
            graph[edges[i][0]].add(edges[i][1]);
            inDegree.add(edges[i][1]);
        }
        int root=0;
        int count=0;
        for(int i=0;i<n;i++){
            if(!inDegree.contains(i)){
                root=i;
                count++;
            }
        }
        
        if(count!=1){
            return false;
        }
        boolean[] visited=new boolean[n];
        if(!dfs(graph,root,visited)){
            return false;
        }
        
        return true;
    }

    /**
     * @param graph
     * @param root
     * @param visited
     * @return
     */
    private boolean dfs(List<Integer>[] graph, int i, boolean[] visited) {
        // TODO Auto-generated method stub
        if(visited[i]){
            return false;
        }
        visited[i]=true;
        for(int num:graph[i]){
            if(!dfs(graph,num,visited)){
                return false;
            }
        }
        return true;
    }

}
