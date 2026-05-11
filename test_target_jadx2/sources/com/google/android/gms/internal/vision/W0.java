package com.google.android.gms.internal.vision;

import java.io.IOException;

/* loaded from: classes2.dex */
public class W0 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC2609t1 f25089a;

    public W0(String str) {
        super(str);
        this.f25089a = null;
    }

    static W0 a() {
        return new W0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static W0 b() {
        return new W0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static W0 c() {
        return new W0("Protocol message contained an invalid tag (zero).");
    }

    static Z0 d() {
        return new Z0("Protocol message tag had invalid wire type.");
    }

    static W0 e() {
        return new W0("Failed to parse the message.");
    }

    static W0 f() {
        return new W0("Protocol message had invalid UTF-8.");
    }
}
