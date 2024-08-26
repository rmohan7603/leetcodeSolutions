/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public void postOrderTrav(Node node, List<Integer> ansArr){
        if(node==null)
        return;
        for(Node tempNode:node.children)
        postOrderTrav(tempNode,ansArr);
        ansArr.add(node.val);
    }
    public List<Integer> postorder(Node root) {
        List<Integer> ansArr=new ArrayList<>();
        postOrderTrav(root,ansArr);
        return ansArr;
    }
}