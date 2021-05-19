import java.util.*;
import java.util.Scanner;

public class ArrayListImplementation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();//creation of arraylist
        ArrayList<Integer> numberList = new ArrayList<>();
        //adding list element;
        list.add("Mango");
        list.add("Apple");
        list.add("Banana");
        list.add("Grapes");

        //adding number in list
        System.out.println("Enter the Value for Number List");
        for (int i = 0; i < 5; i++) {
            numberList.add(scan.nextInt());
        }
        System.out.println(numberList);//printing number list

        //printing a list
        System.out.println(list);
        //adding element at specifies index
        list.add(1,"Orange");
        System.out.println(list);

        //Traversing in ArrayList
        //For-each Loop
        for (String str:list) {
            System.out.print(str+" ");
        }
        System.out.println();
        //Iterating ArrayList Using Iterator
        //Note : it moves only in forward Direction
        Iterator itr = numberList.iterator();//getting the iterator
        while(itr.hasNext()){//check if iterator has the elements
            System.out.print(itr.next()+" ");//printing value and move to next
        }

        //Accessing the element of ArrayList
        //Finding a sum of all elements in NumberList
        int sum = 0;
        for (int i = 0; i < numberList.size(); i++) {
            sum+= numberList.get(i);
        }
        System.out.println("Total sum Of Elements : "+sum);

        //change the value of specifies index using set()
        //change the even numbers in list with next odd number
        for (int i = 0; i < numberList.size(); i++) {
            if(numberList.get(i)%2==0){
                numberList.set(i,numberList.get(i)+1);
            }
        }
        System.out.println("Changed List : "+numberList);

        //sorting ArrayList using Collections.sort(list);
        Collections.sort(numberList);
        System.out.println("Sorted Changed List : "+numberList);
        Collections.sort(list);
        System.out.println("Sorted Fruit List : "+list);

        //reverse ArrayList using ListIterator Interface
        ListIterator<String> list1 = list.listIterator();
        while(list1.hasPrevious()){
            System.out.println(list1.previous());
        }
        //Traversing through forEach() method:
        numberList.forEach(a->{
            System.out.println(a);
        });
        //Traversing through forEachRemaining() method
        Iterator<String> ITR = list.iterator();
        ITR.forEachRemaining(a->{
            System.out.println(a);
        });

    }
}
