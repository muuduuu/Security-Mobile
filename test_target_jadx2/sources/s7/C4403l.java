package s7;

import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import t8.c;

/* renamed from: s7.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C4403l implements t8.e {

    /* renamed from: f, reason: collision with root package name */
    private static final Charset f41300f = Charset.forName("UTF-8");

    /* renamed from: g, reason: collision with root package name */
    private static final t8.c f41301g;

    /* renamed from: h, reason: collision with root package name */
    private static final t8.c f41302h;

    /* renamed from: i, reason: collision with root package name */
    private static final t8.d f41303i;

    /* renamed from: a, reason: collision with root package name */
    private OutputStream f41304a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f41305b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f41306c;

    /* renamed from: d, reason: collision with root package name */
    private final t8.d f41307d;

    /* renamed from: e, reason: collision with root package name */
    private final C4431p f41308e = new C4431p(this);

    static {
        c.b a10 = t8.c.a("key");
        C4361f c4361f = new C4361f();
        c4361f.a(1);
        f41301g = a10.b(c4361f.b()).a();
        c.b a11 = t8.c.a("value");
        C4361f c4361f2 = new C4361f();
        c4361f2.a(2);
        f41302h = a11.b(c4361f2.b()).a();
        f41303i = new t8.d() { // from class: s7.k
            @Override // t8.d
            public final void a(Object obj, Object obj2) {
                C4403l.j((Map.Entry) obj, (t8.e) obj2);
            }
        };
    }

    C4403l(OutputStream outputStream, Map map, Map map2, t8.d dVar) {
        this.f41304a = outputStream;
        this.f41305b = map;
        this.f41306c = map2;
        this.f41307d = dVar;
    }

    static /* synthetic */ void j(Map.Entry entry, t8.e eVar) {
        eVar.a(f41301g, entry.getKey());
        eVar.a(f41302h, entry.getValue());
    }

    private static int k(t8.c cVar) {
        InterfaceC4389j interfaceC4389j = (InterfaceC4389j) cVar.c(InterfaceC4389j.class);
        if (interfaceC4389j != null) {
            return interfaceC4389j.zza();
        }
        throw new t8.b("Field has no @Protobuf config");
    }

    private final long l(t8.d dVar, Object obj) {
        C4368g c4368g = new C4368g();
        try {
            OutputStream outputStream = this.f41304a;
            this.f41304a = c4368g;
            try {
                dVar.a(obj, this);
                this.f41304a = outputStream;
                long a10 = c4368g.a();
                c4368g.close();
                return a10;
            } catch (Throwable th) {
                this.f41304a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                c4368g.close();
            } catch (Throwable th3) {
                try {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                } catch (Exception unused) {
                }
            }
            throw th2;
        }
    }

    private static InterfaceC4389j m(t8.c cVar) {
        InterfaceC4389j interfaceC4389j = (InterfaceC4389j) cVar.c(InterfaceC4389j.class);
        if (interfaceC4389j != null) {
            return interfaceC4389j;
        }
        throw new t8.b("Field has no @Protobuf config");
    }

    private final C4403l n(t8.d dVar, t8.c cVar, Object obj, boolean z10) {
        long l10 = l(dVar, obj);
        if (z10 && l10 == 0) {
            return this;
        }
        q((k(cVar) << 3) | 2);
        r(l10);
        dVar.a(obj, this);
        return this;
    }

    private final C4403l o(t8.f fVar, t8.c cVar, Object obj, boolean z10) {
        this.f41308e.a(cVar, z10);
        fVar.a(obj, this.f41308e);
        return this;
    }

    private static ByteBuffer p(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private final void q(int i10) {
        while ((i10 & (-128)) != 0) {
            this.f41304a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f41304a.write(i10 & 127);
    }

    private final void r(long j10) {
        while (((-128) & j10) != 0) {
            this.f41304a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f41304a.write(((int) j10) & 127);
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
        this.f41304a.write(p(8).putDouble(d10).array());
        return this;
    }

    final t8.e d(t8.c cVar, float f10, boolean z10) {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        q((k(cVar) << 3) | 5);
        this.f41304a.write(p(4).putFloat(f10).array());
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
            byte[] bytes = charSequence.toString().getBytes(f41300f);
            q(bytes.length);
            this.f41304a.write(bytes);
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
                n(f41303i, cVar, (Map.Entry) it2.next(), false);
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
            this.f41304a.write(bArr);
            return this;
        }
        t8.d dVar = (t8.d) this.f41305b.get(obj.getClass());
        if (dVar != null) {
            n(dVar, cVar, obj, z10);
            return this;
        }
        t8.f fVar = (t8.f) this.f41306c.get(obj.getClass());
        if (fVar != null) {
            o(fVar, cVar, obj, z10);
            return this;
        }
        if (obj instanceof InterfaceC4375h) {
            g(cVar, ((InterfaceC4375h) obj).zza(), true);
            return this;
        }
        if (obj instanceof Enum) {
            g(cVar, ((Enum) obj).ordinal(), true);
            return this;
        }
        n(this.f41307d, cVar, obj, z10);
        return this;
    }

    final C4403l g(t8.c cVar, int i10, boolean z10) {
        if (z10 && i10 == 0) {
            return this;
        }
        InterfaceC4389j m10 = m(cVar);
        EnumC4382i enumC4382i = EnumC4382i.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            q(i10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            q((i10 + i10) ^ (i10 >> 31));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 5);
            this.f41304a.write(p(4).putInt(i10).array());
        }
        return this;
    }

    final C4403l h(t8.c cVar, long j10, boolean z10) {
        if (z10 && j10 == 0) {
            return this;
        }
        InterfaceC4389j m10 = m(cVar);
        EnumC4382i enumC4382i = EnumC4382i.DEFAULT;
        int ordinal = m10.zzb().ordinal();
        if (ordinal == 0) {
            q(m10.zza() << 3);
            r(j10);
        } else if (ordinal == 1) {
            q(m10.zza() << 3);
            r((j10 >> 63) ^ (j10 + j10));
        } else if (ordinal == 2) {
            q((m10.zza() << 3) | 1);
            this.f41304a.write(p(8).putLong(j10).array());
        }
        return this;
    }

    final C4403l i(Object obj) {
        if (obj == null) {
            return this;
        }
        t8.d dVar = (t8.d) this.f41305b.get(obj.getClass());
        if (dVar == null) {
            throw new t8.b("No encoder for ".concat(String.valueOf(obj.getClass())));
        }
        dVar.a(obj, this);
        return this;
    }
}
