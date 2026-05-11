package wd;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: wd.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5082n extends C5069a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5082n(xd.n storageManager, Function0 compute) {
        super(storageManager, compute);
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(compute, "compute");
    }

    @Override // wd.C5069a, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g
    public boolean isEmpty() {
        return false;
    }
}
