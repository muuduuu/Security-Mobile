package pe;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pe.S;

/* renamed from: pe.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3884l {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38706a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC3884l f38707b;

    /* renamed from: c, reason: collision with root package name */
    public static final S f38708c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC3884l f38709d;

    /* renamed from: pe.l$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        AbstractC3884l c3893v;
        try {
            Class.forName("java.nio.file.Files");
            c3893v = new L();
        } catch (ClassNotFoundException unused) {
            c3893v = new C3893v();
        }
        f38707b = c3893v;
        S.a aVar = S.f38611b;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f38708c = S.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = qe.h.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        f38709d = new qe.h(classLoader, false, null, 4, null);
    }

    public final Z a(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return b(file, false);
    }

    public abstract Z b(S s10, boolean z10);

    public abstract void c(S s10, S s11);

    public final void d(S dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        e(dir, false);
    }

    public final void e(S dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        qe.c.a(this, dir, z10);
    }

    public final void f(S dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        g(dir, false);
    }

    public abstract void g(S s10, boolean z10);

    public final void h(S path) {
        Intrinsics.checkNotNullParameter(path, "path");
        i(path, false);
    }

    public abstract void i(S s10, boolean z10);

    public final boolean j(S path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return qe.c.b(this, path);
    }

    public abstract List k(S s10);

    public final C3883k l(S path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return qe.c.c(this, path);
    }

    public abstract C3883k m(S s10);

    public abstract AbstractC3882j n(S s10);

    public final Z o(S file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return p(file, false);
    }

    public abstract Z p(S s10, boolean z10);

    public abstract b0 q(S s10);
}
