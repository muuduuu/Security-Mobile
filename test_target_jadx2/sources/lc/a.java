package Lc;

import Kc.InterfaceC0933e;
import id.f;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface a {

    /* renamed from: Lc.a$a, reason: collision with other inner class name */
    public static final class C0116a implements a {

        /* renamed from: a, reason: collision with root package name */
        public static final C0116a f5747a = new C0116a();

        private C0116a() {
        }

        @Override // Lc.a
        public Collection b(InterfaceC0933e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.j();
        }

        @Override // Lc.a
        public Collection c(f name, InterfaceC0933e classDescriptor) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.j();
        }

        @Override // Lc.a
        public Collection d(InterfaceC0933e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.j();
        }

        @Override // Lc.a
        public Collection e(InterfaceC0933e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            return CollectionsKt.j();
        }
    }

    Collection b(InterfaceC0933e interfaceC0933e);

    Collection c(f fVar, InterfaceC0933e interfaceC0933e);

    Collection d(InterfaceC0933e interfaceC0933e);

    Collection e(InterfaceC0933e interfaceC0933e);
}
