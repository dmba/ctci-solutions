package io.github.dmba.ch1.tasks.q17rotatematrix;

public class RotateMatrixWithAdditionalMatrixTest implements RotateMatrixTest {
    @Override
    public RotateMatrix createRotator() {
        return new RotateMatrixWithAdditionalMatrix();
    }
}
