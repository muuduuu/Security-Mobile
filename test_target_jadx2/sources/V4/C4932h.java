package v4;

import kotlin.jvm.internal.Intrinsics;
import r4.AbstractC4012a;

/* renamed from: v4.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4932h {

    /* renamed from: a, reason: collision with root package name */
    private Thread f43937a;

    public final void a() {
        Thread currentThread = Thread.currentThread();
        if (this.f43937a == null) {
            this.f43937a = currentThread;
        }
        AbstractC4012a.a(Intrinsics.b(this.f43937a, currentThread));
    }
}
