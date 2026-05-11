package Dd;

import Dd.g;
import Kc.InterfaceC0952y;
import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final id.f f1507a;

    /* renamed from: b, reason: collision with root package name */
    private final Regex f1508b;

    /* renamed from: c, reason: collision with root package name */
    private final Collection f1509c;

    /* renamed from: d, reason: collision with root package name */
    private final Function1 f1510d;

    /* renamed from: e, reason: collision with root package name */
    private final f[] f1511e;

    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f1512a = new a();

        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC0952y interfaceC0952y) {
            Intrinsics.checkNotNullParameter(interfaceC0952y, "$this$null");
            return null;
        }
    }

    static final class b extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final b f1513a = new b();

        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC0952y interfaceC0952y) {
            Intrinsics.checkNotNullParameter(interfaceC0952y, "$this$null");
            return null;
        }
    }

    static final class c extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        public static final c f1514a = new c();

        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(InterfaceC0952y interfaceC0952y) {
            Intrinsics.checkNotNullParameter(interfaceC0952y, "$this$null");
            return null;
        }
    }

    private h(id.f fVar, Regex regex, Collection collection, Function1 function1, f... fVarArr) {
        this.f1507a = fVar;
        this.f1508b = regex;
        this.f1509c = collection;
        this.f1510d = function1;
        this.f1511e = fVarArr;
    }

    public final g a(InterfaceC0952y functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        for (f fVar : this.f1511e) {
            String b10 = fVar.b(functionDescriptor);
            if (b10 != null) {
                return new g.b(b10);
            }
        }
        String str = (String) this.f1510d.invoke(functionDescriptor);
        return str != null ? new g.b(str) : g.c.f1506b;
    }

    public final boolean b(InterfaceC0952y functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        if (this.f1507a != null && !Intrinsics.b(functionDescriptor.getName(), this.f1507a)) {
            return false;
        }
        if (this.f1508b != null) {
            String c10 = functionDescriptor.getName().c();
            Intrinsics.checkNotNullExpressionValue(c10, "asString(...)");
            if (!this.f1508b.d(c10)) {
                return false;
            }
        }
        Collection collection = this.f1509c;
        return collection == null || collection.contains(functionDescriptor.getName());
    }

    public /* synthetic */ h(id.f fVar, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, fVarArr, (i10 & 4) != 0 ? a.f1512a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(id.f name, f[] checks, Function1 additionalChecks) {
        this(name, (Regex) null, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Regex regex, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(regex, fVarArr, (i10 & 4) != 0 ? b.f1513a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Regex regex, f[] checks, Function1 additionalChecks) {
        this((id.f) null, regex, (Collection) null, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(regex, "regex");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ h(Collection collection, f[] fVarArr, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, fVarArr, (i10 & 4) != 0 ? c.f1514a : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h(Collection nameList, f[] checks, Function1 additionalChecks) {
        this((id.f) null, (Regex) null, nameList, additionalChecks, (f[]) Arrays.copyOf(checks, checks.length));
        Intrinsics.checkNotNullParameter(nameList, "nameList");
        Intrinsics.checkNotNullParameter(checks, "checks");
        Intrinsics.checkNotNullParameter(additionalChecks, "additionalChecks");
    }
}
