package Tc;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import Zc.r;
import java.util.Collections;
import java.util.List;
import yd.AbstractC5197E;

/* loaded from: classes3.dex */
public interface j {

    /* renamed from: a, reason: collision with root package name */
    public static final j f9768a = new a();

    static class a implements j {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Tc.j
        public void a(InterfaceC0930b interfaceC0930b, List list) {
            if (interfaceC0930b == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // Tc.j
        public b b(r rVar, InterfaceC0933e interfaceC0933e, AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, List list, List list2) {
            if (rVar == null) {
                c(0);
            }
            if (interfaceC0933e == null) {
                c(1);
            }
            if (abstractC5197E == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(abstractC5197E, abstractC5197E2, list, list2, Collections.emptyList(), false);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final AbstractC5197E f9769a;

        /* renamed from: b, reason: collision with root package name */
        private final AbstractC5197E f9770b;

        /* renamed from: c, reason: collision with root package name */
        private final List f9771c;

        /* renamed from: d, reason: collision with root package name */
        private final List f9772d;

        /* renamed from: e, reason: collision with root package name */
        private final List f9773e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f9774f;

        public b(AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, List list, List list2, List list3, boolean z10) {
            if (abstractC5197E == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f9769a = abstractC5197E;
            this.f9770b = abstractC5197E2;
            this.f9771c = list;
            this.f9772d = list2;
            this.f9773e = list3;
            this.f9774f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String format = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(format);
            }
            throw new IllegalStateException(format);
        }

        public List b() {
            List list = this.f9773e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public AbstractC5197E c() {
            return this.f9770b;
        }

        public AbstractC5197E d() {
            AbstractC5197E abstractC5197E = this.f9769a;
            if (abstractC5197E == null) {
                a(4);
            }
            return abstractC5197E;
        }

        public List e() {
            List list = this.f9772d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List f() {
            List list = this.f9771c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f9774f;
        }
    }

    void a(InterfaceC0930b interfaceC0930b, List list);

    b b(r rVar, InterfaceC0933e interfaceC0933e, AbstractC5197E abstractC5197E, AbstractC5197E abstractC5197E2, List list, List list2);
}
