package T5;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class k implements l, Serializable {

    /* renamed from: a, reason: collision with root package name */
    protected final transient int f9296a;

    /* renamed from: b, reason: collision with root package name */
    protected final transient ConcurrentHashMap f9297b;

    public k(int i10, int i11) {
        this.f9297b = new ConcurrentHashMap(i10, 0.8f, 4);
        this.f9296a = i11;
    }

    public void a() {
        this.f9297b.clear();
    }

    public Object b(Object obj, Object obj2) {
        if (this.f9297b.size() >= this.f9296a) {
            synchronized (this) {
                try {
                    if (this.f9297b.size() >= this.f9296a) {
                        a();
                    }
                } finally {
                }
            }
        }
        return this.f9297b.put(obj, obj2);
    }

    @Override // T5.l
    public Object get(Object obj) {
        return this.f9297b.get(obj);
    }

    @Override // T5.l
    public Object putIfAbsent(Object obj, Object obj2) {
        if (this.f9297b.size() >= this.f9296a) {
            synchronized (this) {
                try {
                    if (this.f9297b.size() >= this.f9296a) {
                        a();
                    }
                } finally {
                }
            }
        }
        return this.f9297b.putIfAbsent(obj, obj2);
    }
}
