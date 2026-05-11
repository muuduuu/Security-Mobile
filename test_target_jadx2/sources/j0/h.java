package j0;

import java.util.LinkedHashMap;
import java.util.Map;
import k0.C3527b;
import k0.C3528c;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private int f35693a;

    /* renamed from: b, reason: collision with root package name */
    private final C3528c f35694b;

    /* renamed from: c, reason: collision with root package name */
    private final C3527b f35695c;

    /* renamed from: d, reason: collision with root package name */
    private int f35696d;

    /* renamed from: e, reason: collision with root package name */
    private int f35697e;

    /* renamed from: f, reason: collision with root package name */
    private int f35698f;

    /* renamed from: g, reason: collision with root package name */
    private int f35699g;

    /* renamed from: h, reason: collision with root package name */
    private int f35700h;

    /* renamed from: i, reason: collision with root package name */
    private int f35701i;

    public h(int i10) {
        this.f35693a = i10;
        if (!(i10 > 0)) {
            k0.d.a("maxSize <= 0");
        }
        this.f35694b = new C3528c(0, 0.75f);
        this.f35695c = new C3527b();
    }

    private final int f(Object obj, Object obj2) {
        int g10 = g(obj, obj2);
        if (!(g10 >= 0)) {
            k0.d.b("Negative size: " + obj + '=' + obj2);
        }
        return g10;
    }

    protected Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    protected void b(boolean z10, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object d10;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f35695c) {
            Object a10 = this.f35694b.a(key);
            if (a10 != null) {
                this.f35700h++;
                return a10;
            }
            this.f35701i++;
            Object a11 = a(key);
            if (a11 == null) {
                return null;
            }
            synchronized (this.f35695c) {
                try {
                    this.f35698f++;
                    d10 = this.f35694b.d(key, a11);
                    if (d10 != null) {
                        this.f35694b.d(key, d10);
                    } else {
                        this.f35696d += f(key, a11);
                        Unit unit = Unit.f36324a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (d10 != null) {
                b(false, key, a11, d10);
                return d10;
            }
            i(this.f35693a);
            return a11;
        }
    }

    public final Object d(Object key, Object value) {
        Object d10;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f35695c) {
            try {
                this.f35697e++;
                this.f35696d += f(key, value);
                d10 = this.f35694b.d(key, value);
                if (d10 != null) {
                    this.f35696d -= f(key, d10);
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (d10 != null) {
            b(false, key, d10, value);
        }
        i(this.f35693a);
        return d10;
    }

    public final Object e(Object key) {
        Object e10;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f35695c) {
            try {
                e10 = this.f35694b.e(key);
                if (e10 != null) {
                    this.f35696d -= f(key, e10);
                }
                Unit unit = Unit.f36324a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e10 != null) {
            b(false, key, e10, null);
        }
        return e10;
    }

    protected int g(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public final Map h() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f35695c) {
            linkedHashMap = new LinkedHashMap(this.f35694b.b().size());
            for (Map.Entry entry : this.f35694b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0060, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x001c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x003e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[Catch: all -> 0x0015, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:4:0x0003, B:6:0x0008, B:8:0x0010, B:13:0x001c, B:14:0x0021, B:16:0x0025, B:18:0x002e, B:20:0x003e), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(int i10) {
        boolean z10;
        Map.Entry entry;
        Object key;
        Object value;
        while (true) {
            synchronized (this.f35695c) {
                try {
                    if (this.f35696d < 0 || (this.f35694b.c() && this.f35696d != 0)) {
                        z10 = false;
                        if (!z10) {
                            k0.d.b("LruCache.sizeOf() is reporting inconsistent results!");
                        }
                        if (this.f35696d > i10 || this.f35694b.c()) {
                            break;
                        }
                        entry = (Map.Entry) CollectionsKt.e0(this.f35694b.b());
                        if (entry != null) {
                            return;
                        }
                        key = entry.getKey();
                        value = entry.getValue();
                        this.f35694b.e(key);
                        this.f35696d -= f(key, value);
                        this.f35699g++;
                    }
                    z10 = true;
                    if (!z10) {
                    }
                    if (this.f35696d > i10) {
                        break;
                        break;
                    } else {
                        entry = (Map.Entry) CollectionsKt.e0(this.f35694b.b());
                        if (entry != null) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
    }

    public String toString() {
        String str;
        synchronized (this.f35695c) {
            try {
                int i10 = this.f35700h;
                int i11 = this.f35701i + i10;
                str = "LruCache[maxSize=" + this.f35693a + ",hits=" + this.f35700h + ",misses=" + this.f35701i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
