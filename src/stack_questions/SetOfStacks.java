/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_questions;

import java.util.ArrayList;

/**
 *
 * @author root
 */
public class SetOfStacks {
    
    ArrayList<Stack_Questions> stacks = new ArrayList<>();
    int capacity;
    
    public SetOfStacks(int capacity){
        this.capacity = capacity;
    }
    
    public Stack_Questions getLastStack(){
        if(stacks.size()==0){
            return null;
        } else{
            return stacks.get(stacks.size()-1);
        }
    }
    
    public void push(int data){
        Stack_Questions last = getLastStack();
        if(last!=null && last.length!=this.capacity){
            last.push(data);
        } else {
            Stack_Questions st = new Stack_Questions();
            st.push(data);
            stacks.add(st);
        }
    }
    
    public int pop(){
        Stack_Questions last = getLastStack();
        Node n = last.pop();
        int val = n.data;
        if(last.length==0){
            stacks.remove(stacks.size()-1);
        }
        return val;
    }
    
    public int popAtIndex(int index){
        Stack_Questions st = stacks.get(index);
        Node n = st.pop();
        int val = n.data;
        return val;
    }
    
    
}
