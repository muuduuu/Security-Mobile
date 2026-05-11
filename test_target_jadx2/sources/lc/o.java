package lc;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class o implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final a f37128b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f37129a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public final Throwable f37130a;

        public b(Throwable exception) {
            Intrinsics.checkNotNullParameter(exception, "exception");
            this.f37130a = exception;
        }

        public boolean equals(Object obj) {
            return (obj instanceof b) && Intrinsics.b(this.f37130a, ((b) obj).f37130a);
        }

        public int hashCode() {
            return this.f37130a.hashCode();
        }

        public String toString() {
            return "Failure(" + this.f37130a + ')';
        }
    }

    private /* synthetic */ o(Object obj) {
        this.f37129a = obj;
    }

    public static final /* synthetic */ o a(Object obj) {
        return new o(obj);
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof o) && Intrinsics.b(obj, ((o) obj2).i());
    }

    public static final Throwable d(Object obj) {
        if (obj instanceof b) {
            return ((b) obj).f37130a;
        }
        return null;
    }

    public static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean f(Object obj) {
        return obj instanceof b;
    }

    public static final boolean g(Object obj) {
        return !(obj instanceof b);
    }

    public static String h(Object obj) {
        if (obj instanceof b) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f37129a, obj);
    }

    public int hashCode() {
        return e(this.f37129a);
    }

    public final /* synthetic */ Object i() {
        return this.f37129a;
    }

    public String toString() {
        return h(this.f37129a);
    }

    public static Object b(Object obj) {
        return obj;
    }
}
