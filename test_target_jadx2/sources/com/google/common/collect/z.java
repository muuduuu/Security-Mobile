package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes2.dex */
public abstract class z implements Iterator {
    protected z() {
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
