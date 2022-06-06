package lab_06;

import java.util.Arrays;

public class Lab06_04_CheckDomain {
    public static void main(String[] args) {
        String url = "https://google.com";

        String schema = url.substring(0, 5);
        String domain = url.substring(14);

        System.out.println("Schema:" + schema);

        System.out.println("Domain:" + domain);
    }
}
