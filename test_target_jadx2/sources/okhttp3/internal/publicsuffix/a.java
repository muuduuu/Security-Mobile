package okhttp3.internal.publicsuffix;

import Wd.m;
import ge.n;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.IDN;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.j;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.conscrypt.BuildConfig;
import pe.AbstractC3884l;
import pe.InterfaceC3879g;
import pe.M;
import pe.S;
import pe.r;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: g, reason: collision with root package name */
    public static final C0584a f38054g = new C0584a(null);

    /* renamed from: h, reason: collision with root package name */
    public static final S f38055h = S.a.e(S.f38611b, "/okhttp3/internal/publicsuffix/" + a.class.getSimpleName() + ".gz", false, 1, null);

    /* renamed from: i, reason: collision with root package name */
    private static final byte[] f38056i = {42};

    /* renamed from: j, reason: collision with root package name */
    private static final List f38057j = CollectionsKt.e("*");

    /* renamed from: k, reason: collision with root package name */
    private static final a f38058k = new a(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);

    /* renamed from: a, reason: collision with root package name */
    private final S f38059a;

    /* renamed from: b, reason: collision with root package name */
    private final AbstractC3884l f38060b;

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f38061c;

    /* renamed from: d, reason: collision with root package name */
    private final CountDownLatch f38062d;

    /* renamed from: e, reason: collision with root package name */
    private byte[] f38063e;

    /* renamed from: f, reason: collision with root package name */
    private byte[] f38064f;

    /* renamed from: okhttp3.internal.publicsuffix.a$a, reason: collision with other inner class name */
    public static final class C0584a {
        public /* synthetic */ C0584a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(byte[] bArr, byte[][] bArr2, int i10) {
            int i11;
            int b10;
            boolean z10;
            int b11;
            int length = bArr.length;
            int i12 = 0;
            while (i12 < length) {
                int i13 = (i12 + length) / 2;
                while (i13 > -1 && bArr[i13] != 10) {
                    i13--;
                }
                int i14 = i13 + 1;
                int i15 = 1;
                while (true) {
                    i11 = i14 + i15;
                    if (bArr[i11] == 10) {
                        break;
                    }
                    i15++;
                }
                int i16 = i11 - i14;
                int i17 = i10;
                boolean z11 = false;
                int i18 = 0;
                int i19 = 0;
                while (true) {
                    if (z11) {
                        b10 = 46;
                        z10 = false;
                    } else {
                        boolean z12 = z11;
                        b10 = m.b(bArr2[i17][i18], 255);
                        z10 = z12;
                    }
                    b11 = b10 - m.b(bArr[i14 + i19], 255);
                    if (b11 != 0) {
                        break;
                    }
                    i19++;
                    i18++;
                    if (i19 == i16) {
                        break;
                    }
                    if (bArr2[i17].length != i18) {
                        z11 = z10;
                    } else {
                        if (i17 == bArr2.length - 1) {
                            break;
                        }
                        i17++;
                        z11 = true;
                        i18 = -1;
                    }
                }
                if (b11 >= 0) {
                    if (b11 <= 0) {
                        int i20 = i16 - i19;
                        int length2 = bArr2[i17].length - i18;
                        int length3 = bArr2.length;
                        for (int i21 = i17 + 1; i21 < length3; i21++) {
                            length2 += bArr2[i21].length;
                        }
                        if (length2 >= i20) {
                            if (length2 <= i20) {
                                return new String(bArr, i14, i16, Charsets.UTF_8);
                            }
                        }
                    }
                    i12 = i11 + 1;
                }
                length = i13;
            }
            return null;
        }

        public final a c() {
            return a.f38058k;
        }

        private C0584a() {
        }
    }

    public a(S path, AbstractC3884l fileSystem) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(fileSystem, "fileSystem");
        this.f38059a = path;
        this.f38060b = fileSystem;
        this.f38061c = new AtomicBoolean(false);
        this.f38062d = new CountDownLatch(1);
    }

    private final List b(List list) {
        String str;
        String str2;
        String str3;
        List j10;
        List j11;
        if (this.f38061c.get() || !this.f38061c.compareAndSet(false, true)) {
            try {
                this.f38062d.await();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } else {
            e();
        }
        if (this.f38063e == null) {
            throw new IllegalStateException(("Unable to load " + f38055h + " resource from the classpath.").toString());
        }
        int size = list.size();
        byte[][] bArr = new byte[size][];
        for (int i10 = 0; i10 < size; i10++) {
            byte[] bytes = ((String) list.get(i10)).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            bArr[i10] = bytes;
        }
        int i11 = 0;
        while (true) {
            str = null;
            if (i11 >= size) {
                str2 = null;
                break;
            }
            C0584a c0584a = f38054g;
            byte[] bArr2 = this.f38063e;
            if (bArr2 == null) {
                Intrinsics.v("publicSuffixListBytes");
                bArr2 = null;
            }
            str2 = c0584a.b(bArr2, bArr, i11);
            if (str2 != null) {
                break;
            }
            i11++;
        }
        if (size > 1) {
            byte[][] bArr3 = (byte[][]) bArr.clone();
            int length = bArr3.length - 1;
            for (int i12 = 0; i12 < length; i12++) {
                bArr3[i12] = f38056i;
                C0584a c0584a2 = f38054g;
                byte[] bArr4 = this.f38063e;
                if (bArr4 == null) {
                    Intrinsics.v("publicSuffixListBytes");
                    bArr4 = null;
                }
                String b10 = c0584a2.b(bArr4, bArr3, i12);
                if (b10 != null) {
                    str3 = b10;
                    break;
                }
            }
        }
        str3 = null;
        if (str3 != null) {
            int i13 = size - 1;
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    break;
                }
                C0584a c0584a3 = f38054g;
                byte[] bArr5 = this.f38064f;
                if (bArr5 == null) {
                    Intrinsics.v("publicSuffixExceptionListBytes");
                    bArr5 = null;
                }
                String b11 = c0584a3.b(bArr5, bArr, i14);
                if (b11 != null) {
                    str = b11;
                    break;
                }
                i14++;
            }
        }
        if (str != null) {
            return StringsKt.x0('!' + str, new char[]{'.'}, false, 0, 6, null);
        }
        if (str2 == null && str3 == null) {
            return f38057j;
        }
        if (str2 == null || (j10 = StringsKt.x0(str2, new char[]{'.'}, false, 0, 6, null)) == null) {
            j10 = CollectionsKt.j();
        }
        if (str3 == null || (j11 = StringsKt.x0(str3, new char[]{'.'}, false, 0, 6, null)) == null) {
            j11 = CollectionsKt.j();
        }
        return j10.size() > j11.size() ? j10 : j11;
    }

    private final void d() {
        try {
            InterfaceC3879g c10 = M.c(new r(this.f38060b.q(this.f38059a)));
            try {
                byte[] B12 = c10.B1(c10.readInt());
                byte[] B13 = c10.B1(c10.readInt());
                Unit unit = Unit.f36324a;
                c.a(c10, null);
                synchronized (this) {
                    Intrinsics.d(B12);
                    this.f38063e = B12;
                    Intrinsics.d(B13);
                    this.f38064f = B13;
                }
            } finally {
            }
        } finally {
            this.f38062d.countDown();
        }
    }

    private final void e() {
        boolean z10 = false;
        while (true) {
            try {
                try {
                    d();
                    break;
                } catch (InterruptedIOException unused) {
                    Thread.interrupted();
                    z10 = true;
                } catch (IOException e10) {
                    n.f33789a.g().k("Failed to read public suffix list", 5, e10);
                    if (z10) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private final List f(String str) {
        List x02 = StringsKt.x0(str, new char[]{'.'}, false, 0, 6, null);
        return Intrinsics.b(CollectionsKt.n0(x02), BuildConfig.FLAVOR) ? CollectionsKt.Y(x02, 1) : x02;
    }

    public final String c(String domain) {
        int size;
        int size2;
        Intrinsics.checkNotNullParameter(domain, "domain");
        String unicode = IDN.toUnicode(domain);
        Intrinsics.d(unicode);
        List f10 = f(unicode);
        List b10 = b(f10);
        if (f10.size() == b10.size() && ((String) b10.get(0)).charAt(0) != '!') {
            return null;
        }
        if (((String) b10.get(0)).charAt(0) == '!') {
            size = f10.size();
            size2 = b10.size();
        } else {
            size = f10.size();
            size2 = b10.size() + 1;
        }
        return j.u(j.m(CollectionsKt.T(f(domain)), size - size2), ".", null, null, 0, null, null, 62, null);
    }

    public /* synthetic */ a(S s10, AbstractC3884l abstractC3884l, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? f38055h : s10, (i10 & 2) != 0 ? AbstractC3884l.f38709d : abstractC3884l);
    }
}
