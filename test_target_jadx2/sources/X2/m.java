package x2;

import android.content.Context;
import androidx.fragment.app.ComponentCallbacksC1573o;
import androidx.fragment.app.G;
import androidx.lifecycle.AbstractC1592i;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import x2.o;

/* loaded from: classes.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    final Map f44741a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final o.b f44742b;

    private final class b implements p {

        /* renamed from: a, reason: collision with root package name */
        private final G f44745a;

        b(G g10) {
            this.f44745a = g10;
        }

        private void b(G g10, Set set) {
            List v02 = g10.v0();
            int size = v02.size();
            for (int i10 = 0; i10 < size; i10++) {
                ComponentCallbacksC1573o componentCallbacksC1573o = (ComponentCallbacksC1573o) v02.get(i10);
                b(componentCallbacksC1573o.getChildFragmentManager(), set);
                com.bumptech.glide.l a10 = m.this.a(componentCallbacksC1573o.getLifecycle());
                if (a10 != null) {
                    set.add(a10);
                }
            }
        }

        @Override // x2.p
        public Set a() {
            HashSet hashSet = new HashSet();
            b(this.f44745a, hashSet);
            return hashSet;
        }
    }

    m(o.b bVar) {
        this.f44742b = bVar;
    }

    com.bumptech.glide.l a(AbstractC1592i abstractC1592i) {
        D2.l.b();
        return (com.bumptech.glide.l) this.f44741a.get(abstractC1592i);
    }

    com.bumptech.glide.l b(Context context, com.bumptech.glide.c cVar, AbstractC1592i abstractC1592i, G g10, boolean z10) {
        D2.l.b();
        com.bumptech.glide.l a10 = a(abstractC1592i);
        if (a10 != null) {
            return a10;
        }
        k kVar = new k(abstractC1592i);
        com.bumptech.glide.l a11 = this.f44742b.a(cVar, kVar, new b(g10), context);
        this.f44741a.put(abstractC1592i, a11);
        kVar.b(new a(abstractC1592i));
        if (z10) {
            a11.b();
        }
        return a11;
    }

    class a implements l {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC1592i f44743a;

        a(AbstractC1592i abstractC1592i) {
            this.f44743a = abstractC1592i;
        }

        @Override // x2.l
        public void c() {
            m.this.f44741a.remove(this.f44743a);
        }

        @Override // x2.l
        public void a() {
        }

        @Override // x2.l
        public void b() {
        }
    }
}
