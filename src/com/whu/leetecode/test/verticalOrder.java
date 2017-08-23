package com.whu.leetecode.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * @author hongliang
 */
public class verticalOrder {
    private Map<Integer, List<Integer>> map;

    public List<List<Integer>> verticalOrder(TreeNode root) {
        map = new HashMap();
        List<List<Integer>> result = new ArrayList<>();
        if (root == null)
            return result;
        bfs(root);

        return null;
    }

    /**
     * @param root
     */
    private void bfs(TreeNode root) {
        // TODO Auto-generated method stub
        Queue<TreeNode> q = new LinkedList<>();
        Queue<Integer> index = new LinkedList<>();
        index.offer(0);
        int low = 0, high = 0;
        while (!q.isEmpty()) {
            TreeNode cur = q.poll();
            int curIndex = index.poll();
            if (!map.containsKey(curIndex))
                map.put(curIndex, new ArrayList());
            map.get(curIndex).add(cur.val);
            low = Math.min(low, curIndex);
            high = Math.max(high, curIndex);
            if (cur.left != null) {
                q.offer(cur.left);
                index.offer(curIndex - 1);
            }
            if (cur.right != null) {
                q.offer(cur.right);
                index.offer(curIndex + 1);
            }
        }
    }

}
