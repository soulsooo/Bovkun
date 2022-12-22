public class NODE {
    int num;
    Object info;
    Node left;
    Node right;

    NODE(int num, Object info) {
        this.num = num;
        this.info = info;
    }

    public void describe_Node(){
        System.out.println("Это узел " + this.num + " : " + this.info);
        if (this.left != null){
            System.out.println(" Дополнительный узел слева: " + this.num.left + " : " + this.info.left);
        }
        if (this.right != null){
            System.out.println("Дополнительный узел справа: " + this.num.right + " : " + this.info.right);
        }
        if (this.right == null & this.left == null){
            System.out.println("Дополнительные узлы отсутствуют");
        }
        System.out.println("\n");
    }
}
