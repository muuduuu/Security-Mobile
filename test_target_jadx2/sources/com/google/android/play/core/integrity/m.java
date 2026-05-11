package com.google.android.play.core.integrity;

import c8.AbstractC1743c;

/* loaded from: classes2.dex */
final class m extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f27852a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f27853b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f27854c = null;

    /* synthetic */ m(String str, Long l10, Object obj, AbstractC1743c abstractC1743c) {
        this.f27852a = str;
        this.f27853b = l10;
    }

    private static boolean c() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f27853b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f27852a;
    }

    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f27852a.equals(integrityTokenRequest.b()) && ((l10 = this.f27853b) != null ? l10.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() == null)) {
                z10 = true;
                if ((obj instanceof m) || !c()) {
                    return z10;
                }
                m mVar = (m) obj;
                if (!z10) {
                    return false;
                }
                Object obj2 = mVar.f27854c;
                return true;
            }
        }
        z10 = false;
        if (obj instanceof m) {
        }
        return z10;
    }

    public final int hashCode() {
        int hashCode = this.f27852a.hashCode() ^ 1000003;
        Long l10 = this.f27853b;
        int hashCode2 = (hashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return c() ? hashCode2 * 1000003 : hashCode2;
    }

    public final String toString() {
        String str = "IntegrityTokenRequest{nonce=" + this.f27852a + ", cloudProjectNumber=" + this.f27853b;
        if (c()) {
            str = str.concat(", network=null");
        }
        return str.concat("}");
    }
}
