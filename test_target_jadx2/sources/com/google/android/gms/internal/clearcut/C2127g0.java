package com.google.android.gms.internal.clearcut;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.clearcut.g0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2127g0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private B0 f24070a;

    public C2127g0(String str) {
        super(str);
        this.f24070a = null;
    }

    static C2127g0 a() {
        return new C2127g0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static C2127g0 b() {
        return new C2127g0("Protocol message contained an invalid tag (zero).");
    }

    static C2130h0 c() {
        return new C2130h0("Protocol message tag had invalid wire type.");
    }

    static C2127g0 d() {
        return new C2127g0("Failed to parse the message.");
    }

    static C2127g0 e() {
        return new C2127g0("Protocol message had invalid UTF-8.");
    }

    public final C2127g0 f(B0 b02) {
        this.f24070a = b02;
        return this;
    }
}
