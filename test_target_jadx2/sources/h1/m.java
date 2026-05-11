package h1;

import androidx.lifecycle.AbstractC1604v;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private final s f33875a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f33876b;

    public m(s database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f33875a = database;
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        Intrinsics.checkNotNullExpressionValue(newSetFromMap, "newSetFromMap(IdentityHashMap())");
        this.f33876b = newSetFromMap;
    }

    public final AbstractC1604v a(String[] tableNames, boolean z10, Callable computeFunction) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        return new androidx.room.e(this.f33875a, this, z10, computeFunction, tableNames);
    }

    public final void b(AbstractC1604v liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f33876b.add(liveData);
    }

    public final void c(AbstractC1604v liveData) {
        Intrinsics.checkNotNullParameter(liveData, "liveData");
        this.f33876b.remove(liveData);
    }
}
