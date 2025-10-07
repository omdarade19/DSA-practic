package BinaryTrees;

public class transvalsal {
    static class Node{
        int data;
        Node left;
        Node rigth;

        Node(int data){
            this.data=data;
            this.left=null;
            this.rigth=null;
        }
    }

    static class binarytree{
        static int idx=-1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.rigth= buildTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root){
        if(root == null) return;

        System.out.print(root.data+"  ");
        preorder(root.left);
        preorder(root.rigth);
    }

    public static void Inorder(Node root){
        if(root == null) return;

        Inorder(root.left);
        System.out.print(root.data+"  ");
        Inorder(root.rigth);
    }

    public static void PostOrder(Node root){
        if(root == null) return;

        PostOrder(root.left);
        PostOrder(root.rigth);

        System.out.print(root.data+"  ");
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        binarytree tree = new binarytree();

        Node root = tree.buildTree(nodes);
        System.out.println("the root of the tree is -> "+ root.data);
        System.out.println("the PreOrder");
        preorder(root);
        System.out.println(" ");
        System.out.println("the InOrder");
        Inorder(root);
        System.out.println(" ");
        System.out.println("the PostOrder");
        PostOrder(root);
    }
}
