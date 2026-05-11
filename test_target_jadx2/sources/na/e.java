package Na;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final List f6612a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6613b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6614c;

    /* renamed from: d, reason: collision with root package name */
    private final String f6615d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f6616e;

    public e(List headers, int i10, String statusText, String url, boolean z10) {
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(statusText, "statusText");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f6612a = headers;
        this.f6613b = i10;
        this.f6614c = statusText;
        this.f6615d = url;
        this.f6616e = z10;
    }

    public final List a() {
        return this.f6612a;
    }

    public final boolean b() {
        return this.f6616e;
    }

    public final int c() {
        return this.f6613b;
    }

    public final String d() {
        return this.f6614c;
    }

    public final String e() {
        return this.f6615d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.b(this.f6612a, eVar.f6612a) && this.f6613b == eVar.f6613b && Intrinsics.b(this.f6614c, eVar.f6614c) && Intrinsics.b(this.f6615d, eVar.f6615d) && this.f6616e == eVar.f6616e;
    }

    public int hashCode() {
        return (((((((this.f6612a.hashCode() * 31) + Integer.hashCode(this.f6613b)) * 31) + this.f6614c.hashCode()) * 31) + this.f6615d.hashCode()) * 31) + Boolean.hashCode(this.f6616e);
    }

    public String toString() {
        return "NativeResponseInit(headers=" + this.f6612a + ", status=" + this.f6613b + ", statusText=" + this.f6614c + ", url=" + this.f6615d + ", redirected=" + this.f6616e + ")";
    }
}
