package xc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: xc.F, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5145F {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f44965a;

    public C5145F(int i10) {
        this.f44965a = new ArrayList(i10);
    }

    public void a(Object obj) {
        this.f44965a.add(obj);
    }

    public void b(Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ArrayList arrayList = this.f44965a;
                arrayList.ensureCapacity(arrayList.size() + objArr.length);
                Collections.addAll(this.f44965a, objArr);
                return;
            }
            return;
        }
        if (obj instanceof Collection) {
            this.f44965a.addAll((Collection) obj);
            return;
        }
        if (obj instanceof Iterable) {
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                this.f44965a.add(it.next());
            }
            return;
        }
        if (obj instanceof Iterator) {
            Iterator it2 = (Iterator) obj;
            while (it2.hasNext()) {
                this.f44965a.add(it2.next());
            }
        } else {
            throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
        }
    }

    public int c() {
        return this.f44965a.size();
    }

    public Object[] d(Object[] objArr) {
        return this.f44965a.toArray(objArr);
    }
}
