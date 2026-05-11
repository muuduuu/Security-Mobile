package qd;

import kotlin.jvm.internal.Intrinsics;
import xd.n;

/* renamed from: qd.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3960b implements InterfaceC3959a {

    /* renamed from: a, reason: collision with root package name */
    private final Iterable f38885a;

    /* renamed from: b, reason: collision with root package name */
    private final xd.b f38886b;

    public C3960b(n storageManager, Iterable samWithReceiverResolvers) {
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(samWithReceiverResolvers, "samWithReceiverResolvers");
        this.f38885a = samWithReceiverResolvers;
        this.f38886b = storageManager.a();
    }
}
