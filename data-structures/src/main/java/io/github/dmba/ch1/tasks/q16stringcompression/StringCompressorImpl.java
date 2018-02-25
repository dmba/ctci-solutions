package io.github.dmba.ch1.tasks.q16stringcompression;

public class StringCompressorImpl implements StringCompressor {
    @Override
    public String compress(String str) {
        return str != null ? compressInternal(str) : null;
    }

    private String compressInternal(String original) {
        final StringBuilder compressed = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < original.length(); i++) {
            counter++;
            if (i + 1 == original.length() || original.charAt(i) != original.charAt(i + 1)) {
                compressed.append(original.charAt(i)).append(counter);
                counter = 0;
            }
        }
        return pickSmaller(original, compressed);
    }

    private String pickSmaller(String original, StringBuilder compressed) {
        return compressed.length() >= original.length() ? original : compressed.toString();
    }
}
