package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.q1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2499q1 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private P1 f24909a;

    public C2499q1(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f24909a = null;
    }

    static C2494p1 a() {
        return new C2494p1("Protocol message tag had invalid wire type.");
    }

    static C2499q1 b() {
        return new C2499q1("Protocol message contained an invalid tag (zero).");
    }

    static C2499q1 c() {
        return new C2499q1("Protocol message had invalid UTF-8.");
    }

    static C2499q1 d() {
        return new C2499q1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C2499q1 e() {
        return new C2499q1("Failed to parse the message.");
    }

    static C2499q1 g() {
        return new C2499q1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final C2499q1 f(P1 p12) {
        this.f24909a = p12;
        return this;
    }

    public C2499q1(String str) {
        super(str);
        this.f24909a = null;
    }
}
