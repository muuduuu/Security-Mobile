package Ec;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
final class M {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f1955a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1956b;

    /* renamed from: c, reason: collision with root package name */
    private ClassLoader f1957c;

    public M(ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        this.f1955a = new WeakReference(classLoader);
        this.f1956b = System.identityHashCode(classLoader);
        this.f1957c = classLoader;
    }

    public final void a(ClassLoader classLoader) {
        this.f1957c = classLoader;
    }

    public boolean equals(Object obj) {
        return (obj instanceof M) && this.f1955a.get() == ((M) obj).f1955a.get();
    }

    public int hashCode() {
        return this.f1956b;
    }

    public String toString() {
        String obj;
        ClassLoader classLoader = (ClassLoader) this.f1955a.get();
        return (classLoader == null || (obj = classLoader.toString()) == null) ? "<null>" : obj;
    }
}
