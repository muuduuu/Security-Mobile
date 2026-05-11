package ud;

import Kc.InterfaceC0930b;
import Kc.InterfaceC0933e;
import java.util.List;

/* loaded from: classes3.dex */
public interface r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f43722a = new a();

    static class a implements r {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ud.r
        public void a(InterfaceC0930b interfaceC0930b) {
            if (interfaceC0930b == null) {
                c(2);
            }
        }

        @Override // ud.r
        public void b(InterfaceC0933e interfaceC0933e, List list) {
            if (interfaceC0933e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(InterfaceC0930b interfaceC0930b);

    void b(InterfaceC0933e interfaceC0933e, List list);
}
