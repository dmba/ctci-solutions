package io.github.dmba.ch1.tasks.q15oneway;

public class EditsVerifierImplTest implements EditsVerifierTest {
    @Override
    public EditsVerifier createVerifier() {
        return new EditsVerifierImpl();
    }
}
