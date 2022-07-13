package zwei;

public interface SimpleHashAlgorithm extends HashFunction {
    @Override
    default String calculateHashCode(String document) {
        return calculateHashCode(document);
    }
}
