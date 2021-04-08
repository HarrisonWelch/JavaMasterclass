package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here

        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            tree.addItem(new Node(s));
        }
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("3"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("5"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("0"));
        tree.removeItem(new Node("4"));
        tree.removeItem(new Node("2"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("9"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("8"));
        tree.traverse(tree.getRoot());

        tree.removeItem(new Node("6"));
        tree.traverse(tree.getRoot());

        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

        // try and remove again?
        tree.removeItem(tree.getRoot());
        tree.traverse(tree.getRoot());

    }
}
