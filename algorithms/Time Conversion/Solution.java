import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    public static String timeConversion(String s) {
        
        String[] hourToConvert = s.split(":");
        
        int hour = Integer.valueOf(hourToConvert[0]);
        String finalHour = "";
        
        if (hourToConvert[2].contains("AM")){
            
            if (hour == 12){
                hourToConvert[0] = "00";
            } else if (hour < 10){
                hourToConvert[0] = "0" + hour;
            }
            
            for (int i = 0; i < hourToConvert.length - 1; i++){
                finalHour = finalHour + hourToConvert[i] + ":";
            }
            
            finalHour += hourToConvert[2].substring(0, 2);
            
        } else {
            
            hour += 12;
    
            if (hour == 24){
                hour = 12;
                hourToConvert[0] = "" + hour;
            } else {
                hourToConvert[0] = "" + hour;
            }
            
            for (int i = 0; i < hourToConvert.length - 1; i++){
                finalHour = finalHour + hourToConvert[i] + ":";
            }
            
            finalHour += hourToConvert[2].substring(0, 2);
            
        }
    
        return finalHour;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
