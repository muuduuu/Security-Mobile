package v9;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f44059a;

    /* renamed from: b, reason: collision with root package name */
    private final String f44060b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f44061a;

        /* renamed from: b, reason: collision with root package name */
        private final String f44062b;

        public a(String apiKey, String apiEndPointUrl) {
            Intrinsics.checkNotNullParameter(apiKey, "apiKey");
            Intrinsics.checkNotNullParameter(apiEndPointUrl, "apiEndPointUrl");
            this.f44061a = apiKey;
            this.f44062b = apiEndPointUrl;
        }

        public final h a() {
            return new h(this.f44061a, this.f44062b, null);
        }
    }

    public /* synthetic */ h(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }

    public final String a() {
        return this.f44060b;
    }

    public final String b() {
        return this.f44059a;
    }

    private h(String str, String str2) {
        this.f44059a = str;
        this.f44060b = str2;
    }
}
