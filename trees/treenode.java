package trees;

import java.util.ArrayList;


public class treenode<T> {

int data;
ArrayList<treenode<T>> children ;
public treenode(int  data){
    this.data= data ;
    children  = new ArrayList<>();
}
public static void main(String[]args){
treenode<Integer> root = new treenode<Integer>(4);
treenode<Integer> node1 = new treenode<Integer>(2);
treenode<Integer> node2 = new treenode<Integer>(3);
treenode<Integer> node3= new treenode<Integer>(5);
treenode<Integer> node4= new treenode<Integer>(6);
root.children.add(node1);
root.children.add(node2);
root.children.add(node3);
node2.children.add(node4);

System.out.println(root);

}
    
    
}
