package page_1;
import java.util.*;
/*
 * ����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 * ���������ǰ���������������Ľ���ж������ظ������֡�
 * ��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 * ���ؽ������������ء�
 * coded by Jerome
 */
class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int val){
		this.val = val;
	}
}
public class ReConstructBinaryTree {
	/**
	 * Definition for binary tree
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	    private Map<Integer,Integer> idx = new HashMap<>();
	    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
	        if(pre==null||in==null||pre.length<=0)
	            return null;
	        for(int i = 0;i<in.length;i++)
	            idx.put(in[i],i);
	        return reConstructBinaryTree(pre,0,pre.length-1,in,0,in.length-1);
	    }
	    public TreeNode reConstructBinaryTree(int[] pre,int preL,int preR,int[] in,int inL,int inR){
	        if(preL == preR) return new TreeNode(pre[preL]);
	        if(preL>preR||inL>inR)
	            return null;
	        TreeNode root = new TreeNode(pre[preL]);
	        int index = idx.get(root.val);
	        int leftSize = index - inL;
	        root.left = reConstructBinaryTree(pre,preL+1,preL+leftSize,in,inL,inL+leftSize-1);
	        root.right = reConstructBinaryTree(pre,preL+leftSize+1,preR,in,inL+leftSize+1,inR);
	        return root;
	    }
	}

