package v7;

import java.io.Closeable;

/* renamed from: v7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4963b implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private static final C4963b f43995a = new C4963b(false, null);

    private C4963b(boolean z10, AbstractC4965d abstractC4965d) {
    }

    public static C4963b a(boolean z10, AbstractC4964c abstractC4964c) {
        return f43995a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
