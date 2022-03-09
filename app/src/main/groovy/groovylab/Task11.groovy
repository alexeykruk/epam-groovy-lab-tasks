/**
Insert first input string inside the brackets, near the number, which equals to
the second input parameter (template is set to GSTRING_TEMPLATE static
property). Example:
Task11.gstring("test", 2) == "1() 2(test) 3()"
*/

package groovylab

class Task11 {
    private static final String GSTRING_TEMPLATE = "1() 2() 3()"

    public static String gstring(String text, int num) {
        def list = []
        for(int i = 1; i <= 3; i++)
             i == num ? list.add(i.toString() + "(" + text + ")") : list.add(i.toString() + "()")  
        return list.join(" ")
    }
}
