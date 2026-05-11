package Td;

import java.nio.charset.Charset;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static final a f10239e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f10240a;

    /* renamed from: b, reason: collision with root package name */
    private final String f10241b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10242c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f10243d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return Wd.g.d(str);
        }

        public final z b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            return Wd.g.e(str);
        }

        private a() {
        }
    }

    public z(String mediaType, String type, String subtype, String[] parameterNamesAndValues) {
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(subtype, "subtype");
        Intrinsics.checkNotNullParameter(parameterNamesAndValues, "parameterNamesAndValues");
        this.f10240a = mediaType;
        this.f10241b = type;
        this.f10242c = subtype;
        this.f10243d = parameterNamesAndValues;
    }

    public static /* synthetic */ Charset b(z zVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return zVar.a(charset);
    }

    public static final z c(String str) {
        return f10239e.a(str);
    }

    public static final z g(String str) {
        return f10239e.b(str);
    }

    public final Charset a(Charset charset) {
        String f10 = f("charset");
        if (f10 == null) {
            return charset;
        }
        try {
            return Charset.forName(f10);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String d() {
        return this.f10240a;
    }

    public final String[] e() {
        return this.f10243d;
    }

    public boolean equals(Object obj) {
        return Wd.g.a(this, obj);
    }

    public final String f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return Wd.g.c(this, name);
    }

    public final String h() {
        return this.f10242c;
    }

    public int hashCode() {
        return Wd.g.b(this);
    }

    public final String i() {
        return this.f10241b;
    }

    public String toString() {
        return Wd.g.f(this);
    }
}
