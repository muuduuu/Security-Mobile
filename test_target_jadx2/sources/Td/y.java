package Td;

import java.net.CookieHandler;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class y implements o {

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ me.a f10238c;

    private y(me.a aVar) {
        this.f10238c = aVar;
    }

    @Override // Td.o
    public void b(w url, List cookies) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        this.f10238c.b(url, cookies);
    }

    @Override // Td.o
    public List d(w url) {
        Intrinsics.checkNotNullParameter(url, "url");
        return this.f10238c.d(url);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public y(CookieHandler cookieHandler) {
        this(new me.a(cookieHandler));
        Intrinsics.checkNotNullParameter(cookieHandler, "cookieHandler");
    }
}
