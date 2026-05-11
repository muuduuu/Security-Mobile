package androidx.lifecycle;

import Z0.a;
import androidx.lifecycle.V;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class U implements Lazy {

    /* renamed from: a, reason: collision with root package name */
    private final kotlin.reflect.d f17093a;

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f17094b;

    /* renamed from: c, reason: collision with root package name */
    private final Function0 f17095c;

    /* renamed from: d, reason: collision with root package name */
    private final Function0 f17096d;

    /* renamed from: e, reason: collision with root package name */
    private S f17097e;

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f17098a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a.C0228a invoke() {
            return a.C0228a.f12277b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public U(kotlin.reflect.d viewModelClass, Function0 storeProducer, Function0 factoryProducer) {
        this(viewModelClass, storeProducer, factoryProducer, null, 8, null);
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
    }

    @Override // kotlin.Lazy
    public boolean a() {
        return this.f17097e != null;
    }

    @Override // kotlin.Lazy
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public S getValue() {
        S s10 = this.f17097e;
        if (s10 != null) {
            return s10;
        }
        S c10 = V.f17099b.a((W) this.f17094b.invoke(), (V.c) this.f17095c.invoke(), (Z0.a) this.f17096d.invoke()).c(this.f17093a);
        this.f17097e = c10;
        return c10;
    }

    public U(kotlin.reflect.d viewModelClass, Function0 storeProducer, Function0 factoryProducer, Function0 extrasProducer) {
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(factoryProducer, "factoryProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        this.f17093a = viewModelClass;
        this.f17094b = storeProducer;
        this.f17095c = factoryProducer;
        this.f17096d = extrasProducer;
    }

    public /* synthetic */ U(kotlin.reflect.d dVar, Function0 function0, Function0 function02, Function0 function03, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, function0, function02, (i10 & 8) != 0 ? a.f17098a : function03);
    }
}
