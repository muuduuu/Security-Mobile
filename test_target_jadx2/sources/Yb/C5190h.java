package yb;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;

/* renamed from: yb.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5190h extends C5189g {

    /* renamed from: d, reason: collision with root package name */
    private final o f45420d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5190h(o thisType, String name) {
        super(name);
        Intrinsics.checkNotNullParameter(thisType, "thisType");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f45420d = thisType;
    }

    public final o d() {
        return this.f45420d;
    }
}
