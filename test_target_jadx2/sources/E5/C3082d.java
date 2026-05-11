package e5;

import android.content.Context;
import com.appsflyer.attribution.RequestError;
import com.facebook.react.uimanager.X;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import lc.m;
import org.conscrypt.PSKKeyManager;

/* renamed from: e5.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3082d {

    /* renamed from: a, reason: collision with root package name */
    private X f32215a;

    /* renamed from: b, reason: collision with root package name */
    private X f32216b;

    /* renamed from: c, reason: collision with root package name */
    private X f32217c;

    /* renamed from: d, reason: collision with root package name */
    private X f32218d;

    /* renamed from: e, reason: collision with root package name */
    private X f32219e;

    /* renamed from: f, reason: collision with root package name */
    private X f32220f;

    /* renamed from: g, reason: collision with root package name */
    private X f32221g;

    /* renamed from: h, reason: collision with root package name */
    private X f32222h;

    /* renamed from: i, reason: collision with root package name */
    private X f32223i;

    /* renamed from: j, reason: collision with root package name */
    private X f32224j;

    /* renamed from: k, reason: collision with root package name */
    private X f32225k;

    /* renamed from: l, reason: collision with root package name */
    private X f32226l;

    /* renamed from: m, reason: collision with root package name */
    private X f32227m;

    /* renamed from: e5.d$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32228a;

        static {
            int[] iArr = new int[EnumC3081c.values().length];
            try {
                iArr[EnumC3081c.BORDER_RADIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC3081c.BORDER_TOP_LEFT_RADIUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC3081c.BORDER_TOP_RIGHT_RADIUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC3081c.BORDER_BOTTOM_LEFT_RADIUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC3081c.BORDER_BOTTOM_RIGHT_RADIUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC3081c.BORDER_TOP_START_RADIUS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC3081c.BORDER_TOP_END_RADIUS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[EnumC3081c.BORDER_BOTTOM_START_RADIUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[EnumC3081c.BORDER_BOTTOM_END_RADIUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[EnumC3081c.BORDER_START_START_RADIUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[EnumC3081c.BORDER_START_END_RADIUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[EnumC3081c.BORDER_END_START_RADIUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[EnumC3081c.BORDER_END_END_RADIUS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f32228a = iArr;
        }
    }

    public C3082d() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public final X a(EnumC3081c property) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (a.f32228a[property.ordinal()]) {
            case 1:
                return this.f32215a;
            case 2:
                return this.f32216b;
            case 3:
                return this.f32217c;
            case 4:
                return this.f32218d;
            case 5:
                return this.f32219e;
            case 6:
                return this.f32220f;
            case 7:
                return this.f32221g;
            case 8:
                return this.f32222h;
            case 9:
                return this.f32223i;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                return this.f32224j;
            case 11:
                return this.f32225k;
            case 12:
                return this.f32226l;
            case 13:
                return this.f32227m;
            default:
                throw new m();
        }
    }

    public final boolean b() {
        return (this.f32215a == null && this.f32216b == null && this.f32217c == null && this.f32218d == null && this.f32219e == null && this.f32220f == null && this.f32221g == null && this.f32222h == null && this.f32223i == null && this.f32224j == null && this.f32225k == null && this.f32226l == null && this.f32227m == null) ? false : true;
    }

    public final C3085g c(int i10, Context context, float f10, float f11) {
        C3085g c3085g;
        C3086h c3086h;
        C3086h c3086h2;
        C3086h c3086h3;
        C3086h b10;
        C3086h c3086h4;
        C3086h c3086h5;
        C3086h c3086h6;
        C3086h b11;
        C3086h c3086h7;
        C3086h c3086h8;
        C3086h c3086h9;
        C3086h b12;
        Intrinsics.checkNotNullParameter(context, "context");
        C3086h c3086h10 = new C3086h(0.0f, 0.0f);
        if (i10 == 0) {
            X x10 = this.f32224j;
            if (x10 == null && (x10 = this.f32220f) == null && (x10 = this.f32216b) == null) {
                x10 = this.f32215a;
            }
            if (x10 == null || (c3086h = x10.b(f10, f11)) == null) {
                c3086h = c3086h10;
            }
            X x11 = this.f32226l;
            if (x11 == null && (x11 = this.f32221g) == null && (x11 = this.f32217c) == null) {
                x11 = this.f32215a;
            }
            if (x11 == null || (c3086h2 = x11.b(f10, f11)) == null) {
                c3086h2 = c3086h10;
            }
            X x12 = this.f32225k;
            if (x12 == null && (x12 = this.f32222h) == null && (x12 = this.f32218d) == null) {
                x12 = this.f32215a;
            }
            if (x12 == null || (c3086h3 = x12.b(f10, f11)) == null) {
                c3086h3 = c3086h10;
            }
            X x13 = this.f32227m;
            if (x13 == null && (x13 = this.f32223i) == null && (x13 = this.f32219e) == null) {
                x13 = this.f32215a;
            }
            if (x13 != null && (b10 = x13.b(f10, f11)) != null) {
                c3086h10 = b10;
            }
            c3085g = new C3085g(c3086h, c3086h2, c3086h3, c3086h10);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException("Expected?.resolved layout direction");
            }
            if (com.facebook.react.modules.i18nmanager.a.f21807a.a().d(context)) {
                X x14 = this.f32226l;
                if (x14 == null && (x14 = this.f32221g) == null && (x14 = this.f32217c) == null) {
                    x14 = this.f32215a;
                }
                if (x14 == null || (c3086h7 = x14.b(f10, f11)) == null) {
                    c3086h7 = c3086h10;
                }
                X x15 = this.f32224j;
                if (x15 == null && (x15 = this.f32220f) == null && (x15 = this.f32216b) == null) {
                    x15 = this.f32215a;
                }
                if (x15 == null || (c3086h8 = x15.b(f10, f11)) == null) {
                    c3086h8 = c3086h10;
                }
                X x16 = this.f32227m;
                if (x16 == null && (x16 = this.f32222h) == null && (x16 = this.f32219e) == null) {
                    x16 = this.f32215a;
                }
                if (x16 == null || (c3086h9 = x16.b(f10, f11)) == null) {
                    c3086h9 = c3086h10;
                }
                X x17 = this.f32225k;
                if (x17 == null && (x17 = this.f32223i) == null && (x17 = this.f32218d) == null) {
                    x17 = this.f32215a;
                }
                if (x17 != null && (b12 = x17.b(f10, f11)) != null) {
                    c3086h10 = b12;
                }
                c3085g = new C3085g(c3086h7, c3086h8, c3086h9, c3086h10);
            } else {
                X x18 = this.f32226l;
                if (x18 == null && (x18 = this.f32221g) == null && (x18 = this.f32216b) == null) {
                    x18 = this.f32215a;
                }
                if (x18 == null || (c3086h4 = x18.b(f10, f11)) == null) {
                    c3086h4 = c3086h10;
                }
                X x19 = this.f32224j;
                if (x19 == null && (x19 = this.f32220f) == null && (x19 = this.f32217c) == null) {
                    x19 = this.f32215a;
                }
                if (x19 == null || (c3086h5 = x19.b(f10, f11)) == null) {
                    c3086h5 = c3086h10;
                }
                X x20 = this.f32227m;
                if (x20 == null && (x20 = this.f32222h) == null && (x20 = this.f32218d) == null) {
                    x20 = this.f32215a;
                }
                if (x20 == null || (c3086h6 = x20.b(f10, f11)) == null) {
                    c3086h6 = c3086h10;
                }
                X x21 = this.f32225k;
                if (x21 == null && (x21 = this.f32223i) == null && (x21 = this.f32219e) == null) {
                    x21 = this.f32215a;
                }
                if (x21 != null && (b11 = x21.b(f10, f11)) != null) {
                    c3086h10 = b11;
                }
                c3085g = new C3085g(c3086h4, c3086h5, c3086h6, c3086h10);
            }
        }
        return c3085g;
    }

    public final void d(EnumC3081c property, X x10) {
        Intrinsics.checkNotNullParameter(property, "property");
        switch (a.f32228a[property.ordinal()]) {
            case 1:
                this.f32215a = x10;
                break;
            case 2:
                this.f32216b = x10;
                break;
            case 3:
                this.f32217c = x10;
                break;
            case 4:
                this.f32218d = x10;
                break;
            case 5:
                this.f32219e = x10;
                break;
            case 6:
                this.f32220f = x10;
                break;
            case 7:
                this.f32221g = x10;
                break;
            case 8:
                this.f32222h = x10;
                break;
            case 9:
                this.f32223i = x10;
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
                this.f32224j = x10;
                break;
            case 11:
                this.f32225k = x10;
                break;
            case 12:
                this.f32226l = x10;
                break;
            case 13:
                this.f32227m = x10;
                break;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3082d)) {
            return false;
        }
        C3082d c3082d = (C3082d) obj;
        return Intrinsics.b(this.f32215a, c3082d.f32215a) && Intrinsics.b(this.f32216b, c3082d.f32216b) && Intrinsics.b(this.f32217c, c3082d.f32217c) && Intrinsics.b(this.f32218d, c3082d.f32218d) && Intrinsics.b(this.f32219e, c3082d.f32219e) && Intrinsics.b(this.f32220f, c3082d.f32220f) && Intrinsics.b(this.f32221g, c3082d.f32221g) && Intrinsics.b(this.f32222h, c3082d.f32222h) && Intrinsics.b(this.f32223i, c3082d.f32223i) && Intrinsics.b(this.f32224j, c3082d.f32224j) && Intrinsics.b(this.f32225k, c3082d.f32225k) && Intrinsics.b(this.f32226l, c3082d.f32226l) && Intrinsics.b(this.f32227m, c3082d.f32227m);
    }

    public int hashCode() {
        X x10 = this.f32215a;
        int hashCode = (x10 == null ? 0 : x10.hashCode()) * 31;
        X x11 = this.f32216b;
        int hashCode2 = (hashCode + (x11 == null ? 0 : x11.hashCode())) * 31;
        X x12 = this.f32217c;
        int hashCode3 = (hashCode2 + (x12 == null ? 0 : x12.hashCode())) * 31;
        X x13 = this.f32218d;
        int hashCode4 = (hashCode3 + (x13 == null ? 0 : x13.hashCode())) * 31;
        X x14 = this.f32219e;
        int hashCode5 = (hashCode4 + (x14 == null ? 0 : x14.hashCode())) * 31;
        X x15 = this.f32220f;
        int hashCode6 = (hashCode5 + (x15 == null ? 0 : x15.hashCode())) * 31;
        X x16 = this.f32221g;
        int hashCode7 = (hashCode6 + (x16 == null ? 0 : x16.hashCode())) * 31;
        X x17 = this.f32222h;
        int hashCode8 = (hashCode7 + (x17 == null ? 0 : x17.hashCode())) * 31;
        X x18 = this.f32223i;
        int hashCode9 = (hashCode8 + (x18 == null ? 0 : x18.hashCode())) * 31;
        X x19 = this.f32224j;
        int hashCode10 = (hashCode9 + (x19 == null ? 0 : x19.hashCode())) * 31;
        X x20 = this.f32225k;
        int hashCode11 = (hashCode10 + (x20 == null ? 0 : x20.hashCode())) * 31;
        X x21 = this.f32226l;
        int hashCode12 = (hashCode11 + (x21 == null ? 0 : x21.hashCode())) * 31;
        X x22 = this.f32227m;
        return hashCode12 + (x22 != null ? x22.hashCode() : 0);
    }

    public String toString() {
        return "BorderRadiusStyle(uniform=" + this.f32215a + ", topLeft=" + this.f32216b + ", topRight=" + this.f32217c + ", bottomLeft=" + this.f32218d + ", bottomRight=" + this.f32219e + ", topStart=" + this.f32220f + ", topEnd=" + this.f32221g + ", bottomStart=" + this.f32222h + ", bottomEnd=" + this.f32223i + ", startStart=" + this.f32224j + ", startEnd=" + this.f32225k + ", endStart=" + this.f32226l + ", endEnd=" + this.f32227m + ")";
    }

    public C3082d(X x10, X x11, X x12, X x13, X x14, X x15, X x16, X x17, X x18, X x19, X x20, X x21, X x22) {
        this.f32215a = x10;
        this.f32216b = x11;
        this.f32217c = x12;
        this.f32218d = x13;
        this.f32219e = x14;
        this.f32220f = x15;
        this.f32221g = x16;
        this.f32222h = x17;
        this.f32223i = x18;
        this.f32224j = x19;
        this.f32225k = x20;
        this.f32226l = x21;
        this.f32227m = x22;
    }

    public /* synthetic */ C3082d(X x10, X x11, X x12, X x13, X x14, X x15, X x16, X x17, X x18, X x19, X x20, X x21, X x22, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : x10, (i10 & 2) != 0 ? null : x11, (i10 & 4) != 0 ? null : x12, (i10 & 8) != 0 ? null : x13, (i10 & 16) != 0 ? null : x14, (i10 & 32) != 0 ? null : x15, (i10 & 64) != 0 ? null : x16, (i10 & 128) != 0 ? null : x17, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : x18, (i10 & 512) != 0 ? null : x19, (i10 & 1024) != 0 ? null : x20, (i10 & 2048) != 0 ? null : x21, (i10 & 4096) == 0 ? x22 : null);
    }
}
