package E2;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    private static final g f1877a = new C0036a();

    class b implements d {
        b() {
        }

        @Override // E2.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public List create() {
            return new ArrayList();
        }
    }

    class c implements g {
        c() {
        }

        @Override // E2.a.g
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(List list) {
            list.clear();
        }
    }

    public interface d {
        Object create();
    }

    private static final class e implements y0.d {

        /* renamed from: a, reason: collision with root package name */
        private final d f1878a;

        /* renamed from: b, reason: collision with root package name */
        private final g f1879b;

        /* renamed from: c, reason: collision with root package name */
        private final y0.d f1880c;

        e(y0.d dVar, d dVar2, g gVar) {
            this.f1880c = dVar;
            this.f1878a = dVar2;
            this.f1879b = gVar;
        }

        @Override // y0.d
        public boolean a(Object obj) {
            if (obj instanceof f) {
                ((f) obj).e().b(true);
            }
            this.f1879b.a(obj);
            return this.f1880c.a(obj);
        }

        @Override // y0.d
        public Object b() {
            Object b10 = this.f1880c.b();
            if (b10 == null) {
                b10 = this.f1878a.create();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof f) {
                ((f) b10).e().b(false);
            }
            return b10;
        }
    }

    public interface f {
        E2.c e();
    }

    public interface g {
        void a(Object obj);
    }

    private static y0.d a(y0.d dVar, d dVar2) {
        return b(dVar, dVar2, c());
    }

    private static y0.d b(y0.d dVar, d dVar2, g gVar) {
        return new e(dVar, dVar2, gVar);
    }

    private static g c() {
        return f1877a;
    }

    public static y0.d d(int i10, d dVar) {
        return a(new y0.e(i10), dVar);
    }

    public static y0.d e() {
        return f(20);
    }

    public static y0.d f(int i10) {
        return b(new y0.e(i10), new b(), new c());
    }

    /* renamed from: E2.a$a, reason: collision with other inner class name */
    class C0036a implements g {
        C0036a() {
        }

        @Override // E2.a.g
        public void a(Object obj) {
        }
    }
}
