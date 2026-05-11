package D5;

import K5.AbstractC0928i;
import java.io.Serializable;
import v5.InterfaceC4942i;
import v5.p;

/* loaded from: classes2.dex */
public interface d {

    /* renamed from: L, reason: collision with root package name */
    public static final InterfaceC4942i.d f1236L = new InterfaceC4942i.d();

    /* renamed from: M, reason: collision with root package name */
    public static final p.b f1237M = p.b.c();

    public static class a implements d, Serializable {

        /* renamed from: a, reason: collision with root package name */
        protected final w f1238a;

        /* renamed from: b, reason: collision with root package name */
        protected final j f1239b;

        /* renamed from: c, reason: collision with root package name */
        protected final w f1240c;

        /* renamed from: d, reason: collision with root package name */
        protected final v f1241d;

        /* renamed from: e, reason: collision with root package name */
        protected final AbstractC0928i f1242e;

        public a(w wVar, j jVar, w wVar2, AbstractC0928i abstractC0928i, v vVar) {
            this.f1238a = wVar;
            this.f1239b = jVar;
            this.f1240c = wVar2;
            this.f1241d = vVar;
            this.f1242e = abstractC0928i;
        }

        @Override // D5.d
        public AbstractC0928i a() {
            return this.f1242e;
        }

        @Override // D5.d
        public InterfaceC4942i.d b(F5.l lVar, Class cls) {
            AbstractC0928i abstractC0928i;
            InterfaceC4942i.d o10 = lVar.o(cls);
            AbstractC0776b g10 = lVar.g();
            if (g10 == null || (abstractC0928i = this.f1242e) == null) {
                return o10;
            }
            InterfaceC4942i.d k10 = g10.k(abstractC0928i);
            return k10 == null ? o10 : o10.q(k10);
        }

        @Override // D5.d
        public p.b c(F5.l lVar, Class cls) {
            AbstractC0928i abstractC0928i;
            p.b l10 = lVar.l(cls, this.f1239b.q());
            AbstractC0776b g10 = lVar.g();
            if (g10 == null || (abstractC0928i = this.f1242e) == null) {
                return l10;
            }
            p.b C10 = g10.C(abstractC0928i);
            return C10 == null ? l10 : l10.m(C10);
        }

        @Override // D5.d
        public j getType() {
            return this.f1239b;
        }
    }

    AbstractC0928i a();

    InterfaceC4942i.d b(F5.l lVar, Class cls);

    p.b c(F5.l lVar, Class cls);

    j getType();
}
