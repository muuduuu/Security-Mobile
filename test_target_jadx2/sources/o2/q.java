package o2;

import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o2.n;

/* loaded from: classes.dex */
class q implements n {

    /* renamed from: a, reason: collision with root package name */
    private final List f37873a;

    /* renamed from: b, reason: collision with root package name */
    private final y0.d f37874b;

    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* renamed from: a, reason: collision with root package name */
        private final List f37875a;

        /* renamed from: b, reason: collision with root package name */
        private final y0.d f37876b;

        /* renamed from: c, reason: collision with root package name */
        private int f37877c;

        /* renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.h f37878d;

        /* renamed from: e, reason: collision with root package name */
        private d.a f37879e;

        /* renamed from: f, reason: collision with root package name */
        private List f37880f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f37881g;

        a(List list, y0.d dVar) {
            this.f37876b = dVar;
            D2.k.c(list);
            this.f37875a = list;
            this.f37877c = 0;
        }

        private void g() {
            if (this.f37881g) {
                return;
            }
            if (this.f37877c < this.f37875a.size() - 1) {
                this.f37877c++;
                f(this.f37878d, this.f37879e);
            } else {
                D2.k.d(this.f37880f);
                this.f37879e.c(new k2.q("Fetch failed", new ArrayList(this.f37880f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f37875a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f37880f;
            if (list != null) {
                this.f37876b.a(list);
            }
            this.f37880f = null;
            Iterator it = this.f37875a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) D2.k.d(this.f37880f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f37881g = true;
            Iterator it = this.f37875a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(Object obj) {
            if (obj != null) {
                this.f37879e.d(obj);
            } else {
                g();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public EnumC3313a e() {
            return ((com.bumptech.glide.load.data.d) this.f37875a.get(0)).e();
        }

        @Override // com.bumptech.glide.load.data.d
        public void f(com.bumptech.glide.h hVar, d.a aVar) {
            this.f37878d = hVar;
            this.f37879e = aVar;
            this.f37880f = (List) this.f37876b.b();
            ((com.bumptech.glide.load.data.d) this.f37875a.get(this.f37877c)).f(hVar, this);
            if (this.f37881g) {
                cancel();
            }
        }
    }

    q(List list, y0.d dVar) {
        this.f37873a = list;
        this.f37874b = dVar;
    }

    @Override // o2.n
    public boolean a(Object obj) {
        Iterator it = this.f37873a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // o2.n
    public n.a b(Object obj, int i10, int i11, i2.h hVar) {
        n.a b10;
        int size = this.f37873a.size();
        ArrayList arrayList = new ArrayList(size);
        i2.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f37873a.get(i12);
            if (nVar.a(obj) && (b10 = nVar.b(obj, i10, i11, hVar)) != null) {
                fVar = b10.f37866a;
                arrayList.add(b10.f37868c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a(fVar, new a(arrayList, this.f37874b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f37873a.toArray()) + '}';
    }
}
