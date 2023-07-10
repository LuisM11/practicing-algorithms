public class PasswordSecuritySubstrings {
    private static int getMinFlips(String pwd){
        int count = 0;
        char [] pwdArr = pwd.toCharArray();
        for (int i = 0; i < pwdArr.length -1 ; i+=2) {
            if(pwdArr[i] == pwdArr[i+1]){
                continue;
            }
            else if(pwdArr[i] != pwdArr[i+1]){
                count++;
                char aux = pwdArr[i];
                pwdArr[i+1] = aux;

            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getMinFlips("101"));
    }
}
