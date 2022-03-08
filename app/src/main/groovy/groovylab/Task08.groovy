/**
Parse input json, find all entries, and return another json with values where
sum of digits in value field equal to 9.
Example:
Task08.parseAndFilterJson("{\"Kate\":18,\"Alan\":16,\"Osvald\":27}") == "{\"Kate\":18,\"Osvald\":27}"`
*/

package groovylab

class Task08 {
    public static String parseAndFilterJson(String input) {
        def json = new groovy.json.JsonSlurper().parseText(input)
        def value = json.findAll {it -> it.value % 9 == 0}
        return new groovy.json.JsonBuilder(value).toString()
    }
}
