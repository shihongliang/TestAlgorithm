package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author hongliang
 */
public class alienOrder {
    
    public String alienOrder(String[] words) {
        Map<Character,AlienChar>  graph=new HashMap<Character,AlienChar>();
        boolean isBuildSucced=buildGraph(words,graph);
        if(!isBuildSucced){
            return "";
        }
        String order=findOrder(graph);
        return order.length()==graph.size()?order:"";
    }

    /**
     * @param graph
     * @return
     */
    private String findOrder(Map<Character, AlienChar> graph) {
        // TODO Auto-generated method stub
        StringBuilder stringBuilder=new StringBuilder();
        Queue<AlienChar> queue=new LinkedList<>();
        for(Character c:graph.keySet()){
            if(graph.get(c).indegree==0){
                queue.offer(graph.get(c));
            }
        }
        while(!queue.isEmpty()){
            AlienChar curr=queue.poll();
            stringBuilder.append(curr.val);
            for(AlienChar next:curr.later){
                if(--next.indegree==0){
                    queue.offer(next);
                }
            }
        }
        return stringBuilder.toString();
    }

    /**
     * @param words
     * @param graph
     * @return
     */
    private boolean buildGraph(String[] words, Map<Character, AlienChar> graph) {
        // TODO Auto-generated method stub
        HashSet<String> visited=new HashSet<String>();
        // 初始化图，每个字母都初始化入度为0
        initializeGraph(words, graph);
        for(int wordIdx=0;wordIdx<words.length-1;wordIdx++){
            String before=words[wordIdx];
            String after=words[wordIdx+1];
            Character prev=null,next=null;
            for(int letterIdx=0;letterIdx<before.length()&&letterIdx<after.length();letterIdx++){
                prev=before.charAt(letterIdx);
                next=before.charAt(letterIdx);
                break;
            }
            if(prev!=null&&visited.contains(next+""+prev)){
                return false;
            }
            
            if(prev!=null&&!visited.contains(prev+""+next)){
                addEdge(prev,next,graph);
                visited.add(prev+""+next);
            }   
        }
        return true;
    }

    /**
     * @param prev
     * @param next
     * @param graph
     */
    private void addEdge(Character prev, Character next, Map<Character, AlienChar> graph) {
        // TODO Auto-generated method stub
        AlienChar prevAlienChar=graph.get(prev);
        AlienChar nextAlienChar=graph.get(next);
        nextAlienChar.indegree=1;
        prevAlienChar.later.add(nextAlienChar);
        graph.put(prev, prevAlienChar);
        graph.put(next,nextAlienChar);
    }

    /**
     * @param words
     * @param graph
     */
    private void initializeGraph(String[] words, Map<Character, AlienChar> graph) {
        // TODO Auto-generated method stub
        for(String word:words){
            for(int idx=0;idx<word.length();idx++){
                if(!graph.containsKey(word.charAt(idx))){
                    graph.put(word.charAt(idx), new AlienChar(word.charAt(idx)));
                }
            }
        }
    }
}

class AlienChar {
    char val;
    ArrayList<AlienChar> later;
    int indegree;
    /**
     * @param val
     * @param later
     * @param indegree
     */
    public AlienChar(char val) {
        super();
        this.val = val;
    }
}