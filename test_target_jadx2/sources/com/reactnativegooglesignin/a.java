package com.reactnativegooglesignin;

import S6.r;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private String f29383a;

    /* renamed from: b, reason: collision with root package name */
    private String f29384b;

    public a(Exception e10, String str) {
        String a10;
        Intrinsics.checkNotNullParameter(e10, "e");
        String localizedMessage = e10.getLocalizedMessage();
        localizedMessage = localizedMessage == null ? e10.getMessage() : localizedMessage;
        if (!(e10 instanceof S6.b)) {
            if (!(e10 instanceof r)) {
                this.f29383a = str;
                this.f29384b = localizedMessage;
                return;
            }
            this.f29383a = str;
            this.f29384b = localizedMessage + " Make sure you have the latest version of Google Play Services installed.";
            return;
        }
        S6.b bVar = (S6.b) e10;
        int b10 = bVar.b();
        if (localizedMessage == null || localizedMessage.length() <= 10 || localizedMessage == null) {
            a10 = N6.c.a(b10);
            Intrinsics.checkNotNullExpressionValue(a10, "getStatusCodeString(...)");
        } else {
            a10 = new Regex(b10 + ": ").e(localizedMessage, BuildConfig.FLAVOR);
        }
        this.f29383a = String.valueOf((b10 == 12501 || bVar.a().y0()) ? 12501 : b10);
        this.f29384b = a10;
    }

    public final String a() {
        return this.f29383a;
    }

    public final String b() {
        return this.f29384b;
    }
}
