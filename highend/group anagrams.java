import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        for(int i=0;i<str.length;i++) {
            if (str[i] == "*") {
                continue;
            }
            char[] arr = str[i].toCharArray();
            Arrays.sort(arr);
            String str1 = new String(arr);
            System.out.print(str[i] + " ");
            for(int j=i+1;j<str.length;j++) {
                char[] arr2 = str[j].toCharArray();
                Arrays.sort(arr2);
                String str2 = new String(arr2);
                if (str1.equals(str2)) {
                    System.out.print(str[j] + " ");
                    str[j] = "*";
                }
            }
            System.out.println();
        }
    }
}
