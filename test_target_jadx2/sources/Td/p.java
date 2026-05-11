package Td;

import java.nio.charset.Charset;
import kotlin.jvm.internal.Intrinsics;
import pe.C3880h;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f10189a = new p();

    private p() {
    }

    public static final String a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + C3880h.f38683d.c(username + ':' + password, charset).b();
    }
}
