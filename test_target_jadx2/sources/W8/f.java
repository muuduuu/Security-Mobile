package w8;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import w8.d;

/* loaded from: classes2.dex */
final class f implements t8.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f44342f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f44343g = t8.c.a("key").b(C5044a.b().c(1).a()).a();

    /* renamed from: h, reason: collision with root package name */
    private static final t8.c f44344h = t8.c.a("value").b(C5044a.b().c(2).a()).a();

    /* renamed from: i, reason: collision with root package name */
    private static final t8.d f44345i = new t8.d() { // from class: w8.e
        @Override // t8.d
        public final void a(Object obj, Object obj2) {
            f.t((Map.Entry) obj, (t8.e) obj2);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f44346a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f44347b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f44348c;

    /* renamed from: d, reason: collision with root package name */
    private final t8.d f44349d;

    /* renamed from: e, reason: collision with root package name */
    private final i f44350e = new i(this);

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44351a;

        static {
            int[] iArr = new int[d.a.values().length];
            f44351a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44351a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44351a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, t8.d dVar) {
        this.f44346a = outputStream;
        this.f44347b = map;
        this.f44348c = map2;
        this.f44349d = dVar;
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long n(t8.d dVar, Object obj) {
        C5045b c5045b = new C5045b();
        try {
            OutputStream outputStream = this.f44346a;
            this.f44346a = c5045b;
            try {
                dVar.a(obj, this);
                this.f44346a = outputStream;
                long a10 = c5045b.a();
                c5045b.close();
                return a10;
            } catch (Throwable th) {
                this.f44346a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c5045b.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f o(t8.d dVar, t8.c cVar, Object obj, boolean z10) {
        long n10 = n(dVar, obj);
        if (z10 && n10 == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        v(n10);
        dVar.a(obj, this);
        return this;
    }

    private f p(t8.f fVar, t8.c cVar, Object obj, boolean z10) {
        this.f44350e.b(cVar, z10);
        fVar.a(obj, this.f44350e);
        return this;
    }

    private static d r(t8.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new t8.b("Field has no @Protobuf config");
    }

    private static int s(t8.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new t8.b("Field has no @Protobuf config");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void t(Map.Entry entry, t8.e eVar) {
        eVar.a(f44343g, entry.getKey());
        eVar.a(f44344h, entry.getValue());
    }

    private void u(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f44346a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f44346a.write(i10 & 127);
    }

    private void v(long j10) {
        while (((-128) & j10) != 0) {
            this.f44346a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f44346a.write(((int) j10) & 127);
    }

    @Override // t8.e
    public t8.e a(t8.c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    t8.e d(t8.c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        u((s(cVar) << 3) | 1);
        this.f44346a.write(m(8).putDouble(d10).array());
        return this;
    }

    t8.e f(t8.c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        u((s(cVar) << 3) | 5);
        this.f44346a.write(m(4).putFloat(f10).array());
        return this;
    }

    t8.e g(t8.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            u((s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f44342f);
            u(bytes.length);
            this.f44346a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                g(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                o(f44345i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            return d(cVar, ((Double) obj).doubleValue(), z10);
        }
        if (obj instanceof Float) {
            return f(cVar, ((Float) obj).floatValue(), z10);
        }
        if (obj instanceof Number) {
            return k(cVar, ((Number) obj).longValue(), z10);
        }
        if (obj instanceof Boolean) {
            return l(cVar, ((Boolean) obj).booleanValue(), z10);
        }
        if (!(obj instanceof byte[])) {
            t8.d dVar = (t8.d) this.f44347b.get(obj.getClass());
            if (dVar != null) {
                return o(dVar, cVar, obj, z10);
            }
            t8.f fVar = (t8.f) this.f44348c.get(obj.getClass());
            return fVar != null ? p(fVar, cVar, obj, z10) : obj instanceof InterfaceC5046c ? e(cVar, ((InterfaceC5046c) obj).getNumber()) : obj instanceof Enum ? e(cVar, ((Enum) obj).ordinal()) : o(this.f44349d, cVar, obj, z10);
        }
        byte[] bArr = (byte[]) obj;
        if (z10 && bArr.length == 0) {
            return this;
        }
        u((s(cVar) << 3) | 2);
        u(bArr.length);
        this.f44346a.write(bArr);
        return this;
    }

    @Override // t8.e
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public f e(t8.c cVar, int i10) {
        return i(cVar, i10, true);
    }

    f i(t8.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i11 = a.f44351a[r10.intEncoding().ordinal()];
        if (i11 == 1) {
            u(r10.tag() << 3);
            u(i10);
        } else if (i11 == 2) {
            u(r10.tag() << 3);
            u((i10 << 1) ^ (i10 >> 31));
        } else if (i11 == 3) {
            u((r10.tag() << 3) | 5);
            this.f44346a.write(m(4).putInt(i10).array());
        }
        return this;
    }

    @Override // t8.e
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public f b(t8.c cVar, long j10) {
        return k(cVar, j10, true);
    }

    f k(t8.c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        d r10 = r(cVar);
        int i10 = a.f44351a[r10.intEncoding().ordinal()];
        if (i10 == 1) {
            u(r10.tag() << 3);
            v(j10);
        } else if (i10 == 2) {
            u(r10.tag() << 3);
            v((j10 >> 63) ^ (j10 << 1));
        } else if (i10 == 3) {
            u((r10.tag() << 3) | 1);
            this.f44346a.write(m(8).putLong(j10).array());
        }
        return this;
    }

    f l(t8.c cVar, boolean z10, boolean z11) {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    f q(Object obj) {
        if (obj == null) {
            return this;
        }
        t8.d dVar = (t8.d) this.f44347b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new t8.b("No encoder for " + obj.getClass());
    }
}
