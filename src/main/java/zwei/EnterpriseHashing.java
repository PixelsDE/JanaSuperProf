package zwei;

public class EnterpriseHashing extends Hashing implements CryptoSecureHashAlgorithm {


    @Override
    public String calculateHashCode(String document) {
        return null;
    }

    @Override
    public String hashDocument(String document) {
        return calculateHashCode(document);
    }
}
