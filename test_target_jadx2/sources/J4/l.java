package j4;

import android.util.SparseArray;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    protected final SparseArray f35810a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    a f35811b;

    /* renamed from: c, reason: collision with root package name */
    a f35812c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        a f35813a;

        /* renamed from: b, reason: collision with root package name */
        int f35814b;

        /* renamed from: c, reason: collision with root package name */
        LinkedList f35815c;

        /* renamed from: d, reason: collision with root package name */
        a f35816d;

        public String toString() {
            return "LinkedEntry(key: " + this.f35814b + ")";
        }

        private a(a aVar, int i10, LinkedList linkedList, a aVar2) {
            this.f35813a = aVar;
            this.f35814b = i10;
            this.f35815c = linkedList;
            this.f35816d = aVar2;
        }
    }

    private void b(a aVar) {
        if (aVar == null || !aVar.f35815c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f35810a.remove(aVar.f35814b);
    }

    private void c(a aVar) {
        if (this.f35811b == aVar) {
            return;
        }
        d(aVar);
        a aVar2 = this.f35811b;
        if (aVar2 == null) {
            this.f35811b = aVar;
            this.f35812c = aVar;
        } else {
            aVar.f35816d = aVar2;
            aVar2.f35813a = aVar;
            this.f35811b = aVar;
        }
    }

    private synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f35813a;
            a aVar3 = aVar.f35816d;
            if (aVar2 != null) {
                aVar2.f35816d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f35813a = aVar2;
            }
            aVar.f35813a = null;
            aVar.f35816d = null;
            if (aVar == this.f35811b) {
                this.f35811b = aVar3;
            }
            if (aVar == this.f35812c) {
                this.f35812c = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object a(int i10) {
        a aVar = (a) this.f35810a.get(i10);
        if (aVar == null) {
            return null;
        }
        Object pollFirst = aVar.f35815c.pollFirst();
        c(aVar);
        return pollFirst;
    }

    public synchronized void e(int i10, Object obj) {
        try {
            a aVar = (a) this.f35810a.get(i10);
            if (aVar == null) {
                aVar = new a(null, i10, new LinkedList(), null);
                this.f35810a.put(i10, aVar);
            }
            aVar.f35815c.addLast(obj);
            c(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object f() {
        a aVar = this.f35812c;
        if (aVar == null) {
            return null;
        }
        Object pollLast = aVar.f35815c.pollLast();
        b(aVar);
        return pollLast;
    }
}
