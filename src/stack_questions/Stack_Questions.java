/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_questions;

/**
 *
 * @author root
 */
public class Stack_Questions {
        
        Node top;
        int length;
        int min;
        
        public Stack_Questions(){
            this.length = 0;
            this.min = 0;
        }
        
        public Stack_Questions(int data){
            top = new Node(data);
            this.length = 0;
            this.min = 0;
        }
        
        public void push(int data){
            Node new_node = new Node(data);
            new_node.next = top;
            top = new_node;
            this.length = this.length + 1;
            
            if(this.length==1){
                this.min = data;
            }
            
            if(data<this.min){
                this.min = data;
            }
        }
        
        public Node pop(){
            
            if(top==null){
                return null;
            } else {            
                Node curr = top;
                top = top.next;
                this.length = this.length - 1;
                return curr;
            }
        }
 
        public int min(){
            return this.min;
        }
    
    // Implement 3 stacks in one array - Approach 1
/*    
    int stacksize = 3;
    int[] buffer = new int[3*stacksize];
    
    int[] stackpointer = {0,0,0};
    
    public void push(int stackNum, int data){
        int index = stackNum * stacksize + stackpointer[stackNum] + 1;
        stackpointer[stackNum]++;
        buffer[index] = data;
    }
    
    public int pop(int stackNum){
        int index = stackNum*stacksize + stackpointer[stackNum];
        stackpointer[stackNum]--;
        int val = buffer[index];
        buffer[index] = 0;
        return val;
    }
*/    
    // Implement 3 stacks in one array - Approach 2
/*    
    int stacksize = 3;
    Node[] buffer = new Node[3*stacksize];
    int Indexused = 0;
    int[] stackpointer = {-1,-1,-1};
    
    public void push(int stackNum, int data){
        int lastindex = stackpointer[stackNum];
        stackpointer[stackNum] = Indexused;
        Indexused++;
        buffer[stackpointer[stackNum]] = new Node(data, lastindex);
    }

    public int pop(int stackNum){
        int val = buffer[stackpointer[stackNum]].data;
        int lastIndex = stackpointer[stackNum];
        stackpointer[stackNum] = buffer[stackpointer[stackNum]].prev;
        Indexused--;
        return val;
    }
*/
        
    public static Stack_Questions sort(Stack_Questions st){
        
        Stack_Questions left = new Stack_Questions();
        Stack_Questions right = new Stack_Questions();
        
        if(st.length==0){
            return null;
        }
        
        int pivot = st.pop().data;
        
        while(st.length!=0){
            int val = st.pop().data;
            if(val<pivot){
                left.push(val);
            } else{
                right.push(val);
            }
        }
        
        sort(left);
        sort(right);
        
        Stack_Questions tmp = new Stack_Questions();
        while(right.length!=0) {
            tmp.push(right.pop().data);
        }
        tmp.push(pivot);
        while(left.length!=0) {
            tmp.push(left.pop().data);
        }
        while(tmp.length!=0) {
            st.push(tmp.pop().data);
        }
  
        return st;
    }    
    
        
}
