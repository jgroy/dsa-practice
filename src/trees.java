class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BST{
    Node root;
    Node insert(Node root,int data){
        if(root ==null){
            return new Node(data);
        }
        if(root.data>data){
            root.left = insert(root.left,data);
        }
        if(root.data<data){
            root.right = insert(root.right,data);
        }
        return root;
    }
    void inorder(Node root){
    if(root == null) return;
    inorder(root.left);
    System.out.print(root.data + " ");
    inorder(root.right);
}
    void preorder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    void postorder(Node root){
        if(root==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String args[]){
        BST tree = new BST();

        tree.root = tree.insert(tree.root,8);

        tree.root = tree.insert(tree.root, 3);
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 1);
        tree.root = tree.insert(tree.root, 6);

        System.out.println("Tree root: " + tree.root.data);
        System.out.println("Left of root: " + tree.root.left.data);
        System.out.println("Right of root: " + tree.root.right.data);

        tree.inorder(tree.root);
        System.out.println();
        tree.preorder(tree.root);
        System.out.println();
        tree.postorder(tree.root);

    }
    
}