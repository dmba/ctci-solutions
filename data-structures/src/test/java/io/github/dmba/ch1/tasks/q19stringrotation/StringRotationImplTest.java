package io.github.dmba.ch1.tasks.q19stringrotation;

public class StringRotationImplTest implements StringRotationTest {
    @Override
    public StringRotation createZeroString() {
        return new StringRotationImpl();
    }
}
