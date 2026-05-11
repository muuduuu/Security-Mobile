package A;

import A.s0;
import android.graphics.Rect;
import android.util.Size;
import org.conscrypt.BuildConfig;

/* renamed from: A.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C0693e extends s0.a {

    /* renamed from: a, reason: collision with root package name */
    private final Size f159a;

    /* renamed from: b, reason: collision with root package name */
    private final Rect f160b;

    /* renamed from: c, reason: collision with root package name */
    private final int f161c;

    /* renamed from: A.e$b */
    static final class b extends s0.a.AbstractC0000a {

        /* renamed from: a, reason: collision with root package name */
        private Size f162a;

        /* renamed from: b, reason: collision with root package name */
        private Rect f163b;

        /* renamed from: c, reason: collision with root package name */
        private Integer f164c;

        b() {
        }

        @Override // A.s0.a.AbstractC0000a
        s0.a a() {
            Size size = this.f162a;
            String str = BuildConfig.FLAVOR;
            if (size == null) {
                str = BuildConfig.FLAVOR + " resolution";
            }
            if (this.f163b == null) {
                str = str + " cropRect";
            }
            if (this.f164c == null) {
                str = str + " rotationDegrees";
            }
            if (str.isEmpty()) {
                return new C0693e(this.f162a, this.f163b, this.f164c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // A.s0.a.AbstractC0000a
        s0.a.AbstractC0000a b(Rect rect) {
            if (rect == null) {
                throw new NullPointerException("Null cropRect");
            }
            this.f163b = rect;
            return this;
        }

        @Override // A.s0.a.AbstractC0000a
        s0.a.AbstractC0000a c(int i10) {
            this.f164c = Integer.valueOf(i10);
            return this;
        }

        s0.a.AbstractC0000a d(Size size) {
            if (size == null) {
                throw new NullPointerException("Null resolution");
            }
            this.f162a = size;
            return this;
        }
    }

    @Override // A.s0.a
    Rect a() {
        return this.f160b;
    }

    @Override // A.s0.a
    Size b() {
        return this.f159a;
    }

    @Override // A.s0.a
    int c() {
        return this.f161c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0.a)) {
            return false;
        }
        s0.a aVar = (s0.a) obj;
        return this.f159a.equals(aVar.b()) && this.f160b.equals(aVar.a()) && this.f161c == aVar.c();
    }

    public int hashCode() {
        return ((((this.f159a.hashCode() ^ 1000003) * 1000003) ^ this.f160b.hashCode()) * 1000003) ^ this.f161c;
    }

    public String toString() {
        return "ResolutionInfoInternal{resolution=" + this.f159a + ", cropRect=" + this.f160b + ", rotationDegrees=" + this.f161c + "}";
    }

    private C0693e(Size size, Rect rect, int i10) {
        this.f159a = size;
        this.f160b = rect;
        this.f161c = i10;
    }
}
