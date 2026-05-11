package kotlin.reflect.jvm.internal.impl.descriptors.annotations;

import Kc.a0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;
import yd.M;

/* loaded from: classes3.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final Hc.g f36449a;

    /* renamed from: b, reason: collision with root package name */
    private final id.c f36450b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f36451c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f36452d;

    /* renamed from: e, reason: collision with root package name */
    private final Lazy f36453e;

    static final class a extends xc.m implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final M invoke() {
            return j.this.f36449a.o(j.this.e()).y();
        }
    }

    public j(Hc.g builtIns, id.c fqName, Map allValueArguments, boolean z10) {
        Intrinsics.checkNotNullParameter(builtIns, "builtIns");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(allValueArguments, "allValueArguments");
        this.f36449a = builtIns;
        this.f36450b = fqName;
        this.f36451c = allValueArguments;
        this.f36452d = z10;
        this.f36453e = lc.i.b(lc.l.PUBLICATION, new a());
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public Map a() {
        return this.f36451c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public id.c e() {
        return this.f36450b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public AbstractC5197E getType() {
        Object value = this.f36453e.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (AbstractC5197E) value;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public a0 j() {
        a0 NO_SOURCE = a0.f5560a;
        Intrinsics.checkNotNullExpressionValue(NO_SOURCE, "NO_SOURCE");
        return NO_SOURCE;
    }

    public /* synthetic */ j(Hc.g gVar, id.c cVar, Map map, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, cVar, map, (i10 & 8) != 0 ? false : z10);
    }
}
