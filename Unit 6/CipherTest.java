public class CipherTest {
    public static void main(String[] args){
        String test = "abcdefghi";
        SubstitutionCipher testCipher = new SubstitutionCipher(2);
        System.out.println(testCipher.encode(test));

        ShuffleCipher testShuffle = new ShuffleCipher(2);
        System.out.println(testShuffle.encode(test));
    }
}
