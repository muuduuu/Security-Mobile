package vb;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5006a extends AbstractC5008c {

    /* renamed from: b, reason: collision with root package name */
    private final Function0 f44207b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5006a(EnumC5010e eventName, Function0 body) {
        super(eventName, null);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f44207b = body;
    }

    public final void a() {
        this.f44207b.invoke();
    }
}
