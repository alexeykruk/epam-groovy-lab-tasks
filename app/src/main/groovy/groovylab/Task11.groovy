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
        def position
        if (num == 1){
            position = 2
        }
        else if (num == 2){
            position = 6
        }
        else if (num == 3){
            position = 10
        }
        return GSTRING_TEMPLATE.substring(0, position) + "$text" +
         GSTRING_TEMPLATE.substring(position)
        throw UnsupportedOperationException('Not Implemented!')
    }
}
