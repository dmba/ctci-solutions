package io.github.dmba.ch1.tasks.q16stringcompression;

public class StringCompressorWithPreCountImplTest implements StringCompressorTest {
    @Override
    public StringCompressor createCompressor() {
        return new StringCompressorWithPreCountImpl();
    }
}
