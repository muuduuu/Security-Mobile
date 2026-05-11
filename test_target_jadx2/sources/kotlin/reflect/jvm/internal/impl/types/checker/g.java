package kotlin.reflect.jvm.internal.impl.types.checker;

import Kc.G;
import Kc.InterfaceC0933e;
import Kc.InterfaceC0936h;
import Kc.InterfaceC0941m;
import id.C3367b;
import java.util.Collection;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.AbstractC5206h;
import yd.e0;

/* loaded from: classes3.dex */
public abstract class g extends AbstractC5206h {

    public static final class a extends g {

        /* renamed from: a, reason: collision with root package name */
        public static final a f36674a = new a();

        private a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public InterfaceC0933e b(C3367b classId) {
            Intrinsics.checkNotNullParameter(classId, "classId");
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public rd.h c(InterfaceC0933e classDescriptor, Function0 compute) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Intrinsics.checkNotNullParameter(compute, "compute");
            return (rd.h) compute.invoke();
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean d(G moduleDescriptor) {
            Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public boolean e(e0 typeConstructor) {
            Intrinsics.checkNotNullParameter(typeConstructor, "typeConstructor");
            return false;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        public Collection g(InterfaceC0933e classDescriptor) {
            Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
            Collection a10 = classDescriptor.r().a();
            Intrinsics.checkNotNullExpressionValue(a10, "getSupertypes(...)");
            return a10;
        }

        @Override // yd.AbstractC5206h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public AbstractC5197E a(Ad.i type) {
            Intrinsics.checkNotNullParameter(type, "type");
            return (AbstractC5197E) type;
        }

        @Override // kotlin.reflect.jvm.internal.impl.types.checker.g
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public InterfaceC0933e f(InterfaceC0941m descriptor) {
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            return null;
        }
    }

    public abstract InterfaceC0933e b(C3367b c3367b);

    public abstract rd.h c(InterfaceC0933e interfaceC0933e, Function0 function0);

    public abstract boolean d(G g10);

    public abstract boolean e(e0 e0Var);

    public abstract InterfaceC0936h f(InterfaceC0941m interfaceC0941m);

    public abstract Collection g(InterfaceC0933e interfaceC0933e);

    /* renamed from: h */
    public abstract AbstractC5197E a(Ad.i iVar);
}
