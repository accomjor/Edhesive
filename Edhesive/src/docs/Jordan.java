package docs;

public abstract class Jordan {
	// print an OBJECT to the console on a new line.
    // Updated: Version 2.0

    public static void say(Object o){
        System.out.println((String) o);
        return;
    }
    
    // print a raw OBJECT to the console.
    // Updated: Version 2.0
    public static void raw(Object o){
        System.out.print((String) o);
        return;
    }
}
