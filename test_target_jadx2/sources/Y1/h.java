package Y1;

import O1.C;
import O1.C1038i;
import O1.s;
import android.content.Context;
import android.util.Pair;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private final g f11994a;

    /* renamed from: b, reason: collision with root package name */
    private final f f11995b;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11996a;

        static {
            int[] iArr = new int[c.values().length];
            f11996a = iArr;
            try {
                iArr[c.ZIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11996a[c.GZIP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public h(g gVar, f fVar) {
        this.f11994a = gVar;
        this.f11995b = fVar;
    }

    private C1038i a(Context context, String str, String str2) {
        g gVar;
        Pair a10;
        C E10;
        if (str2 == null || (gVar = this.f11994a) == null || (a10 = gVar.a(str)) == null) {
            return null;
        }
        c cVar = (c) a10.first;
        InputStream inputStream = (InputStream) a10.second;
        int i10 = a.f11996a[cVar.ordinal()];
        if (i10 == 1) {
            E10 = s.E(context, new ZipInputStream(inputStream), str2);
        } else if (i10 != 2) {
            E10 = s.q(inputStream, str2);
        } else {
            try {
                E10 = s.q(new GZIPInputStream(inputStream), str2);
            } catch (IOException e10) {
                E10 = new C((Throwable) e10);
            }
        }
        if (E10.b() != null) {
            return (C1038i) E10.b();
        }
        return null;
    }

    private C b(Context context, String str, String str2) {
        b2.f.a("Fetching " + str);
        Closeable closeable = null;
        try {
            try {
                d a10 = this.f11995b.a(str);
                if (!a10.isSuccessful()) {
                    C c10 = new C((Throwable) new IllegalArgumentException(a10.V0()));
                    try {
                        a10.close();
                    } catch (IOException e10) {
                        b2.f.d("LottieFetchResult close failed ", e10);
                    }
                    return c10;
                }
                C e11 = e(context, str, a10.d1(), a10.S0(), str2);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Completed fetch from network. Success: ");
                sb2.append(e11.b() != null);
                b2.f.a(sb2.toString());
                try {
                    a10.close();
                } catch (IOException e12) {
                    b2.f.d("LottieFetchResult close failed ", e12);
                }
                return e11;
            } catch (Exception e13) {
                C c11 = new C((Throwable) e13);
                if (0 != 0) {
                    try {
                        closeable.close();
                    } catch (IOException e14) {
                        b2.f.d("LottieFetchResult close failed ", e14);
                    }
                }
                return c11;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    closeable.close();
                } catch (IOException e15) {
                    b2.f.d("LottieFetchResult close failed ", e15);
                }
            }
            throw th;
        }
    }

    private C d(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f11994a) == null) ? s.q(new GZIPInputStream(inputStream), null) : s.q(new GZIPInputStream(new FileInputStream(gVar.g(str, inputStream, c.GZIP))), str);
    }

    private C e(Context context, String str, InputStream inputStream, String str2, String str3) {
        C g10;
        c cVar;
        g gVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            b2.f.a("Handling zip response.");
            c cVar2 = c.ZIP;
            g10 = g(context, str, inputStream, str3);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            b2.f.a("Handling gzip response.");
            cVar = c.GZIP;
            g10 = d(str, inputStream, str3);
        } else {
            b2.f.a("Received json response.");
            cVar = c.JSON;
            g10 = f(str, inputStream, str3);
        }
        if (str3 != null && g10.b() != null && (gVar = this.f11994a) != null) {
            gVar.f(str, cVar);
        }
        return g10;
    }

    private C f(String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f11994a) == null) ? s.q(inputStream, null) : s.q(new FileInputStream(gVar.g(str, inputStream, c.JSON).getAbsolutePath()), str);
    }

    private C g(Context context, String str, InputStream inputStream, String str2) {
        g gVar;
        return (str2 == null || (gVar = this.f11994a) == null) ? s.E(context, new ZipInputStream(inputStream), null) : s.E(context, new ZipInputStream(new FileInputStream(gVar.g(str, inputStream, c.ZIP))), str);
    }

    public C c(Context context, String str, String str2) {
        C1038i a10 = a(context, str, str2);
        if (a10 != null) {
            return new C(a10);
        }
        b2.f.a("Animation for " + str + " not found in cache. Fetching from network.");
        return b(context, str, str2);
    }
}
