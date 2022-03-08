/**
Encrypt input string. Conditions:
- string is a space separated words
- you need to encrypt each word using following rules:
  * The first letter needs to be converted to its ASCII code
  * The second letter needs to be switched with the last letter
Example:
Task07.encryptThis("Hello") == "72olle"
Task07.encryptThis("hello world") == "104olle 119drlo"
*/

package groovylab

class Task07 {
    public static String encryptThis(String s) {
      return s.split(" ")[0][0].getBytes('US-ASCII').join('')+s.split(" ")[0][-1,2..-2,1] + ' ' +
              s.split(" ")[1][0].getBytes('US-ASCII').join('')+s.split(" ")[1][-1,2..-2,1]
    }
}
