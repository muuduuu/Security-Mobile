package Q6;

import S6.a;
import S6.l;
import V6.AbstractC1287s;
import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.util.i;
import com.google.android.gms.internal.clearcut.AbstractC2111b;
import com.google.android.gms.internal.clearcut.E1;
import com.google.android.gms.internal.clearcut.L0;
import com.google.android.gms.internal.clearcut.M1;
import com.google.android.gms.internal.clearcut.V1;
import com.google.android.gms.internal.clearcut.X1;
import java.util.ArrayList;
import java.util.TimeZone;
import z7.C5262a;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: n, reason: collision with root package name */
    private static final a.g f8234n;

    /* renamed from: o, reason: collision with root package name */
    private static final a.AbstractC0172a f8235o;

    /* renamed from: p, reason: collision with root package name */
    public static final S6.a f8236p;

    /* renamed from: q, reason: collision with root package name */
    private static final C5262a[] f8237q;

    /* renamed from: r, reason: collision with root package name */
    private static final String[] f8238r;

    /* renamed from: s, reason: collision with root package name */
    private static final byte[][] f8239s;

    /* renamed from: a, reason: collision with root package name */
    private final Context f8240a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8241b;

    /* renamed from: c, reason: collision with root package name */
    private final int f8242c;

    /* renamed from: d, reason: collision with root package name */
    private String f8243d;

    /* renamed from: e, reason: collision with root package name */
    private int f8244e;

    /* renamed from: f, reason: collision with root package name */
    private String f8245f;

    /* renamed from: g, reason: collision with root package name */
    private String f8246g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8247h;

    /* renamed from: i, reason: collision with root package name */
    private E1 f8248i;

    /* renamed from: j, reason: collision with root package name */
    private final Q6.c f8249j;

    /* renamed from: k, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f8250k;

    /* renamed from: l, reason: collision with root package name */
    private d f8251l;

    /* renamed from: m, reason: collision with root package name */
    private final b f8252m;

    /* renamed from: Q6.a$a, reason: collision with other inner class name */
    public class C0156a {

        /* renamed from: a, reason: collision with root package name */
        private int f8253a;

        /* renamed from: b, reason: collision with root package name */
        private String f8254b;

        /* renamed from: c, reason: collision with root package name */
        private String f8255c;

        /* renamed from: d, reason: collision with root package name */
        private String f8256d;

        /* renamed from: e, reason: collision with root package name */
        private E1 f8257e;

        /* renamed from: f, reason: collision with root package name */
        private ArrayList f8258f;

        /* renamed from: g, reason: collision with root package name */
        private ArrayList f8259g;

        /* renamed from: h, reason: collision with root package name */
        private ArrayList f8260h;

        /* renamed from: i, reason: collision with root package name */
        private ArrayList f8261i;

        /* renamed from: j, reason: collision with root package name */
        private ArrayList f8262j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f8263k;

        /* renamed from: l, reason: collision with root package name */
        private final M1 f8264l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f8265m;

        private C0156a(a aVar, byte[] bArr) {
            this(bArr, (c) null);
        }

        public void a() {
            if (this.f8265m) {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            this.f8265m = true;
            f fVar = new f(new X1(a.this.f8241b, a.this.f8242c, this.f8253a, this.f8254b, this.f8255c, this.f8256d, a.this.f8247h, this.f8257e), this.f8264l, null, null, a.f(null), null, a.f(null), null, null, this.f8263k);
            if (a.this.f8252m.a(fVar)) {
                a.this.f8249j.d(fVar);
            } else {
                l.c(Status.f23339f, null);
            }
        }

        public C0156a b(int i10) {
            this.f8264l.f23871f = i10;
            return this;
        }

        private C0156a(byte[] bArr, c cVar) {
            this.f8253a = a.this.f8244e;
            this.f8254b = a.this.f8243d;
            this.f8255c = a.this.f8245f;
            this.f8256d = null;
            this.f8257e = a.this.f8248i;
            this.f8258f = null;
            this.f8259g = null;
            this.f8260h = null;
            this.f8261i = null;
            this.f8262j = null;
            this.f8263k = true;
            M1 m12 = new M1();
            this.f8264l = m12;
            this.f8265m = false;
            this.f8255c = a.this.f8245f;
            this.f8256d = null;
            m12.f23889x = AbstractC2111b.a(a.this.f8240a);
            m12.f23867b = a.this.f8250k.a();
            m12.f23868c = a.this.f8250k.c();
            d unused = a.this.f8251l;
            m12.f23882q = TimeZone.getDefault().getOffset(m12.f23867b) / 1000;
            if (bArr != null) {
                m12.f23878m = bArr;
            }
        }

        /* synthetic */ C0156a(a aVar, byte[] bArr, Q6.b bVar) {
            this(aVar, bArr);
        }
    }

    public interface b {
        boolean a(f fVar);
    }

    public interface c {
    }

    public static class d {
    }

    static {
        a.g gVar = new a.g();
        f8234n = gVar;
        Q6.b bVar = new Q6.b();
        f8235o = bVar;
        f8236p = new S6.a("ClearcutLogger.API", bVar, gVar);
        f8237q = new C5262a[0];
        f8238r = new String[0];
        f8239s = new byte[0][];
    }

    private a(Context context, int i10, String str, String str2, String str3, boolean z10, Q6.c cVar, com.google.android.gms.common.util.f fVar, d dVar, b bVar) {
        this.f8244e = -1;
        E1 e12 = E1.DEFAULT;
        this.f8248i = e12;
        this.f8240a = context;
        this.f8241b = context.getPackageName();
        this.f8242c = c(context);
        this.f8244e = -1;
        this.f8243d = str;
        this.f8245f = str2;
        this.f8246g = null;
        this.f8247h = z10;
        this.f8249j = cVar;
        this.f8250k = fVar;
        this.f8251l = new d();
        this.f8248i = e12;
        this.f8252m = bVar;
        if (z10) {
            AbstractC1287s.b(str2 == null, "can't be anonymous with an upload account");
        }
    }

    private static int c(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.wtf("ClearcutLogger", "This can't happen.", e10);
            return 0;
        }
    }

    private static int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            iArr[i11] = ((Integer) obj).intValue();
            i11++;
        }
        return iArr;
    }

    static /* synthetic */ int[] f(ArrayList arrayList) {
        return d(null);
    }

    public final C0156a a(byte[] bArr) {
        return new C0156a(this, bArr, (Q6.b) null);
    }

    public a(Context context, String str, String str2) {
        this(context, -1, str, str2, null, false, L0.M(context), i.d(), null, new V1(context));
    }
}
