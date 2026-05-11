package androidx.work.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class G {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18168a;

    /* renamed from: b, reason: collision with root package name */
    private static final String[] f18169b;

    static {
        String i10 = x1.n.i("WrkDbPathHelper");
        Intrinsics.checkNotNullExpressionValue(i10, "tagWithPrefix(\"WrkDbPathHelper\")");
        f18168a = i10;
        f18169b = new String[]{"-journal", "-shm", "-wal"};
    }
}
