package com.google.protobuf;

import java.io.IOException;

/* renamed from: com.google.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2894z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private N f28824a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28825b;

    /* renamed from: com.google.protobuf.z$a */
    public static class a extends C2894z {
        public a(String str) {
            super(str);
        }
    }

    public C2894z(String str) {
        super(str);
        this.f28824a = null;
    }

    static C2894z b() {
        return new C2894z("Protocol message contained an invalid tag (zero).");
    }

    static C2894z c() {
        return new C2894z("Protocol message had invalid UTF-8.");
    }

    static a d() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C2894z e() {
        return new C2894z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C2894z f() {
        return new C2894z("Failed to parse the message.");
    }

    static C2894z h() {
        return new C2894z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f28825b;
    }

    public C2894z g(N n10) {
        this.f28824a = n10;
        return this;
    }

    public C2894z(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f28824a = null;
    }
}
