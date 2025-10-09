package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class levelTransvalsal {
    static class Node{
        int data;
        Node left;
        Node rigth;

        Node(int data){
            this.data = data;
            this.left = null;
            this.rigth =null;
        }
    }

    static class BinaryTrees{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
           if(nodes[idx] == -1)return null;

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.rigth = buildTree(nodes);

            return newNode;
        }
    }

    public static void levelTransval(Node root){

        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }

            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.rigth != null){
                    q.add(currNode.rigth);
                }

            }
        }
    }

    public static void main(String[] args) {

        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        System.out.println("the root is :-> "+root.data);

        System.out.println("the Lavel transval pof tree ->");
        levelTransval(root);
    }
}
