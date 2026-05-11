package ad;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ad.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1378e {

    /* renamed from: e, reason: collision with root package name */
    public static final a f12668e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    private static final C1378e f12669f = new C1378e(null, null, false, false, 8, null);

    /* renamed from: a, reason: collision with root package name */
    private final EnumC1381h f12670a;

    /* renamed from: b, reason: collision with root package name */
    private final EnumC1379f f12671b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f12672c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f12673d;

    /* renamed from: ad.e$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C1378e a() {
            return C1378e.f12669f;
        }

        private a() {
        }
    }

    public C1378e(EnumC1381h enumC1381h, EnumC1379f enumC1379f, boolean z10, boolean z11) {
        this.f12670a = enumC1381h;
        this.f12671b = enumC1379f;
        this.f12672c = z10;
        this.f12673d = z11;
    }

    public final boolean b() {
        return this.f12672c;
    }

    public final EnumC1379f c() {
        return this.f12671b;
    }

    public final EnumC1381h d() {
        return this.f12670a;
    }

    public final boolean e() {
        return this.f12673d;
    }

    public /* synthetic */ C1378e(EnumC1381h enumC1381h, EnumC1379f enumC1379f, boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enumC1381h, enumC1379f, z10, (i10 & 8) != 0 ? false : z11);
    }
}
