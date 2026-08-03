class Stack{
        int[] stack = new int[5];
        int top = -1;
        public void push(int value){
        if(top == stack.length - 1){
            System.out.println("print stack overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println("pushed value: " + value);
        }
        }
    public void display(){
            if(top == -1){
                System.out.println("stack is empty");
            }
            for(int i = top;i>=0;i--){
                System.out.println(stack[i]);
            }
        }

    }
public class Main{
public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
}
}