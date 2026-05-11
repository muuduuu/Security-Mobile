package Q2;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: f, reason: collision with root package name */
    public static final a f8095f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f8096a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8097b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8098c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8099d;

    /* renamed from: e, reason: collision with root package name */
    private final String f8100e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final k a(Td.w wVar) {
            List m10 = wVar.m();
            Intrinsics.checkNotNullExpressionValue(m10, "httpUrl.pathSegments()");
            String l02 = CollectionsKt.l0(m10, "/", null, null, 0, null, null, 62, null);
            String u10 = wVar.u();
            Intrinsics.checkNotNullExpressionValue(u10, "httpUrl.scheme()");
            String h10 = wVar.h();
            Intrinsics.checkNotNullExpressionValue(h10, "httpUrl.host()");
            int n10 = wVar.n();
            String m11 = !StringsKt.Z(l02) ? Intrinsics.m("/", l02) : BuildConfig.FLAVOR;
            String o10 = wVar.o();
            return new k(u10, h10, n10, m11, o10 != null ? o10 : BuildConfig.FLAVOR, null);
        }

        private final k b(Td.w wVar) {
            List d10 = wVar.d();
            Intrinsics.checkNotNullExpressionValue(d10, "httpUrl.encodedPathSegments()");
            String l02 = CollectionsKt.l0(d10, "/", null, null, 0, null, null, 62, null);
            String u10 = wVar.u();
            Intrinsics.checkNotNullExpressionValue(u10, "httpUrl.scheme()");
            String h10 = wVar.h();
            Intrinsics.checkNotNullExpressionValue(h10, "httpUrl.host()");
            int n10 = wVar.n();
            String m10 = !StringsKt.Z(l02) ? Intrinsics.m("/", l02) : BuildConfig.FLAVOR;
            String e10 = wVar.e();
            return new k(u10, h10, n10, m10, e10 != null ? e10 : BuildConfig.FLAVOR, null);
        }

        public final k c(Td.w httpUrl, boolean z10) {
            Intrinsics.checkNotNullParameter(httpUrl, "httpUrl");
            return z10 ? b(httpUrl) : a(httpUrl);
        }

        private a() {
        }
    }

    public /* synthetic */ k(String str, String str2, int i10, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i10, str3, str4);
    }

    private final boolean e() {
        if (Intrinsics.b(this.f8096a, "https") && this.f8098c == 443) {
            return false;
        }
        return (Intrinsics.b(this.f8096a, "http") && this.f8098c == 80) ? false : true;
    }

    public final String a() {
        return this.f8097b;
    }

    public final String b() {
        if (StringsKt.Z(this.f8100e)) {
            return this.f8099d;
        }
        return this.f8099d + '?' + this.f8100e;
    }

    public final String c() {
        return this.f8096a;
    }

    public final String d() {
        if (!e()) {
            return this.f8096a + "://" + this.f8097b + b();
        }
        return this.f8096a + "://" + this.f8097b + ':' + this.f8098c + b();
    }

    private k(String str, String str2, int i10, String str3, String str4) {
        this.f8096a = str;
        this.f8097b = str2;
        this.f8098c = i10;
        this.f8099d = str3;
        this.f8100e = str4;
    }
}
