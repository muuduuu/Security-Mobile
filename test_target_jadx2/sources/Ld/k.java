package Ld;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final b f5805b = new b(null);

    /* renamed from: c, reason: collision with root package name */
    private static final c f5806c = new c();

    /* renamed from: a, reason: collision with root package name */
    private final Object f5807a;

    public static final class a extends c {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f5808a;

        public a(Throwable th) {
            this.f5808a = th;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && Intrinsics.b(this.f5808a, ((a) obj).f5808a);
        }

        public int hashCode() {
            Throwable th = this.f5808a;
            if (th != null) {
                return th.hashCode();
            }
            return 0;
        }

        @Override // Ld.k.c
        public String toString() {
            return "Closed(" + this.f5808a + ')';
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Object a(Throwable th) {
            return k.c(new a(th));
        }

        public final Object b() {
            return k.c(k.f5806c);
        }

        public final Object c(Object obj) {
            return k.c(obj);
        }

        private b() {
        }
    }

    public static class c {
        public String toString() {
            return "Failed";
        }
    }

    private /* synthetic */ k(Object obj) {
        this.f5807a = obj;
    }

    public static final /* synthetic */ k b(Object obj) {
        return new k(obj);
    }

    public static boolean d(Object obj, Object obj2) {
        return (obj2 instanceof k) && Intrinsics.b(obj, ((k) obj2).k());
    }

    public static final Throwable e(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null) {
            return aVar.f5808a;
        }
        return null;
    }

    public static final Object f(Object obj) {
        if (obj instanceof c) {
            return null;
        }
        return obj;
    }

    public static int g(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean h(Object obj) {
        return obj instanceof a;
    }

    public static final boolean i(Object obj) {
        return !(obj instanceof c);
    }

    public static String j(Object obj) {
        if (obj instanceof a) {
            return ((a) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return d(this.f5807a, obj);
    }

    public int hashCode() {
        return g(this.f5807a);
    }

    public final /* synthetic */ Object k() {
        return this.f5807a;
    }

    public String toString() {
        return j(this.f5807a);
    }

    public static Object c(Object obj) {
        return obj;
    }
}
