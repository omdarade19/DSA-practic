package BinaryTrees;

public class countOfNodes {

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

    public static int countOfNode(Node root){
        if(root == null){
            return 0;
        }

        int leftNode = countOfNode(root.left);
        int rigthNode = countOfNode(root.rigth);

        return leftNode+rigthNode+1;
    }

    public static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodeSum = sumOfNodes(root.left);
        int rigthNodeSum = sumOfNodes(root.rigth);

        return leftNodeSum+rigthNodeSum+root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.rigth);

        int myHeight = Math.max(leftheight,rightheight)+1;

        return myHeight;
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);

        System.out.println("the count of the nodes in tree is:-> "+countOfNode(root));
        System.out.println("the Sum of the nodes in tree is:-> "+sumOfNodes(root));
        System.out.println("the Height of the tree is:-> "+height(root));
    }
}
