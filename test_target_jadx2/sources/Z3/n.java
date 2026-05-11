package Z3;

import e3.InterfaceC3076c;
import f3.AbstractC3142a;

/* loaded from: classes.dex */
public interface n extends x, InterfaceC3076c {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Object f12407a;

        /* renamed from: b, reason: collision with root package name */
        public final AbstractC3142a f12408b;

        /* renamed from: e, reason: collision with root package name */
        public final b f12411e;

        /* renamed from: g, reason: collision with root package name */
        public int f12413g;

        /* renamed from: c, reason: collision with root package name */
        public int f12409c = 0;

        /* renamed from: d, reason: collision with root package name */
        public boolean f12410d = false;

        /* renamed from: f, reason: collision with root package name */
        public int f12412f = 0;

        private a(Object obj, AbstractC3142a abstractC3142a, b bVar, int i10) {
            this.f12407a = b3.l.g(obj);
            this.f12408b = (AbstractC3142a) b3.l.g(AbstractC3142a.i(abstractC3142a));
            this.f12411e = bVar;
            this.f12413g = i10;
        }

        public static a a(Object obj, AbstractC3142a abstractC3142a, int i10, b bVar) {
            return new a(obj, abstractC3142a, bVar, i10);
        }

        public static a b(Object obj, AbstractC3142a abstractC3142a, b bVar) {
            return a(obj, abstractC3142a, -1, bVar);
        }
    }

    public interface b {
        void a(Object obj, boolean z10);
    }

    AbstractC3142a b(Object obj, AbstractC3142a abstractC3142a, b bVar);

    AbstractC3142a d(Object obj);
}
