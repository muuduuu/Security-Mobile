package vb;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: vb.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5009d extends AbstractC5008c {

    /* renamed from: b, reason: collision with root package name */
    private final Function2 f44209b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5009d(EnumC5010e eventName, Function2 body) {
        super(eventName, null);
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f44209b = body;
    }

    public final void a(Object obj, Object obj2) {
        this.f44209b.invoke(obj, obj2);
    }
}
