package l5;

import android.content.Context;
import android.net.Uri;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3609a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0550a f37086e = new C0550a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f37087a;

    /* renamed from: b, reason: collision with root package name */
    private final Uri f37088b;

    /* renamed from: c, reason: collision with root package name */
    private final double f37089c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f37090d;

    /* renamed from: l5.a$a, reason: collision with other inner class name */
    public static final class C0550a {
        public /* synthetic */ C0550a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C3609a a(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new C3609a(context, "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII=", 0.0d, 0.0d, 12, null);
        }

        private C0550a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3609a(Context context, String str) {
        this(context, str, 0.0d, 0.0d, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final Uri a(Context context) {
        this.f37090d = true;
        return c.f37094b.a().h(context, this.f37087a);
    }

    private final Uri b(Context context) {
        try {
            Uri parse = Uri.parse(this.f37087a);
            if (parse.getScheme() == null) {
                parse = a(context);
            }
            Intrinsics.d(parse);
            return parse;
        } catch (NullPointerException unused) {
            return a(context);
        }
    }

    public final double c() {
        return this.f37089c;
    }

    public final String d() {
        return this.f37087a;
    }

    public Uri e() {
        return this.f37088b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.b(getClass(), obj.getClass())) {
            return false;
        }
        C3609a c3609a = (C3609a) obj;
        return Double.compare(c3609a.f37089c, this.f37089c) == 0 && f() == c3609a.f() && Intrinsics.b(e(), c3609a.e()) && Intrinsics.b(this.f37087a, c3609a.f37087a);
    }

    public boolean f() {
        return this.f37090d;
    }

    public int hashCode() {
        return Objects.hash(e(), this.f37087a, Double.valueOf(this.f37089c), Boolean.valueOf(f()));
    }

    public C3609a(Context context, String str, double d10, double d11) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f37087a = str;
        this.f37088b = b(context);
        this.f37089c = d10 * d11;
    }

    public /* synthetic */ C3609a(Context context, String str, double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? 0.0d : d10, (i10 & 8) != 0 ? 0.0d : d11);
    }
}
