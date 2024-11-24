package com.interview.grind75.clonegraph;

import java.util.HashMap;

public class CloneGraph {
    HashMap<Node, Node> nodeHash = new HashMap<>();
    public Node cloneGraph(Node node) {
        if(node==null){
            return  null;
        }
       return cloneUtlie(node,nodeHash );
    }

    private Node cloneUtlie(Node node, HashMap<Node, Node> nodeHash) {
        Node newNode= new Node(node.val);
        nodeHash.put(node, newNode);
       for(Node  neighbotss : node.neighbors){
           if(!nodeHash.containsKey(neighbotss)){
                newNode.neighbors.add(cloneUtlie(neighbotss,  nodeHash));
           }
           else{
               newNode.neighbors.add(nodeHash.get(neighbotss));
           }

       }
       return newNode;
    }

}
