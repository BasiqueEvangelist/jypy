package com.github.kb1000.jypy;

public final class PyNone extends PyObject {
    private PyNone() {
        synchronized (PyNone.class) {
            if (!registerNoneSingleton(this)) {
                throw new UnsupportedOperationException("Can not create more than one instance of PyNone!");
            }
        }
    }

    public static final PyNone INSTANCE = new PyNone();

    /**
     * This is used to prevent bad people from hackimg into this class using reflection and make more than one instance.
     * It will also be used to publish this instance to native code.
     *
     * @return whether there is already an instance
     */
    private static native boolean registerNoneSingleton(PyNone instance);
}
