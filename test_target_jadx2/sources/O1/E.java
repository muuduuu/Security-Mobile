package O1;

import j0.C3477b;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6898a = false;

    /* renamed from: b, reason: collision with root package name */
    private final Set f6899b = new C3477b();

    /* renamed from: c, reason: collision with root package name */
    private final Map f6900c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Comparator f6901d = new a();

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(y0.c cVar, y0.c cVar2) {
            float floatValue = ((Float) cVar.f45131b).floatValue();
            float floatValue2 = ((Float) cVar2.f45131b).floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    public void a(String str, float f10) {
        if (this.f6898a) {
            b2.j jVar = (b2.j) this.f6900c.get(str);
            if (jVar == null) {
                jVar = new b2.j();
                this.f6900c.put(str, jVar);
            }
            jVar.a(f10);
            if (str.equals("__container")) {
                Iterator it = this.f6899b.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.b.a(it.next());
                    throw null;
                }
            }
        }
    }

    void b(boolean z10) {
        this.f6898a = z10;
    }
}
