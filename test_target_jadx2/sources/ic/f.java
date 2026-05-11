package Ic;

import Hc.j;
import id.C3367b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private final id.c f4414a;

    /* renamed from: b, reason: collision with root package name */
    private final String f4415b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4416c;

    /* renamed from: d, reason: collision with root package name */
    private final C3367b f4417d;

    public static final class a extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final a f4418e = new a();

        private a() {
            super(j.f3891y, "Function", false, null);
        }
    }

    public static final class b extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final b f4419e = new b();

        private b() {
            super(j.f3888v, "KFunction", true, null);
        }
    }

    public static final class c extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final c f4420e = new c();

        private c() {
            super(j.f3888v, "KSuspendFunction", true, null);
        }
    }

    public static final class d extends f {

        /* renamed from: e, reason: collision with root package name */
        public static final d f4421e = new d();

        private d() {
            super(j.f3883q, "SuspendFunction", false, null);
        }
    }

    public f(id.c packageFqName, String classNamePrefix, boolean z10, C3367b c3367b) {
        Intrinsics.checkNotNullParameter(packageFqName, "packageFqName");
        Intrinsics.checkNotNullParameter(classNamePrefix, "classNamePrefix");
        this.f4414a = packageFqName;
        this.f4415b = classNamePrefix;
        this.f4416c = z10;
        this.f4417d = c3367b;
    }

    public final String a() {
        return this.f4415b;
    }

    public final id.c b() {
        return this.f4414a;
    }

    public final id.f c(int i10) {
        id.f o10 = id.f.o(this.f4415b + i10);
        Intrinsics.checkNotNullExpressionValue(o10, "identifier(...)");
        return o10;
    }

    public String toString() {
        return this.f4414a + '.' + this.f4415b + 'N';
    }
}
