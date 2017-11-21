public class SubstitutionCipher implements MessageEncoder, MessageDecoder {
    int shift;

    public SubstitutionCipher(int shift){
        this.shift = shift;
    }

    public String encode(String plainText){
        for(int i = 0; i<this.shift; i++){
            plainText = this.encodeStep(plainText);
        }
        return plainText;
    }

    private String encodeStep(String plainText){
        String newString = plainText.charAt(plainText.length()-1) + plainText.substring(0, plainText.length()-1);
        return newString;
    }

    public String decode(String cipherText) {
        for(int i = 0; i<this.shift; i++) {
            cipherText = this.decodeStep(cipherText);
        }
        return cipherText;
    }

    private String decodeStep(String cipherText) {
        String newString = cipherText.substring(1,cipherText.length()) + cipherText.charAt(0);
        return newString;
    }
}
