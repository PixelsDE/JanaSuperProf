package zwei;

public class PreviewHashing extends Hashing implements SimpleHashAlgorithm {
    @Override
    public String hashDocument(String document) {
        if (document.length() > 1000)
            throw new IllegalArgumentException("Document is too long");
        return calculateHashCode(document);
    }

}
