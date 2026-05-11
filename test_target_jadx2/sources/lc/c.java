package Lc;

import Kc.InterfaceC0933e;
import Kc.Z;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final a f5748a = new a();

        private a() {
        }

        @Override // Lc.c
        public boolean a(InterfaceC0933e classDescriptor, Z functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return true;
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        public static final b f5749a = new b();

        private b() {
        }

        @Override // Lc.c
        public boolean a(InterfaceC0933e classDescriptor, Z functionDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return !functionDescriptor.i().A1(d.a());
        }
    }

    boolean a(InterfaceC0933e interfaceC0933e, Z z10);
}
