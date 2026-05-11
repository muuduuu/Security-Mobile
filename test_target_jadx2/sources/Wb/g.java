package wb;

import Db.C0792a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class g extends AbstractC5052a {

    /* renamed from: g, reason: collision with root package name */
    private l f44425g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String name, C0792a[] desiredArgsTypes) {
        super(name, desiredArgsTypes);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desiredArgsTypes, "desiredArgsTypes");
        this.f44425g = l.DEFAULT;
    }

    protected final l l() {
        return this.f44425g;
    }

    public final g m(l queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f44425g = queue;
        return this;
    }
}
