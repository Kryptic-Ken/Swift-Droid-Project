/**
 * Created by kendrickgholston on 6/11/17.
 */
import java.util.Arrays;

public class ArrayStack <T> {
    private final static int Default_Capacity = 100;
    private int top;
    private T [] stack;
    public ArrayStack(){
        stack = (T[]) new Object[Default_Capacity];
        top = 0;
    }
    public ArrayStack(int initialCapacity){
        stack = (T[]) new Object[initialCapacity];
        top = 0;
    }
    public void push(T element){
        if (size() == stack.length){
            expandCapacity();
        }
        stack [top] = element;
        top++;
    }
    public int size(){
        return top;
    }
    public void expandCapacity(){
        stack = Arrays.copyOfRange(stack,0, stack.length * 2) ;//To increase the capacity of stack when adding to a full one
    }
    public T pop() throws EmptyCollectionException{
        if (isEmpty()){
            throw new EmptyCollectionException("Stack");
        }
        top--; //takes you to the number being removed
        T temp = stack[top]; //stores the number being rmoeved
        stack [top] = null; //Deletes the number and creates the new top
        return temp;
    }
    public T peek(){
        if (isEmpty()){
            throw new EmptyCollectionException("Stack");
        }
        return stack[top-1];
    }
    public boolean isEmpty(){
        if (top == 0){
            return true;
        }else{
            return false;
        }
    }
    public String toString(){
        String stackS = "";
        for (int i =0; i<top;i++){
            stackS = stackS + stack[i] + " ";
        }
        return stackS;
    }
}
