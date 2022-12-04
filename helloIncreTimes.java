public class helloIncreTimes {

    static void encode(String s, int k) {

        String newS = "";

        for (int i = 0; i < s.length(); ++i) {
            int val = s.charAt(i);
            int dup = k;

            if (val + k > 122) {
                k = k - (122 - val);
                k = k % 26;

                newS = newS + (char) (96 + k);
            } else {
                newS = newS + (char) (val + k);
            }

            k = dup;
        }

        System.out.println(newS);
    }

    public static void main(String[] args) {
        String str = "abc";
        int k = 28;

        encode(str, k);
    }
}
