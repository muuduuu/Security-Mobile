package io.sentry.clientreport;

import io.sentry.util.n;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: a, reason: collision with root package name */
    private final String f35069a;

    /* renamed from: b, reason: collision with root package name */
    private final String f35070b;

    c(String str, String str2) {
        this.f35069a = str;
        this.f35070b = str2;
    }

    public String a() {
        return this.f35070b;
    }

    public String b() {
        return this.f35069a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return n.a(b(), cVar.b()) && n.a(a(), cVar.a());
    }

    public int hashCode() {
        return n.b(b(), a());
    }
}
