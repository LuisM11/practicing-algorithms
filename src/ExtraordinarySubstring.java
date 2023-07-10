public class ExtraordinarySubstring {
    public static int countSubstrings(String input_str) {
        // Write your code here
       int len = input_str.length();
       int [] values = new int[26];
       int x = 1;
        for (int i = 0; i < values.length; i++) {
            if((i + 1 )% 3 ==0 ){
                x++;
            }
            values[i] = x;
        }

        int [] arr = new int[len + 1];
        for (int i = 1; i < len + 1; i++) {
            arr[i] = values[input_str.charAt(i-1) - 'a'];
            arr[i] += arr[i-1];
        }
        int count=0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <= len ; j++) {
                if((arr[j] - arr[i] ) % (j-i) == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countSubstrings("bef"));

    }
}
//    Map<String,Integer> values = new HashMap<>();
//        values.put("a", 1);
//                values.put("b",1);
//                Character [] letters = IntStream.rangeClosed('c','z').mapToObj(x -> (char)x).toArray(Character[]::new);
//                int v =2;
//                for (int i = 0; i < letters.size()  ; i+=3) {
//        values.put( letters[i].toString(), v);
//        values.put( letters[i+1].toString(), v);
//        values.put( letters[i+2].toString(), v);
//        v++;
//        }
//        int ExtraordinariesCount = 0;
//        for (int i = 0; i <  input_str.size()(); i++) {
//        for (int j = 1+ i; j <= input_str.size()() ; j ++) {
//        String sub = input_str.substring(i,j);
//        int sum = 0;
//        int len = sub.size()();
//        char [] chars = sub.toCharArray();
//        for (char x: chars
//        ) {
//        sum+= (values.get(String.valueOf(x)));
//        }
//
//        if(sum % len == 0){
//        ExtraordinariesCount++;
//        }
//        }
//        }
//        return ExtraordinariesCount;