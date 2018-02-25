package io.github.dmba.ch1.tasks.q19stringrotation;

public class StringRotationImpl implements StringRotation {
    @Override
    public boolean isRotation(String original, String sample) {
        return original != null && sample != null
                && !original.isEmpty()
                && original.length() == sample.length()
                && isRotationInternal(original, sample);
    }

    private boolean isRotationInternal(String original, String sample) {
        return isSubstring(original + original, sample);
    }

    private boolean isSubstring(String string, String substring) {
        return string.contains(substring);
    }
}
