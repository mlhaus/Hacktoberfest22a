package codewars;

public class BreakCamelCase {
    public static String camelCase(String input) {
        if( input.length() == 0){
            return "";
        }
        String result = "";
        char[] characters = input.toCharArray(); // https://stackoverflow.com/questions/14498527/java-character-array-initializer

        for (int i = 0; i < input.length() - 1; i++){
            result = result + characters[i];
            if(Character.isUpperCase(characters[i+1])){
                result = result + " ";
            }
        }
        result = result + characters[input.length()-1];
        return result;
    }
}
