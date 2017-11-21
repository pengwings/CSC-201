public class ShuffleCipher implements MessageEncoder {
    int n;

    public ShuffleCipher(int n){
        this.n = n;
    }

    public String encode(String plainText){
        for(int i = 0; i<n; i++){
            plainText = this.encodeStep(plainText);
        }
        return plainText;
    }

    private String encodeStep(String plainText){
        String newString1 = plainText.substring(0, plainText.length()/2+1);
        String newString2 = plainText.substring(plainText.length()/2+1, plainText.length());
        String newString = "";
        try {
            for (int i = 0; i < newString1.length()+1; i++) {
                newString = newString + newString1.charAt(i) + newString2.charAt(i);
            }
        } catch(StringIndexOutOfBoundsException e){
            newString = newString + newString1.charAt(newString1.length()-1);
        }
        return newString;
    }

}
