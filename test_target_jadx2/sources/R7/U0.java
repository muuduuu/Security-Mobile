package r7;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import t8.c;

/* loaded from: classes2.dex */
final class U0 implements t8.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f39725f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f39726g;

    /* renamed from: h, reason: collision with root package name */
    private static final t8.c f39727h;

    /* renamed from: i, reason: collision with root package name */
    private static final t8.d f39728i;

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f39729a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f39730b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f39731c;

    /* renamed from: d, reason: collision with root package name */
    private final t8.d f39732d;

    /* renamed from: e, reason: collision with root package name */
    private final Y0 f39733e = new Y0(this);

    static {
        c.b a10 = t8.c.a("key");
        O0 o02 = new O0();
        o02.a(1);
        f39726g = a10.b(o02.b()).a();
        c.b a11 = t8.c.a("value");
        O0 o03 = new O0();
        o03.a(2);
        f39727h = a11.b(o03.b()).a();
        f39728i = new t8.d() { // from class: r7.T0
            @Override // t8.d
            public final void a(Object obj, Object obj2) {
                U0.j((Map.Entry) obj, (t8.e) obj2);
            }
        };
    }

    U0(OutputStream outputStream, Map map, Map map2, t8.d dVar) {
        this.f39729a = outputStream;
        this.f39730b = map;
        this.f39731c = map2;
        this.f39732d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, t8.e eVar) {
        eVar.a(f39726g, entry.getKey());
        eVar.a(f39727h, entry.getValue());
    }

    private static int k(t8.c cVar) {
        S0 s02 = (S0) cVar.c(S0.class);
        if (s02 != null) {
            return s02.zza();
        }
        throw new t8.b("Field has no @Protobuf config");
    }

    private final long l(t8.d dVar, Object obj) {
        P0 p02 = new P0();
        try {
            OutputStream outputStream = this.f39729a;
            this.f39729a = p02;
            try {
                dVar.a(obj, this);
                this.f39729a = outputStream;
                long a10 = p02.a();
                p02.close();
                return a10;
            } catch (Throwable th) {
                this.f39729a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                p02.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static S0 m(t8.c cVar) {
        S0 s02 = (S0) cVar.c(S0.class);
        if (s02 != null) {
            return s02;
        }
        throw new t8.b("Field has no @Protobuf config");
    }

    private final U0 n(t8.d dVar, t8.c cVar, Object obj, boolean z10) {
        long l10 = l(dVar, obj);
        if (z10 && l10 == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(l10);
        dVar.a(obj, this);
        return this;
    }

    private final U0 o(t8.f fVar, t8.c cVar, Object obj, boolean z10) {
        this.f39733e.a(cVar, z10);
        fVar.a(obj, this.f39733e);
        return this;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f39729a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f39729a.write(i10 & 127);
    }

    private final void r(long j10) {
        while (((-128) & j10) != 0) {
            this.f39729a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f39729a.write(((int) j10) & 127);
    }

    @Override // t8.e
    public final t8.e a(t8.c cVar, Object obj) {
        f(cVar, obj, true);
        return this;
    }

    @Override // t8.e
    public final /* synthetic */ t8.e b(t8.c cVar, long j10) {
        h(cVar, j10, true);
        return this;
    }

    final t8.e c(t8.c cVar, double d10, boolean z10) {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        q((k(cVar) << 3) | 1);
        this.f39729a.write(p(8).putDouble(d10).array());
        return this;
    }

    final t8.e d(t8.c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((k(cVar) << 3) | 5);
        this.f39729a.write(p(4).putFloat(f10).array());
        return this;
    }

    @Override // t8.e
    public final /* synthetic */ t8.e e(t8.c cVar, int i10) {
        g(cVar, i10, true);
        return this;
    }

    final t8.e f(t8.c cVar, Object obj, boolean z10) {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z10 && charSequence.length() == 0) {
                return this;
            }
            q((k(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f39725f);
            q(bytes.length);
            this.f39729a.write(bytes);
            return this;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                f(cVar, it.next(), false);
            }
            return this;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                n(f39728i, cVar, (Map.Entry) it2.next(), false);
            }
            return this;
        }
        if (obj instanceof Double) {
            c(cVar, ((Double) obj).doubleValue(), z10);
            return this;
        }
        if (obj instanceof Float) {
            d(cVar, ((Float) obj).floatValue(), z10);
            return this;
        }
        if (obj instanceof Number) {
            h(cVar, ((Number) obj).longValue(), z10);
            return this;
        }
        if (obj instanceof Boolean) {
            g(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z10);
            return this;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z10 && bArr.length == 0) {
                return this;
            }
            q((k(cVar) << 3) | 2);
            q(bArr.length);
            this.f39729a.write(bArr);
            return this;
        }
        t8.d dVar = (t8.d) this.f39730b.get(obj.getClass());
        if (dVar != null) {
            n(dVar, cVar, obj, z10);
            return this;
        }
        t8.f fVar = (t8.f) this.f39731c.get(obj.getClass());
        if (fVar != null) {
            o(fVar, cVar, obj, z10);
            return this;
        }
        if (obj instanceof Q0) {
            g(cVar, ((Q0) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        n(this.f39732d, cVar, obj, z10);
        return this;
    }

    final U0 g(t8.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        S0 m10 = m(cVar);
        R0 r02 = R0.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            q(i10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            q((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 5);
            this.f39729a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    final U0 h(t8.c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        S0 m10 = m(cVar);
        R0 r02 = R0.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            r(j10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            r((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 1);
            this.f39729a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    final U0 i(Object obj) {
        if (obj == null) {
            return this;
        }
        t8.d dVar = (t8.d) this.f39730b.get(obj.getClass());
        if (dVar == null) {
            throw new t8.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
