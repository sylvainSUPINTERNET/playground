'use strict';

const RIGHT = 1;
const LEFT = 0;

class TreeNode {
    constructor (value) {   
        this.value = value;
        this.descendants = [];
        this.parent = null;
    }

    get left() {
        console.log("CALLED");
        return this.descendants[LEFT];
    }

    set left(treeNode) {   
        this.descendants[LEFT] = treeNode

        if ( node ) {
            node.parent = this;
        }
    }

    get right() {
        return this.descendants[RIGHT];
    }

    set right(treeNode) {
        this.descendants[RIGHT] = treeNode;

        if ( treeNode ) {
            treeNode.parent = this;
        }
    }
}


class BinarySearchTree {

    constructor(){
        this.root = null;
        this.size = 0;
    }

    //   30 
    //     \
    //      40

    add(value) {
        const newTreeNode = new TreeNode(value);

        if ( this.root === null ) {
            this.root = newTreeNode;
        } else {
            console.log("fall here");

            if ( value < 50 ) {
                newTreeNode.right;
            } else {
                newTreeNode.left;
            }
        }





        this.size += 1;
        return newTreeNode;
    }

    find(value) {

    }

    remove(value) {

    }
}



let bst = new BinarySearchTree();


let n0 = new TreeNode(60);
let n1 = new TreeNode(100);
let n2 = new TreeNode(4);
n0.descendants.push(n1, n2);
let n3 = new TreeNode(45);
let n4 = new TreeNode(3);
n1.descendants.push(n3,n4)


// new node
let n5 = new TreeNode(64);

bst.add(n0);
bst.add(n5);


console.log(bst.root.left)





