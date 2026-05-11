package pe;

import java.util.Arrays;
import kotlin.collections.AbstractC3574i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class W {

    /* renamed from: h, reason: collision with root package name */
    public static final a f38628h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f38629a;

    /* renamed from: b, reason: collision with root package name */
    public int f38630b;

    /* renamed from: c, reason: collision with root package name */
    public int f38631c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f38632d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f38633e;

    /* renamed from: f, reason: collision with root package name */
    public W f38634f;

    /* renamed from: g, reason: collision with root package name */
    public W f38635g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public W() {
        this.f38629a = new byte[8192];
        this.f38633e = true;
        this.f38632d = false;
    }

    public final void a() {
        int i10;
        W w10 = this.f38635g;
        if (w10 == this) {
            throw new IllegalStateException("cannot compact");
        }
        Intrinsics.d(w10);
        if (w10.f38633e) {
            int i11 = this.f38631c - this.f38630b;
            W w11 = this.f38635g;
            Intrinsics.d(w11);
            int i12 = 8192 - w11.f38631c;
            W w12 = this.f38635g;
            Intrinsics.d(w12);
            if (w12.f38632d) {
                i10 = 0;
            } else {
                W w13 = this.f38635g;
                Intrinsics.d(w13);
                i10 = w13.f38630b;
            }
            if (i11 > i12 + i10) {
                return;
            }
            W w14 = this.f38635g;
            Intrinsics.d(w14);
            g(w14, i11);
            b();
            X.b(this);
        }
    }

    public final W b() {
        W w10 = this.f38634f;
        if (w10 == this) {
            w10 = null;
        }
        W w11 = this.f38635g;
        Intrinsics.d(w11);
        w11.f38634f = this.f38634f;
        W w12 = this.f38634f;
        Intrinsics.d(w12);
        w12.f38635g = this.f38635g;
        this.f38634f = null;
        this.f38635g = null;
        return w10;
    }

    public final W c(W segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f38635g = this;
        segment.f38634f = this.f38634f;
        W w10 = this.f38634f;
        Intrinsics.d(w10);
        w10.f38635g = segment;
        this.f38634f = segment;
        return segment;
    }

    public final W d() {
        this.f38632d = true;
        return new W(this.f38629a, this.f38630b, this.f38631c, true, false);
    }

    public final W e(int i10) {
        W c10;
        if (i10 <= 0 || i10 > this.f38631c - this.f38630b) {
            throw new IllegalArgumentException("byteCount out of range");
        }
        if (i10 >= 1024) {
            c10 = d();
        } else {
            c10 = X.c();
            byte[] bArr = this.f38629a;
            byte[] bArr2 = c10.f38629a;
            int i11 = this.f38630b;
            AbstractC3574i.i(bArr, bArr2, 0, i11, i11 + i10, 2, null);
        }
        c10.f38631c = c10.f38630b + i10;
        this.f38630b += i10;
        W w10 = this.f38635g;
        Intrinsics.d(w10);
        w10.c(c10);
        return c10;
    }

    public final W f() {
        byte[] bArr = this.f38629a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return new W(copyOf, this.f38630b, this.f38631c, false, true);
    }

    public final void g(W sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (!sink.f38633e) {
            throw new IllegalStateException("only owner can write");
        }
        int i11 = sink.f38631c;
        if (i11 + i10 > 8192) {
            if (sink.f38632d) {
                throw new IllegalArgumentException();
            }
            int i12 = sink.f38630b;
            if ((i11 + i10) - i12 > 8192) {
                throw new IllegalArgumentException();
            }
            byte[] bArr = sink.f38629a;
            AbstractC3574i.i(bArr, bArr, 0, i12, i11, 2, null);
            sink.f38631c -= sink.f38630b;
            sink.f38630b = 0;
        }
        byte[] bArr2 = this.f38629a;
        byte[] bArr3 = sink.f38629a;
        int i13 = sink.f38631c;
        int i14 = this.f38630b;
        AbstractC3574i.e(bArr2, bArr3, i13, i14, i14 + i10);
        sink.f38631c += i10;
        this.f38630b += i10;
    }

    public W(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f38629a = data;
        this.f38630b = i10;
        this.f38631c = i11;
        this.f38632d = z10;
        this.f38633e = z11;
    }
}
