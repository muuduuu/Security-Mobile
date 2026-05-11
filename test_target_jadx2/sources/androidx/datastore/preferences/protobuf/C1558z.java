package androidx.datastore.preferences.protobuf;

import java.io.IOException;

/* renamed from: androidx.datastore.preferences.protobuf.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1558z extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private P f16482a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f16483b;

    /* renamed from: androidx.datastore.preferences.protobuf.z$a */
    public static class a extends C1558z {
        public a(String str) {
            super(str);
        }
    }

    public C1558z(String str) {
        super(str);
        this.f16482a = null;
    }

    static C1558z b() {
        return new C1558z("Protocol message end-group tag did not match expected tag.");
    }

    static C1558z c() {
        return new C1558z("Protocol message contained an invalid tag (zero).");
    }

    static C1558z d() {
        return new C1558z("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static C1558z f() {
        return new C1558z("CodedInputStream encountered a malformed varint.");
    }

    static C1558z g() {
        return new C1558z("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static C1558z h() {
        return new C1558z("Failed to parse the message.");
    }

    static C1558z i() {
        return new C1558z("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    static C1558z l() {
        return new C1558z("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static C1558z m() {
        return new C1558z("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f16483b;
    }

    void j() {
        this.f16483b = true;
    }

    public C1558z k(P p10) {
        this.f16482a = p10;
        return this;
    }

    public C1558z(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f16482a = null;
    }
}
