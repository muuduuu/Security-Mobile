package de;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: de.o, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3058o extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final EnumC3045b f32082a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3058o(EnumC3045b errorCode) {
        super("stream was reset: " + errorCode);
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f32082a = errorCode;
    }
}
