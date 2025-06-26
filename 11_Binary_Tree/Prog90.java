// Binary Tree using input as array

class TreeNode{
    
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data = data;
        left = right = null;
    }
}

class Prog90 {

    int index = -1;

    TreeNode constructBT(int nodeArr[]){

        index++;
        if(nodeArr[index] == -1){
            return null;
        }

        TreeNode newNode = new TreeNode(nodeArr[index]);

        newNode.left = constructBT(nodeArr);
        newNode.right = constructBT(nodeArr);

        return newNode;
    }

    void preOrderBT(TreeNode root){

        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrderBT(root.left);
        preOrderBT(root.right);
    }

    void inOrderBT(TreeNode root){

        if(root == null){
            return;
        }

        inOrderBT(root.left);
        System.out.print(root.data+" ");
        inOrderBT(root.right);
    }

    void postOrderBT(TreeNode root){

        if(root == null){
            return;
        }

        postOrderBT(root.left);
        postOrderBT(root.right);
        System.out.print(root.data+" ");
    }

    int countNode(TreeNode root){

        if(root == null){
            return 0;
        }

        int leftSTNode = countNode(root.left);
        int rightSTNode = countNode(root.right);

        return leftSTNode+rightSTNode+1;
    }


    public static void main(String[] args) {
        
        int nodeArr[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        Prog90 bt = new Prog90();

        TreeNode root =  bt.constructBT(nodeArr);

        bt.preOrderBT(root);
        System.out.println();

        bt.inOrderBT(root);
        System.out.println();

        bt.postOrderBT(root);
        System.out.println();

        int count = bt.countNode(root);
        System.out.println("count = "+count);
    }
}
