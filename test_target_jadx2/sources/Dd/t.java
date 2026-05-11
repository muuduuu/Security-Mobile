package Dd;

import Dd.f;
import Kc.InterfaceC0952y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* loaded from: classes3.dex */
public abstract class t implements f {

    /* renamed from: a, reason: collision with root package name */
    private final String f1596a;

    public static final class a extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f1597b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(int i10) {
            super(r0.toString(), null);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("must have at least ");
            sb2.append(i10);
            sb2.append(" value parameter");
            sb2.append(i10 > 1 ? "s" : BuildConfig.FLAVOR);
            this.f1597b = i10;
        }

        @Override // Dd.f
        public boolean a(InterfaceC0952y functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.m().size() >= this.f1597b;
        }
    }

    public static final class b extends t {

        /* renamed from: b, reason: collision with root package name */
        private final int f1598b;

        public b(int i10) {
            super("must have exactly " + i10 + " value parameters", null);
            this.f1598b = i10;
        }

        @Override // Dd.f
        public boolean a(InterfaceC0952y functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.m().size() == this.f1598b;
        }
    }

    public static final class c extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final c f1599b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // Dd.f
        public boolean a(InterfaceC0952y functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.m().isEmpty();
        }
    }

    public static final class d extends t {

        /* renamed from: b, reason: collision with root package name */
        public static final d f1600b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // Dd.f
        public boolean a(InterfaceC0952y functionDescriptor) {
            Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
            return functionDescriptor.m().size() == 1;
        }
    }

    public /* synthetic */ t(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // Dd.f
    public String b(InterfaceC0952y interfaceC0952y) {
        return f.a.a(this, interfaceC0952y);
    }

    @Override // Dd.f
    public String getDescription() {
        return this.f1596a;
    }

    private t(String str) {
        this.f1596a = str;
    }
}
