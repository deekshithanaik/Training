1. Imagine you are working on a network configuration tool for a company. This tool needs to validate the IPv4 addresses entered by users to ensure they are correctly formatted before saving them in the system. An incorrectly formatted IP address could lead to network connectivity issues, making validation a crucial part of the tool.
Input: "222.111.111.111"
Output: true
Explanation: All parts are numeric and within the range 0-255.




import java.util.regex.Pattern;

public class pattenmatch {
    public static void main(String[] args) {
        String ipaddress="^[0-255. ]{12,}$";
        String address="222.111.111.111";
        System.out.println(Pattern.matches(ipaddress, address));
    }
    
}
