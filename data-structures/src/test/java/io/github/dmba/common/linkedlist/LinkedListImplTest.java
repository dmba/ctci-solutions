package io.github.dmba.common.linkedlist;

public class LinkedListImplTest implements LinkedListTest {
    private final LinkedList<String> list = new LinkedListImpl<>();

    @Override
    public LinkedList<String> getList() {
        return list;
    }
}
