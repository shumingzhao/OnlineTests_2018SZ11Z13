package com.acquisio.basic.java.question02;

/**
 * QUESTION 2: TreeNode
 * Using the tree structure define at
 * http://en.wikipedia.org/wiki/File:Binary_tree.svg,
 * add the code necessary to optain the following output.
 * ..2
 * ....7
 * ......2
 * ......6
 * ........5
 * ........11
 * ....5
 * ......9
 * ........4
 *
 * IMPORTANT: Add all missing javadoc and/or unit tests that you think is necessary.
 */
public class TreeNavigation {

    public static void main(String[] args) {
        TreeNavigation main = new TreeNavigation();
        main.treeNode();
    }

    private void treeNode() {
        Node n1 = new Node("6", new Node("5"), new Node("11"));
        Node n2 = new Node("7", new Node("2"), n1);
        Node n3 = new Node("9", new Node("4"));
        Node n4 = new Node("5", null, n3);
        Node n = new Node("2", n2, n4);
        // TODO: Implement code here
        int level =1;
        print(n, level);
    }
        private String printPoint(int level) {
        String p = ".";
        for (int i=0;i<level;i++) {
            p += ".";
        }
        return p;
    }
    private void print(Node n, int level) {
        if (n != null) {

            System.out.println(printPoint(level)+n.name);
            if (n.children != null) {
               
                if (n.children.length > 0) {
                    print(n.children[0], level+2);
                }
                if (n.children.length > 1) {
                    print(n.children[1], level+2);
                }
            }

        }

    }
}
