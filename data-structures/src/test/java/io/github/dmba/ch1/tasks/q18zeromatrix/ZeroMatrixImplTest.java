package io.github.dmba.ch1.tasks.q18zeromatrix;

public class ZeroMatrixImplTest implements ZeroMatrixTest {
    @Override
    public ZeroMatrix createZeroMatrix() {
        return new ZeroMatrixImpl();
    }
}
