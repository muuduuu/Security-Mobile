package L;

import L.c;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public class a implements c {

    /* renamed from: a, reason: collision with root package name */
    private final int f5612a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f5613b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f5614c;

    /* renamed from: d, reason: collision with root package name */
    final c.a f5615d;

    public a(int i10) {
        this(i10, null);
    }

    @Override // L.c
    public Object a() {
        Object removeLast;
        synchronized (this.f5614c) {
            removeLast = this.f5613b.removeLast();
        }
        return removeLast;
    }

    @Override // L.c
    public void b(Object obj) {
        Object a10;
        synchronized (this.f5614c) {
            try {
                a10 = this.f5613b.size() >= this.f5612a ? a() : null;
                this.f5613b.addFirst(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        c.a aVar = this.f5615d;
        if (aVar == null || a10 == null) {
            return;
        }
        aVar.a(a10);
    }

    @Override // L.c
    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f5614c) {
            isEmpty = this.f5613b.isEmpty();
        }
        return isEmpty;
    }

    public a(int i10, c.a aVar) {
        this.f5614c = new Object();
        this.f5612a = i10;
        this.f5613b = new ArrayDeque(i10);
        this.f5615d = aVar;
    }
}
