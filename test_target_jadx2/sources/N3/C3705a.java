package n3;

import kotlin.jvm.internal.Intrinsics;
import m3.C3649a;

/* renamed from: n3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3705a implements InterfaceC3706b {

    /* renamed from: a, reason: collision with root package name */
    public static final C3705a f37563a = new C3705a();

    private C3705a() {
    }

    @Override // n3.InterfaceC3706b
    public void a(C3649a tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
    }

    @Override // n3.InterfaceC3706b
    public boolean b(C3649a tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return false;
    }

    @Override // n3.InterfaceC3706b
    public void c(C3649a tag, String message, Object... args) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(args, "args");
    }
}
