public class CipherTest {
    public static void main(String[] args){
        String test = "abcdefghi";
        SubstitutionCipher testCipher = new SubstitutionCipher(2);
        test = testCipher.encode(test);
        System.out.println(test);
        test = testCipher.decode(test);
        System.out.println(test);


        ShuffleCipher testShuffle = new ShuffleCipher(2);
        test = testShuffle.encode(test);
        System.out.println(test);
        test = testShuffle.decode(test);
        System.out.println(test);
    }
}
