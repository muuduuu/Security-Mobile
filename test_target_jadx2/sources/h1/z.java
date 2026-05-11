package h1;

import java.io.File;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import l1.h;

/* loaded from: classes.dex */
public final class z implements h.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f33952a;

    /* renamed from: b, reason: collision with root package name */
    private final File f33953b;

    /* renamed from: c, reason: collision with root package name */
    private final Callable f33954c;

    /* renamed from: d, reason: collision with root package name */
    private final h.c f33955d;

    public z(String str, File file, Callable callable, h.c mDelegate) {
        Intrinsics.checkNotNullParameter(mDelegate, "mDelegate");
        this.f33952a = str;
        this.f33953b = file;
        this.f33954c = callable;
        this.f33955d = mDelegate;
    }

    @Override // l1.h.c
    public l1.h a(h.b configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return new y(configuration.f37003a, this.f33952a, this.f33953b, this.f33954c, configuration.f37005c.f37001a, this.f33955d.a(configuration));
    }
}
