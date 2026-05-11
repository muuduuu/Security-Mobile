package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* loaded from: classes3.dex */
public class k extends IOException {

    /* renamed from: a, reason: collision with root package name */
    private p f36526a;

    public k(String str) {
        super(str);
        this.f36526a = null;
    }

    static k b() {
        return new k("Protocol message end-group tag did not match expected tag.");
    }

    static k c() {
        return new k("Protocol message contained an invalid tag (zero).");
    }

    static k d() {
        return new k("Protocol message had invalid UTF-8.");
    }

    static k e() {
        return new k("Protocol message tag had invalid wire type.");
    }

    static k f() {
        return new k("CodedInputStream encountered a malformed varint.");
    }

    static k g() {
        return new k("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static k h() {
        return new k("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static k j() {
        return new k("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static k k() {
        return new k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    public p a() {
        return this.f36526a;
    }

    public k i(p pVar) {
        this.f36526a = pVar;
        return this;
    }
}
