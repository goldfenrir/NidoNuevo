/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nidonuevo.model;
import java.util.Stack;

public class StateMachine {
    
    private Stack<Object> stackSM=new Stack<Object>();
    
    public void udpate(){ //falta el argumento elapsedTime, cual es el tipo? -> GF:double

    }
    
    public void render(){
        
    }
    
    public void add(State state){
        
    }
    
    public void pull(){
        
    }

    public Stack<Object> getState() {
        return stackSM;
    }

    public void setState(Stack<Object> stackSM) {
        this.stackSM = stackSM;
    }
    
    
}