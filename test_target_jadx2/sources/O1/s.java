package O1;

import a2.AbstractC1346c;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import pe.InterfaceC3879g;
import pe.M;
import pe.b0;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f6986a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Set f6987b = new HashSet();

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f6988c = {80, 75, 3, 4};

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f6989d = {31, -117, 8};

    public static com.airbnb.lottie.q A(Context context, String str) {
        return B(context, str, "url_" + str);
    }

    public static com.airbnb.lottie.q B(final Context context, final String str, final String str2) {
        return j(str2, new Callable() { // from class: O1.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C Q10;
                Q10 = s.Q(context, str, str2);
                return Q10;
            }
        }, null);
    }

    public static com.airbnb.lottie.q C(final Context context, final ZipInputStream zipInputStream, final String str) {
        return j(str, new Callable() { // from class: O1.n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C E10;
                E10 = s.E(context, zipInputStream, str);
                return E10;
            }
        }, new Runnable() { // from class: O1.o
            @Override // java.lang.Runnable
            public final void run() {
                b2.l.c(zipInputStream);
            }
        });
    }

    public static com.airbnb.lottie.q D(ZipInputStream zipInputStream, String str) {
        return C(null, zipInputStream, str);
    }

    public static C E(Context context, ZipInputStream zipInputStream, String str) {
        return F(context, zipInputStream, str, true);
    }

    public static C F(Context context, ZipInputStream zipInputStream, String str, boolean z10) {
        try {
            return G(context, zipInputStream, str);
        } finally {
            if (z10) {
                b2.l.c(zipInputStream);
            }
        }
    }

    private static C G(Context context, ZipInputStream zipInputStream, String str) {
        C1038i a10;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (str == null) {
            a10 = null;
        } else {
            try {
                a10 = U1.g.b().a(str);
            } catch (IOException e10) {
                return new C((Throwable) e10);
            }
        }
        if (a10 != null) {
            return new C(a10);
        }
        ZipEntry nextEntry = zipInputStream.getNextEntry();
        C1038i c1038i = null;
        while (nextEntry != null) {
            String name = nextEntry.getName();
            if (name.contains("__MACOSX")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().equalsIgnoreCase("manifest.json")) {
                zipInputStream.closeEntry();
            } else if (nextEntry.getName().contains(".json")) {
                c1038i = (C1038i) u(AbstractC1346c.o(M.c(M.k(zipInputStream))), null, false).b();
            } else {
                if (!name.contains(".png") && !name.contains(".webp") && !name.contains(".jpg") && !name.contains(".jpeg")) {
                    if (!name.contains(".ttf") && !name.contains(".otf")) {
                        zipInputStream.closeEntry();
                    }
                    String[] split = name.split("/");
                    String str2 = split[split.length - 1];
                    String str3 = str2.split("\\.")[0];
                    if (context == null) {
                        return new C((Throwable) new IllegalStateException("Unable to extract font " + str3 + " please pass a non-null Context parameter"));
                    }
                    File file = new File(context.getCacheDir(), str2);
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream2.write(bArr, 0, read);
                                }
                                fileOutputStream2.flush();
                                fileOutputStream2.close();
                                fileOutputStream.close();
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream2.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } finally {
                        }
                    } catch (Throwable th3) {
                        b2.f.d("Unable to save font " + str3 + " to the temporary file: " + str2 + ". ", th3);
                    }
                    Typeface createFromFile = Typeface.createFromFile(file);
                    if (!file.delete()) {
                        b2.f.c("Failed to delete temp font file " + file.getAbsolutePath() + ".");
                    }
                    hashMap2.put(str3, createFromFile);
                }
                String[] split2 = name.split("/");
                hashMap.put(split2[split2.length - 1], BitmapFactory.decodeStream(zipInputStream));
            }
            nextEntry = zipInputStream.getNextEntry();
        }
        if (c1038i == null) {
            return new C((Throwable) new IllegalArgumentException("Unable to parse composition"));
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            x k10 = k(c1038i, (String) entry.getKey());
            if (k10 != null) {
                k10.g(b2.l.m((Bitmap) entry.getValue(), k10.f(), k10.d()));
            }
        }
        for (Map.Entry entry2 : hashMap2.entrySet()) {
            boolean z10 = false;
            for (U1.c cVar : c1038i.g().values()) {
                if (cVar.a().equals(entry2.getKey())) {
                    cVar.e((Typeface) entry2.getValue());
                    z10 = true;
                }
            }
            if (!z10) {
                b2.f.c("Parsed font for " + ((String) entry2.getKey()) + " however it was not found in the animation.");
            }
        }
        if (hashMap.isEmpty()) {
            Iterator it = c1038i.j().entrySet().iterator();
            while (it.hasNext()) {
                x xVar = (x) ((Map.Entry) it.next()).getValue();
                if (xVar == null) {
                    return null;
                }
                String c10 = xVar.c();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inScaled = true;
                options.inDensity = 160;
                if (c10.startsWith("data:") && c10.indexOf("base64,") > 0) {
                    try {
                        byte[] decode = Base64.decode(c10.substring(c10.indexOf(44) + 1), 0);
                        xVar.g(b2.l.m(BitmapFactory.decodeByteArray(decode, 0, decode.length, options), xVar.f(), xVar.d()));
                    } catch (IllegalArgumentException e11) {
                        b2.f.d("data URL did not have correct base64 format.", e11);
                        return null;
                    }
                }
            }
        }
        if (str != null) {
            U1.g.b().c(str, c1038i);
        }
        return new C(c1038i);
    }

    private static Boolean H(InterfaceC3879g interfaceC3879g) {
        return T(interfaceC3879g, f6989d);
    }

    private static boolean I(Context context) {
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    private static Boolean J(InterfaceC3879g interfaceC3879g) {
        return T(interfaceC3879g, f6988c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void K(String str, AtomicBoolean atomicBoolean, C1038i c1038i) {
        Map map = f6986a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            U(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(String str, AtomicBoolean atomicBoolean, Throwable th) {
        Map map = f6986a;
        map.remove(str);
        atomicBoolean.set(true);
        if (map.size() == 0) {
            U(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C P(WeakReference weakReference, Context context, int i10, String str) {
        Context context2 = (Context) weakReference.get();
        if (context2 != null) {
            context = context2;
        }
        return z(context, i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C Q(Context context, String str, String str2) {
        C c10 = AbstractC1034e.k(context).c(context, str, str2);
        if (str2 != null && c10.b() != null) {
            U1.g.b().c(str2, (C1038i) c10.b());
        }
        return c10;
    }

    private static Boolean T(InterfaceC3879g interfaceC3879g, byte[] bArr) {
        try {
            InterfaceC3879g peek = interfaceC3879g.peek();
            for (byte b10 : bArr) {
                if (peek.readByte() != b10) {
                    return Boolean.FALSE;
                }
            }
            peek.close();
            return Boolean.TRUE;
        } catch (Exception e10) {
            b2.f.b("Failed to check zip file header", e10);
            return Boolean.FALSE;
        } catch (NoSuchMethodError unused) {
            return Boolean.FALSE;
        }
    }

    private static void U(boolean z10) {
        ArrayList arrayList = new ArrayList(f6987b);
        if (arrayList.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(arrayList.get(0));
        throw null;
    }

    private static String V(Context context, int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("rawRes");
        sb2.append(I(context) ? "_night_" : "_day_");
        sb2.append(i10);
        return sb2.toString();
    }

    private static com.airbnb.lottie.q j(final String str, Callable callable, Runnable runnable) {
        C1038i a10 = str == null ? null : U1.g.b().a(str);
        com.airbnb.lottie.q qVar = a10 != null ? new com.airbnb.lottie.q(a10) : null;
        if (str != null) {
            Map map = f6986a;
            if (map.containsKey(str)) {
                qVar = (com.airbnb.lottie.q) map.get(str);
            }
        }
        if (qVar != null) {
            if (runnable != null) {
                runnable.run();
            }
            return qVar;
        }
        com.airbnb.lottie.q qVar2 = new com.airbnb.lottie.q(callable);
        if (str != null) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            qVar2.d(new y() { // from class: O1.p
                @Override // O1.y
                public final void onResult(Object obj) {
                    s.K(str, atomicBoolean, (C1038i) obj);
                }
            });
            qVar2.c(new y() { // from class: O1.q
                @Override // O1.y
                public final void onResult(Object obj) {
                    s.L(str, atomicBoolean, (Throwable) obj);
                }
            });
            if (!atomicBoolean.get()) {
                Map map2 = f6986a;
                map2.put(str, qVar2);
                if (map2.size() == 1) {
                    U(false);
                }
            }
        }
        return qVar2;
    }

    private static x k(C1038i c1038i, String str) {
        for (x xVar : c1038i.j().values()) {
            if (xVar.c().equals(str)) {
                return xVar;
            }
        }
        return null;
    }

    public static com.airbnb.lottie.q l(Context context, String str) {
        return m(context, str, "asset_" + str);
    }

    public static com.airbnb.lottie.q m(Context context, final String str, final String str2) {
        final Context applicationContext = context.getApplicationContext();
        return j(str2, new Callable() { // from class: O1.m
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C o10;
                o10 = s.o(applicationContext, str, str2);
                return o10;
            }
        }, null);
    }

    public static C n(Context context, String str) {
        return o(context, str, "asset_" + str);
    }

    public static C o(Context context, String str, String str2) {
        C1038i a10 = str2 == null ? null : U1.g.b().a(str2);
        if (a10 != null) {
            return new C(a10);
        }
        try {
            InterfaceC3879g c10 = M.c(M.k(context.getAssets().open(str)));
            return J(c10).booleanValue() ? E(context, new ZipInputStream(c10.a2()), str2) : H(c10).booleanValue() ? q(new GZIPInputStream(c10.a2()), str2) : s(AbstractC1346c.o(c10), str2);
        } catch (IOException e10) {
            return new C((Throwable) e10);
        }
    }

    public static com.airbnb.lottie.q p(final InputStream inputStream, final String str) {
        return j(str, new Callable() { // from class: O1.k
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C q10;
                q10 = s.q(inputStream, str);
                return q10;
            }
        }, new Runnable() { // from class: O1.l
            @Override // java.lang.Runnable
            public final void run() {
                b2.l.c(inputStream);
            }
        });
    }

    public static C q(InputStream inputStream, String str) {
        return r(inputStream, str, true);
    }

    public static C r(InputStream inputStream, String str, boolean z10) {
        return v(M.k(inputStream), str, z10);
    }

    public static C s(AbstractC1346c abstractC1346c, String str) {
        return t(abstractC1346c, str, true);
    }

    public static C t(AbstractC1346c abstractC1346c, String str, boolean z10) {
        return u(abstractC1346c, str, z10);
    }

    private static C u(AbstractC1346c abstractC1346c, String str, boolean z10) {
        C1038i a10;
        try {
            if (str == null) {
                a10 = null;
            } else {
                try {
                    a10 = U1.g.b().a(str);
                } catch (Exception e10) {
                    C c10 = new C((Throwable) e10);
                    if (z10) {
                        b2.l.c(abstractC1346c);
                    }
                    return c10;
                }
            }
            if (a10 != null) {
                C c11 = new C(a10);
                if (z10) {
                    b2.l.c(abstractC1346c);
                }
                return c11;
            }
            C1038i a11 = Z1.w.a(abstractC1346c);
            if (str != null) {
                U1.g.b().c(str, a11);
            }
            C c12 = new C(a11);
            if (z10) {
                b2.l.c(abstractC1346c);
            }
            return c12;
        } catch (Throwable th) {
            if (z10) {
                b2.l.c(abstractC1346c);
            }
            throw th;
        }
    }

    public static C v(b0 b0Var, String str, boolean z10) {
        return u(AbstractC1346c.o(M.c(b0Var)), str, z10);
    }

    public static com.airbnb.lottie.q w(Context context, int i10) {
        return x(context, i10, V(context, i10));
    }

    public static com.airbnb.lottie.q x(Context context, final int i10, final String str) {
        final WeakReference weakReference = new WeakReference(context);
        final Context applicationContext = context.getApplicationContext();
        return j(str, new Callable() { // from class: O1.r
            @Override // java.util.concurrent.Callable
            public final Object call() {
                C P10;
                P10 = s.P(weakReference, applicationContext, i10, str);
                return P10;
            }
        }, null);
    }

    public static C y(Context context, int i10) {
        return z(context, i10, V(context, i10));
    }

    public static C z(Context context, int i10, String str) {
        C1038i a10 = str == null ? null : U1.g.b().a(str);
        if (a10 != null) {
            return new C(a10);
        }
        try {
            InterfaceC3879g c10 = M.c(M.k(context.getResources().openRawResource(i10)));
            if (J(c10).booleanValue()) {
                return E(context, new ZipInputStream(c10.a2()), str);
            }
            if (!H(c10).booleanValue()) {
                return s(AbstractC1346c.o(c10), str);
            }
            try {
                return q(new GZIPInputStream(c10.a2()), str);
            } catch (IOException e10) {
                return new C((Throwable) e10);
            }
        } catch (Resources.NotFoundException e11) {
            return new C((Throwable) e11);
        }
    }
}
