package o2;

import java.util.Queue;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final D2.h f37860a;

    class a extends D2.h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // D2.h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue f37862d = D2.l.g(0);

        /* renamed from: a, reason: collision with root package name */
        private int f37863a;

        /* renamed from: b, reason: collision with root package name */
        private int f37864b;

        /* renamed from: c, reason: collision with root package name */
        private Object f37865c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f37862d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f37865c = obj;
            this.f37864b = i10;
            this.f37863a = i11;
        }

        public void c() {
            Queue queue = f37862d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f37864b == bVar.f37864b && this.f37863a == bVar.f37863a && this.f37865c.equals(bVar.f37865c);
        }

        public int hashCode() {
            return (((this.f37863a * 31) + this.f37864b) * 31) + this.f37865c.hashCode();
        }
    }

    public m(long j10) {
        this.f37860a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b a10 = b.a(obj, i10, i11);
        Object g10 = this.f37860a.g(a10);
        a10.c();
        return g10;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f37860a.k(b.a(obj, i10, i11), obj2);
    }
}
