package pack;
import java.util.LinkedList;
public class Lcode2 {
public static void main(String[] args) {
   // create an empty linked list
   LinkedList<String> obj2 = new LinkedList<String>();
 // use add() method to add values in the linked list
        obj2.add("Monday");
        obj2.add("Tuesday");
        obj2.add("Wednesday");
        obj2.add("Thursday");
        obj2.add("Friday");
        obj2.add("Saturday");
        for (String day :obj2) {
            System.out.println(day);
            }
         }
        }

//syntax for enhanced for loop:for(declaration:expression)
//we have declared the variable day with the datatype compatible with
//the datatype of elements of linkedlist.
//after then a semi colon followed by the expression.
//Here reqd expression is printing the day.
//so we give the objects as the expression so that
//they will be printed