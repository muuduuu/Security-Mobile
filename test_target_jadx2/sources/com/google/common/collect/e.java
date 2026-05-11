package com.google.common.collect;

/* loaded from: classes2.dex */
public abstract class e {
    static StringBuilder a(int i10) {
        d.b(i10, "size");
        return new StringBuilder((int) Math.min(i10 * 8, 1073741824L));
    }
}
