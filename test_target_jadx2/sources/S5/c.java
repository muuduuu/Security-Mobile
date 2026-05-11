package S5;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    protected final c f8754a;

    /* renamed from: b, reason: collision with root package name */
    protected final Class f8755b;

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f8756c;

    public c(Class cls) {
        this(null, cls);
    }

    public void a(k kVar) {
        if (this.f8756c == null) {
            this.f8756c = new ArrayList();
        }
        this.f8756c.add(kVar);
    }

    public c b(Class cls) {
        return new c(this, cls);
    }

    public c c(Class cls) {
        if (this.f8755b == cls) {
            return this;
        }
        for (c cVar = this.f8754a; cVar != null; cVar = cVar.f8754a) {
            if (cVar.f8755b == cls) {
                return cVar;
            }
        }
        return null;
    }

    public void d(D5.j jVar) {
        ArrayList arrayList = this.f8756c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((k) it.next()).X(jVar);
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[ClassStack (self-refs: ");
        ArrayList arrayList = this.f8756c;
        sb2.append(arrayList == null ? "0" : String.valueOf(arrayList.size()));
        sb2.append(')');
        for (c cVar = this; cVar != null; cVar = cVar.f8754a) {
            sb2.append(' ');
            sb2.append(cVar.f8755b.getName());
        }
        sb2.append(']');
        return sb2.toString();
    }

    private c(c cVar, Class cls) {
        this.f8754a = cVar;
        this.f8755b = cls;
    }
}
