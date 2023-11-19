package DFS;

public class EX7_5 {
    Node root;
    public void DFS(Node root){
        if(root == null) return;
        else{
            System.out.println(root.data + " ");
            DFS(root.lt);
            DFS(root.rt);
        }
    }

    public static void main(String[] args) {
        EX7_5 tree = new EX7_5();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS(tree.root);
    }
}
