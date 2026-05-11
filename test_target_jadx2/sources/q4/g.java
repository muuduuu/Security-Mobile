package q4;

import c3.AbstractC1721a;
import java.io.InputStream;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f38759a = new g();

    /* renamed from: b, reason: collision with root package name */
    private static final Class f38760b = g.class;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f38761a;

        /* renamed from: b, reason: collision with root package name */
        private int f38762b;

        /* renamed from: c, reason: collision with root package name */
        private int f38763c;

        public final int a() {
            return this.f38762b;
        }

        public final int b() {
            return this.f38763c;
        }

        public final boolean c() {
            return this.f38761a;
        }

        public final void d(int i10) {
            this.f38762b = i10;
        }

        public final void e(int i10) {
            this.f38763c = i10;
        }

        public final void f(boolean z10) {
            this.f38761a = z10;
        }
    }

    private g() {
    }

    public static final int a(int i10) {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        if (i10 == 3) {
            return 180;
        }
        if (i10 != 6) {
            return i10 != 8 ? 0 : 270;
        }
        return 90;
    }

    private final int b(InputStream inputStream, int i10, boolean z10) {
        if (i10 >= 10 && f.a(inputStream, 2, z10) == 3 && f.a(inputStream, 4, z10) == 1) {
            return f.a(inputStream, 2, z10);
        }
        return 0;
    }

    private final int c(InputStream inputStream, int i10, boolean z10, int i11) {
        if (i10 < 14) {
            return 0;
        }
        int a10 = f.a(inputStream, 2, z10);
        int i12 = i10 - 2;
        while (true) {
            int i13 = a10 - 1;
            if (a10 <= 0 || i12 < 12) {
                break;
            }
            int i14 = i12 - 2;
            if (f.a(inputStream, 2, z10) == i11) {
                return i14;
            }
            inputStream.skip(10L);
            i12 -= 12;
            a10 = i13;
        }
        return 0;
    }

    public static final int d(InputStream stream, int i10) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        a aVar = new a();
        g gVar = f38759a;
        int e10 = gVar.e(stream, i10, aVar);
        int b10 = aVar.b() - 8;
        if (e10 == 0 || b10 > e10) {
            return 0;
        }
        stream.skip(b10);
        return gVar.b(stream, gVar.c(stream, e10 - b10, aVar.c(), 274), aVar.c());
    }

    private final int e(InputStream inputStream, int i10, a aVar) {
        if (i10 <= 8) {
            return 0;
        }
        aVar.d(f.a(inputStream, 4, false));
        if (aVar.a() != 1229531648 && aVar.a() != 1296891946) {
            AbstractC1721a.i(f38760b, "Invalid TIFF header");
            return 0;
        }
        aVar.f(aVar.a() == 1229531648);
        aVar.e(f.a(inputStream, 4, aVar.c()));
        int i11 = i10 - 8;
        if (aVar.b() >= 8 && aVar.b() - 8 <= i11) {
            return i11;
        }
        AbstractC1721a.i(f38760b, "Invalid offset");
        return 0;
    }
}
