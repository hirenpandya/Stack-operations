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
public class MyQueue {
    
    Stack_Questions s1, s2;
    int len;
    
    public MyQueue(){
        s1 = new Stack_Questions();
        s2 = new Stack_Questions();
    }
    
    public int size(){
        this.len = s1.length + s2.length;
        return this.len;
    }
 
    public void add(int data){
        s1.push(data);
    }            
    
    public int remove(){
        if(s2.length!=0){
            Node n = s2.pop();
            return n.data;
        } else {
            while(s1.length!=0){
                s2.push(s1.pop().data);
            }
            
            return s2.pop().data;                   
        }
    }
   
    
}
