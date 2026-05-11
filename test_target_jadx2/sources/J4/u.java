package j4;

import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class u implements InterfaceC3487A {

    /* renamed from: a, reason: collision with root package name */
    private final Set f35832a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    private final l f35833b = new l();

    private Object c(Object obj) {
        if (obj != null) {
            synchronized (this) {
                this.f35832a.remove(obj);
            }
        }
        return obj;
    }

    @Override // j4.InterfaceC3487A
    public Object b() {
        return c(this.f35833b.f());
    }

    @Override // j4.InterfaceC3487A
    public Object get(int i10) {
        return c(this.f35833b.a(i10));
    }

    @Override // j4.InterfaceC3487A
    public void put(Object obj) {
        boolean add;
        synchronized (this) {
            add = this.f35832a.add(obj);
        }
        if (add) {
            this.f35833b.e(a(obj), obj);
        }
    }
}
