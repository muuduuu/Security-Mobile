package w0;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f44257a;

        /* renamed from: b, reason: collision with root package name */
        private final b[] f44258b;

        public a(int i10, b[] bVarArr) {
            this.f44257a = i10;
            this.f44258b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f44258b;
        }

        public int c() {
            return this.f44257a;
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final Uri f44259a;

        /* renamed from: b, reason: collision with root package name */
        private final int f44260b;

        /* renamed from: c, reason: collision with root package name */
        private final int f44261c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f44262d;

        /* renamed from: e, reason: collision with root package name */
        private final int f44263e;

        public b(Uri uri, int i10, int i11, boolean z10, int i12) {
            this.f44259a = (Uri) y0.f.g(uri);
            this.f44260b = i10;
            this.f44261c = i11;
            this.f44262d = z10;
            this.f44263e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z10, int i12) {
            return new b(uri, i10, i11, z10, i12);
        }

        public int b() {
            return this.f44263e;
        }

        public int c() {
            return this.f44260b;
        }

        public Uri d() {
            return this.f44259a;
        }

        public int e() {
            return this.f44261c;
        }

        public boolean f() {
            return this.f44262d;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return androidx.core.graphics.h.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return AbstractC5018d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z10, int i11, Handler handler, c cVar) {
        C5015a c5015a = new C5015a(cVar, handler);
        return z10 ? f.e(context, eVar, c5015a, i10, i11) : f.d(context, eVar, i10, null, c5015a);
    }
}
