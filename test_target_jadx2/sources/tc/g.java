package Tc;

import Kc.InterfaceC0933e;
import Kc.InterfaceC0940l;
import Kc.U;
import Kc.Z;
import Zc.l;
import Zc.n;
import Zc.q;

/* loaded from: classes3.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final g f9761a = new a();

    static class a implements g {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Tc.g
        public void a(Zc.g gVar, InterfaceC0933e interfaceC0933e) {
            if (gVar == null) {
                f(7);
            }
            if (interfaceC0933e == null) {
                f(8);
            }
        }

        @Override // Tc.g
        public void b(q qVar, Z z10) {
            if (qVar == null) {
                f(1);
            }
            if (z10 == null) {
                f(2);
            }
        }

        @Override // Tc.g
        public void c(n nVar, U u10) {
            if (nVar == null) {
                f(5);
            }
            if (u10 == null) {
                f(6);
            }
        }

        @Override // Tc.g
        public InterfaceC0933e d(id.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // Tc.g
        public void e(l lVar, InterfaceC0940l interfaceC0940l) {
            if (lVar == null) {
                f(3);
            }
            if (interfaceC0940l == null) {
                f(4);
            }
        }
    }

    void a(Zc.g gVar, InterfaceC0933e interfaceC0933e);

    void b(q qVar, Z z10);

    void c(n nVar, U u10);

    InterfaceC0933e d(id.c cVar);

    void e(l lVar, InterfaceC0940l interfaceC0940l);
}
