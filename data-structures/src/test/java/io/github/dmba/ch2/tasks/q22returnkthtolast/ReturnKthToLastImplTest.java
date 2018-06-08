package io.github.dmba.ch2.tasks.q22returnkthtolast;

public class ReturnKthToLastImplTest implements ReturnKthToLastTest {
    @Override
    public ReturnKthToLast<String> createReturnKthToLast() {
        return new ReturnKthToLastImpl<>();
    }
}
