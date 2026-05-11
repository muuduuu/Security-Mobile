package Dd;

import Dd.f;
import Kc.InterfaceC0952y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class k implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f1518a;

    public static final class a extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final a f1519b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // Dd.f
        public boolean a(InterfaceC0952y functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.l0() != null;
        }
    }

    public static final class b extends k {

        /* renamed from: b, reason: collision with root package name */
        public static final b f1520b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // Dd.f
        public boolean a(InterfaceC0952y functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.l0() == null && functionDescriptor.s0() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // Dd.f
    public String b(InterfaceC0952y interfaceC0952y) {
        return f.a.a(this, interfaceC0952y);
    }

    @Override // Dd.f
    public String getDescription() {
        return this.f1518a;
    }

    private k(String str) {
        this.f1518a = str;
    }
}
