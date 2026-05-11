package Oc;

import bd.t;
import cd.C1750a;
import cd.C1751b;
import id.C3367b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class f implements t {

    /* renamed from: c, reason: collision with root package name */
    public static final a f7286c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Class f7287a;

    /* renamed from: b, reason: collision with root package name */
    private final C1750a f7288b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f a(Class klass) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            C1751b c1751b = new C1751b();
            c.f7284a.b(klass, c1751b);
            C1750a n10 = c1751b.n();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (n10 == null) {
                return null;
            }
            return new f(klass, n10, defaultConstructorMarker);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, C1750a c1750a, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, c1750a);
    }

    @Override // bd.t
    public C1750a a() {
        return this.f7288b;
    }

    @Override // bd.t
    public void b(t.d visitor, byte[] bArr) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        c.f7284a.i(this.f7287a, visitor);
    }

    @Override // bd.t
    public void c(t.c visitor, byte[] bArr) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        c.f7284a.b(this.f7287a, visitor);
    }

    public final Class d() {
        return this.f7287a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && Intrinsics.b(this.f7287a, ((f) obj).f7287a);
    }

    @Override // bd.t
    public String getLocation() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f7287a.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(StringsKt.y(name, '.', '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    public int hashCode() {
        return this.f7287a.hashCode();
    }

    @Override // bd.t
    public C3367b l() {
        return Pc.d.a(this.f7287a);
    }

    public String toString() {
        return f.class.getName() + ": " + this.f7287a;
    }

    private f(Class cls, C1750a c1750a) {
        this.f7287a = cls;
        this.f7288b = c1750a;
    }
}
