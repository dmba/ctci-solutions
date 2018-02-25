package io.github.dmba.ch1.tasks.q13urlify;

public class URLifyImplTest implements URLifyTest {
    @Override
    public URLify createURLify() {
        return new URLifyImpl();
    }
}
