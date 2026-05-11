package md;

import Kc.G;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yd.AbstractC5197E;

/* renamed from: md.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3695v extends C3675b {

    /* renamed from: c, reason: collision with root package name */
    private final AbstractC5197E f37498c;

    /* renamed from: md.v$a */
    static final class a extends xc.m implements Function1 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractC5197E f37499a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC5197E abstractC5197E) {
            super(1);
            this.f37499a = abstractC5197E;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final AbstractC5197E invoke(G it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return this.f37499a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3695v(List value, AbstractC5197E type) {
        super(value, new a(type));
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f37498c = type;
    }

    public final AbstractC5197E c() {
        return this.f37498c;
    }
}
