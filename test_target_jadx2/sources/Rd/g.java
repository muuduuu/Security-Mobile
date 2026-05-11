package rd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g extends AbstractC4300a {

    /* renamed from: b, reason: collision with root package name */
    private final xd.i f40641b;

    static final class a extends xc.m implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function0 f40642a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function0 function0) {
            super(0);
            this.f40642a = function0;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h invoke() {
            h hVar = (h) this.f40642a.invoke();
            return hVar instanceof AbstractC4300a ? ((AbstractC4300a) hVar).h() : hVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public g(Function0 getScope) {
        this(null, getScope, 1, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(getScope, "getScope");
    }

    @Override // rd.AbstractC4300a
    protected h i() {
        return (h) this.f40641b.invoke();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ g(xd.n NO_LOCKS, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(NO_LOCKS, function0);
        if ((i10 & 1) != 0) {
            NO_LOCKS = xd.f.f45006e;
            Intrinsics.checkNotNullExpressionValue(NO_LOCKS, "NO_LOCKS");
        }
    }

    public g(xd.n storageManager, Function0 getScope) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(getScope, "getScope");
        this.f40641b = storageManager.d(new a(getScope));
    }
}
