package io.github.dmba.ch1.tasks.q15oneway;

public class EditsVerifierOneLoopImplTest implements EditsVerifierTest {
    @Override
    public EditsVerifier createVerifier() {
        return new EditsVerifierOneLoopImpl();
    }
}
