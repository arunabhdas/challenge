# you can write to stdout for debugging purposes, e.g.
# print("this is a debug message")

from extratypes import Tree  # library with types used in the task

def solution(T):
    # write your code in Python 3.6
    nodesRemoved = 0

      
    node_count = countNodes(T) 
    index = 0 
      

    while (not isComplete(T, index, node_count)):
        
        if isComplete(T, index, node_count): 
            print ("The Binary Tree is perfect")
            
            
        else: 
            print ("The Binary Tree is not perfect") 
            if (countLeftNodes(T) > countRightNodes(T)):
                T.l = None
                nodesRemoved += 1
            else:
                T.r = None
                nodesRemoved += 1
            



    return nodesRemoved
  
 

def countNodes(T): 
    if T is None: 
        return 0 
    return (1+ countNodes(T.l) + countNodes(T.r)) 


def countLeftNodes(T): 
    if T is None: 
        return 0 
    return (1 + countNodes(T.l)) 
    
def countRightNodes(T): 
    if T is None: 
        return 0 
    return (1 + countNodes(T.r)) 

def isComplete(T, index, number_nodes): 
      
    # An empty is complete 
    if T is None: 
        return True
      
    # If index assigned to current nodes is more than 
    # number of nodes in tree, then tree is not complete 
    if index >= number_nodes : 
        return False
      
    # Recur for left and right subtress 
    return (isComplete(T.l , 2*index+1 , number_nodes) 
        and isComplete(T.r, 2*index+2, number_nodes) 
          ) 
  