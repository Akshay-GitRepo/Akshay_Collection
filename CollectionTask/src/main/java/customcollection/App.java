package customcollection;
import customlist.*;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{public static <T> List<T> asList(T[] a) {
    return (List<T>) new MyArrayList<T>(a);
}

private static class MyArrayList<T> extends AbstractList<T> {

    private final T[] a;

    MyArrayList(T[] array) {
        a = array;
    }

    public T get(int index) {
        return a[index];
    }

    public T set(int index, T element) {
        T oldValue = a[index];
        a[index] = element;
        return oldValue;
    }

    public int size() {
        return a.length;
    }
}
private static final String ArrayList = null;
public static void main(String args[])
{
	
	
	List<Integer> a=new ArrayList<Integer>();
	int choice;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter choice:\n 1)Adding an element \n 2)Removing an element \n 3)Display elements\n");
	choice=sc.nextInt();
		switch (choice)
		{
		case 1:
			int newelement;
			newelement=sc.nextInt();
			a.add(newelement);
			break;
		case 2:
			int b;
			b=index(a);
			a.remove(b);
			break;
		
		
		default: 
			System.out.println("1\n 2\n 3\n 4\n 7\n");
		}
			
	
		}

private static int index(List<Integer> a) {
	return 0;
	// TODO Auto-generated method stub
	
}
}
