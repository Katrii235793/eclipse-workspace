package pack;
 
public class Code1 {
 
    public static void main(String[] args) {
 
        try {
            // code which might raise exception
 
            // arithmetic operation
            int result = 18/0;
            System.out.println("Result of division : "
                    + result);
 
            // String operation
            String str = null;
            System.out.println("Lenght of the String : "
                    + str.length());
 
            // Number conversion
            String s1 = "abc";
            int convertedInt = Integer.parseInt(s1);
            System.out.println("Converted integer : "
                    + convertedInt);
 
            // Array operation
            char[] ch = new char[4];
            ch[7] = 'B';
        }
        catch(ArithmeticException aex) {
            // corresponding handling code,
            // if any exception from try block
            aex.printStackTrace();
        }
        catch(NullPointerException npex) {
            // corresponding handling code,
            // if any exception from try block
            System.out.println(npex.toString());
        }
        catch(NumberFormatException nfex) {
            // corresponding handling code,
            // if any exception from try block
            System.out.println(nfex.toString());
        }
        catch(ArrayIndexOutOfBoundsException aioobex) {
            // corresponding handling code,
            // if any exception from try block
            System.out.println(aioobex.toString());
        }
        finally {
            // finally block always gets executed
            // for code clean-up activities
 
            System.out.println("finally block always gets executed");
            // rest of the code clean-up
        }
    }
}