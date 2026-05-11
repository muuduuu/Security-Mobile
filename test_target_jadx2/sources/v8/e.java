package v8;

import android.util.Base64;
import android.util.JsonWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import t8.f;
import t8.g;

/* loaded from: classes2.dex */
final class e implements t8.e, g {

    /* renamed from: a, reason: collision with root package name */
    private e f44008a = null;

    /* renamed from: b, reason: collision with root package name */
    private boolean f44009b = true;

    /* renamed from: c, reason: collision with root package name */
    private final JsonWriter f44010c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f44011d;

    /* renamed from: e, reason: collision with root package name */
    private final Map f44012e;

    /* renamed from: f, reason: collision with root package name */
    private final t8.d f44013f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f44014g;

    e(Writer writer, Map map, Map map2, t8.d dVar, boolean z10) {
        this.f44010c = new JsonWriter(writer);
        this.f44011d = map;
        this.f44012e = map2;
        this.f44013f = dVar;
        this.f44014g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) {
        t();
        this.f44010c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f44010c.nullValue();
        return this;
    }

    private e s(String str, Object obj) {
        if (obj == null) {
            return this;
        }
        t();
        this.f44010c.name(str);
        return h(obj, false);
    }

    private void t() {
        if (!this.f44009b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f44008a;
        if (eVar != null) {
            eVar.t();
            this.f44008a.f44009b = false;
            this.f44008a = null;
            this.f44010c.endObject();
        }
    }

    @Override // t8.e
    public t8.e a(t8.c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    @Override // t8.e
    public t8.e b(t8.c cVar, long j10) {
        return k(cVar.b(), j10);
    }

    @Override // t8.e
    public t8.e e(t8.c cVar, int i10) {
        return j(cVar.b(), i10);
    }

    public e f(int i10) {
        t();
        this.f44010c.value(i10);
        return this;
    }

    public e g(long j10) {
        t();
        this.f44010c.value(j10);
        return this;
    }

    e h(Object obj, boolean z10) {
        if (z10 && o(obj)) {
            throw new t8.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f44010c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f44010c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f44010c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next(), false);
                }
                this.f44010c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f44010c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new t8.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f44010c.endObject();
                return this;
            }
            t8.d dVar = (t8.d) this.f44011d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f fVar = (f) this.f44012e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return q(this.f44013f, obj, z10);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return n((byte[]) obj);
        }
        this.f44010c.beginArray();
        if (obj instanceof int[]) {
            int length = ((int[]) obj).length;
            while (i10 < length) {
                this.f44010c.value(r6[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                g(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f44010c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f44010c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                h(obj2, false);
            }
        }
        this.f44010c.endArray();
        return this;
    }

    @Override // t8.g
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public e c(String str) {
        t();
        this.f44010c.value(str);
        return this;
    }

    public e j(String str, int i10) {
        t();
        this.f44010c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) {
        t();
        this.f44010c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) {
        return this.f44014g ? s(str, obj) : r(str, obj);
    }

    @Override // t8.g
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public e d(boolean z10) {
        t();
        this.f44010c.value(z10);
        return this;
    }

    public e n(byte[] bArr) {
        t();
        if (bArr == null) {
            this.f44010c.nullValue();
        } else {
            this.f44010c.value(Base64.encodeToString(bArr, 2));
        }
        return this;
    }

    void p() {
        t();
        this.f44010c.flush();
    }

    e q(t8.d dVar, Object obj, boolean z10) {
        if (!z10) {
            this.f44010c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f44010c.endObject();
        }
        return this;
    }
}
