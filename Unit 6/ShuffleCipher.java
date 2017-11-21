public class ShuffleCipher implements MessageEncoder, MessageDecoder {
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
        StringBuilder newString1 = new StringBuilder(plainText.substring(0, plainText.length()/2+1));
        StringBuilder newString2 = new StringBuilder(plainText.substring(plainText.length()/2+1, plainText.length()));
        StringBuilder newString = new StringBuilder();
        while(newString1.length()>0) {
            newString.append(newString1.charAt(0));
            newString1.deleteCharAt(0);
            if(newString2.length()>0) {
                newString.append(newString2.charAt(0));
                newString2.deleteCharAt(0);
            }
        }
        plainText = newString.toString();
        return plainText;
    }

    public String decode(String cipherText) {
        for(int i = 0; i<n; i++) {
            cipherText = this.decodeStep(cipherText);
        }
        return cipherText;
    }

    private String decodeStep(String cipherText) {
        StringBuilder newString1 = new StringBuilder();
        StringBuilder newString2 = new StringBuilder();
        StringBuilder newString = new StringBuilder(cipherText);
        while(newString.length()>0) {
            newString1.append(newString.charAt(0));
            newString.deleteCharAt(0);
            if(newString.length()>0) {
                newString2.append(newString.charAt(0));
                newString.deleteCharAt(0);
            }
        }
        newString1.append(newString2);
        cipherText = newString1.toString();
        return cipherText;
    }

}
