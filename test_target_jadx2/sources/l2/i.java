package l2;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class i implements InterfaceC3600b {

    /* renamed from: a, reason: collision with root package name */
    private final g f37020a = new g();

    /* renamed from: b, reason: collision with root package name */
    private final b f37021b = new b();

    /* renamed from: c, reason: collision with root package name */
    private final Map f37022c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f37023d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    private final int f37024e;

    /* renamed from: f, reason: collision with root package name */
    private int f37025f;

    private static final class a implements m {

        /* renamed from: a, reason: collision with root package name */
        private final b f37026a;

        /* renamed from: b, reason: collision with root package name */
        int f37027b;

        /* renamed from: c, reason: collision with root package name */
        private Class f37028c;

        a(b bVar) {
            this.f37026a = bVar;
        }

        @Override // l2.m
        public void a() {
            this.f37026a.c(this);
        }

        void b(int i10, Class cls) {
            this.f37027b = i10;
            this.f37028c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f37027b == aVar.f37027b && this.f37028c == aVar.f37028c;
        }

        public int hashCode() {
            int i10 = this.f37027b * 31;
            Class cls = this.f37028c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f37027b + "array=" + this.f37028c + '}';
        }
    }

    private static final class b extends AbstractC3601c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // l2.AbstractC3601c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f37024e = i10;
    }

    private void e(int i10, Class cls) {
        NavigableMap l10 = l(cls);
        Integer num = (Integer) l10.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                l10.remove(Integer.valueOf(i10));
                return;
            } else {
                l10.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void f() {
        g(this.f37024e);
    }

    private void g(int i10) {
        while (this.f37025f > i10) {
            Object f10 = this.f37020a.f();
            D2.k.d(f10);
            InterfaceC3599a h10 = h(f10);
            this.f37025f -= h10.c(f10) * h10.b();
            e(h10.c(f10), f10.getClass());
            if (Log.isLoggable(h10.a(), 2)) {
                Log.v(h10.a(), "evicted: " + h10.c(f10));
            }
        }
    }

    private InterfaceC3599a h(Object obj) {
        return i(obj.getClass());
    }

    private InterfaceC3599a i(Class cls) {
        InterfaceC3599a interfaceC3599a = (InterfaceC3599a) this.f37023d.get(cls);
        if (interfaceC3599a == null) {
            if (cls.equals(int[].class)) {
                interfaceC3599a = new h();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
                }
                interfaceC3599a = new f();
            }
            this.f37023d.put(cls, interfaceC3599a);
        }
        return interfaceC3599a;
    }

    private Object j(a aVar) {
        return this.f37020a.a(aVar);
    }

    private Object k(a aVar, Class cls) {
        InterfaceC3599a i10 = i(cls);
        Object j10 = j(aVar);
        if (j10 != null) {
            this.f37025f -= i10.c(j10) * i10.b();
            e(i10.c(j10), cls);
        }
        if (j10 != null) {
            return j10;
        }
        if (Log.isLoggable(i10.a(), 2)) {
            Log.v(i10.a(), "Allocated " + aVar.f37027b + " bytes");
        }
        return i10.newArray(aVar.f37027b);
    }

    private NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f37022c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f37022c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f37025f;
        return i10 == 0 || this.f37024e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f37024e / 2;
    }

    private boolean o(int i10, Integer num) {
        return num != null && (m() || num.intValue() <= i10 * 8);
    }

    @Override // l2.InterfaceC3600b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f37024e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l2.InterfaceC3600b
    public synchronized void b() {
        g(0);
    }

    @Override // l2.InterfaceC3600b
    public synchronized Object c(int i10, Class cls) {
        return k(this.f37021b.e(i10, cls), cls);
    }

    @Override // l2.InterfaceC3600b
    public synchronized Object d(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return k(o(i10, num) ? this.f37021b.e(num.intValue(), cls) : this.f37021b.e(i10, cls), cls);
    }

    @Override // l2.InterfaceC3600b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        InterfaceC3599a i10 = i(cls);
        int c10 = i10.c(obj);
        int b10 = i10.b() * c10;
        if (n(b10)) {
            a e10 = this.f37021b.e(c10, cls);
            this.f37020a.d(e10, obj);
            NavigableMap l10 = l(cls);
            Integer num = (Integer) l10.get(Integer.valueOf(e10.f37027b));
            Integer valueOf = Integer.valueOf(e10.f37027b);
            int i11 = 1;
            if (num != null) {
                i11 = 1 + num.intValue();
            }
            l10.put(valueOf, Integer.valueOf(i11));
            this.f37025f += b10;
            f();
        }
    }
}
