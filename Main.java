import java.util.Scanner;
class Stack{
    private int arr[];
    private int size;
    private int top;

    public Stack(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    public void push(int value){
        if(top == size - 1){
            System.out.println("Stack over flow");
            return;
        }
        arr[++top] = value;
        System.out.println(value + " number has pushed into the stack");
    }

    public int pop(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top--];
    }

    public int peek(){
        if(top == -1){
            System.out.println("Stack is Empty");
            return -1;
        }
        return arr[top];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == size - 1;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return;
        }

        System.out.println("Stack Elements: ");
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();

        Stack st = new Stack(size);
        
        boolean exit = false;
        do{
            System.out.println("1.Push the number in stack");
            System.out.println("2. Popped element from stack");
            System.out.println("3. Display the elements");
            System.out.println("4. Display topmost element");
            System.out.println("5. Exit");
            int ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Push the element in Stack");
                    int val = sc.nextInt();
                    st.push(val);
                    break;
                case 2:
                    System.out.print("Popped element: "+ st.pop());
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    System.out.print("Topmost Element: " + st.peek());
                    break;
                case 5:
                    System.out.println("Exiting......");
                    exit = true;
                    break;
                default:
                    System.out.println("Enter the valid number from 1-5");
            }
        }while(!exit);

        sc.close();
    }
}