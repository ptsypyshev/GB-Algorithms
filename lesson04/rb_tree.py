class Node:
    def __init__(self, key):
        self.key = key
        self.red = True
        self.left = None
        self.right = None
        self.parent = None


class RBTree:
    def __init__(self):
        self.root = None

    def search(self, key):
        current_node = self.root
        while current_node is not None and key != current_node.key:
            if key < current_node.key:
                current_node = current_node.left
            else:
                current_node = current_node.right
        return current_node
    
    def print_tree_req(self, node):
        if node:
            self.print_tree_req(node.left)
            print(node.key)
            self.print_tree_req(node.right)

    def print_tree(self):
        if self.root:
            self.print_tree_req(self.root)

    def insert(self, key):
        node = Node(key)
        # For Empty tree
        if self.root is None:
            node.red = False
            self.root = node
            return
        
        last_node = self.root
        while last_node is not None:
            potential_parent = last_node
            if node.key < last_node.key:
                last_node = last_node.left
            else:
                last_node = last_node.right
        
        # Assign parents and siblings to the new node
        node.parent = potential_parent
        if node.key < node.parent.key:
            node.parent.left = node
        else:
            node.parent.right = node
        node.left = None
        node.right = None

        # Fix tree after inserting
        self.fix_tree(node)

    def fix_tree(self, node):
        try:
            while node.parent.red is True and node is not self.root:
                if node.parent == node.parent.parent.left:
                    uncle = node.parent.parent.right
                    
                    if uncle.red:
                        node.parent.red = False
                        uncle.red = False
                        node.parent.parent.red = True
                        node = node.parent.parent
                    else:
                        if node == node.parent.right:                           
                            node = node.parent

                else:
                    try:
                        uncle = node.parent.parent.left
                        
                        if uncle.red:
                            node.parent.red = False
                            uncle.red = False
                            node.parent.parent.red = True

                    except AttributeError:
                        break

            self.root.red = False
        except AttributeError:
            print("Tree is built")

    def real_delete_node(self, key):
        current_node = self.search(key)
        if current_node is None:
            return
        if current_node.parent is None:
            if current_node == self.root:
                self.root = None
            return
        if current_node.parent.left == current_node:
            current_node.parent = None
        else:
            current_node.parent = None


if __name__ == "__main__":
    rb_tree = RBTree()
    rb_tree.insert(1)
    rb_tree.insert(5)
    rb_tree.insert(2)
    rb_tree.insert(10)
    rb_tree.insert(7)
    rb_tree.insert(6)
    rb_tree.search(16)
    rb_tree.insert(12)
    rb_tree.insert(18)
    rb_tree.insert(9)
    rb_tree.insert(4)
    rb_tree.insert(3)
    rb_tree.insert(13)
    rb_tree.insert(19)
    rb_tree.print_tree()