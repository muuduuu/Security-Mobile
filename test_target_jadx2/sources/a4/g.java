package a4;

import j3.AbstractC3486b;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import xc.C5146G;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final a f12603c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    private static final g f12604d = new g(-1, false);

    /* renamed from: e, reason: collision with root package name */
    private static final g f12605e = new g(-2, false);

    /* renamed from: f, reason: collision with root package name */
    private static final g f12606f = new g(-1, true);

    /* renamed from: a, reason: collision with root package name */
    private final int f12607a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12608b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f12604d;
        }

        public final g b() {
            return g.f12605e;
        }

        private a() {
        }
    }

    private g(int i10, boolean z10) {
        this.f12607a = i10;
        this.f12608b = z10;
    }

    public static final g c() {
        return f12603c.a();
    }

    public static final g e() {
        return f12603c.b();
    }

    public final boolean d() {
        return this.f12608b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f12607a == gVar.f12607a && this.f12608b == gVar.f12608b;
    }

    public final int f() {
        if (h()) {
            throw new IllegalStateException("Rotation is set to use EXIF");
        }
        return this.f12607a;
    }

    public final boolean g() {
        return this.f12607a != -2;
    }

    public final boolean h() {
        return this.f12607a == -1;
    }

    public int hashCode() {
        return AbstractC3486b.b(Integer.valueOf(this.f12607a), Boolean.valueOf(this.f12608b));
    }

    public String toString() {
        C5146G c5146g = C5146G.f44966a;
        String format = String.format(null, "%d defer:%b", Arrays.copyOf(new Object[]{Integer.valueOf(this.f12607a), Boolean.valueOf(this.f12608b)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(locale, format, *args)");
        return format;
    }
}
