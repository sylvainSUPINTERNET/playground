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

    add(value) {
        const newTreeNode = new TreeNode(value);
        
    }

    find(value) {

    }

    remove(value) {

    }
}


