package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class Y extends AbstractC2231f0 {

    /* renamed from: c, reason: collision with root package name */
    private final String f24414c;

    /* renamed from: d, reason: collision with root package name */
    private final int f24415d;

    /* renamed from: e, reason: collision with root package name */
    private final int f24416e;

    /* synthetic */ Y(String str, boolean z10, int i10, V v10, W w10, int i11, byte[] bArr) {
        this.f24414c = str;
        this.f24415d = i10;
        this.f24416e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2231f0
    public final String a() {
        return this.f24414c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2231f0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2231f0
    public final V c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2231f0
    public final W d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2231f0
    public final int e() {
        return this.f24415d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2231f0) {
            AbstractC2231f0 abstractC2231f0 = (AbstractC2231f0) obj;
            if (this.f24414c.equals(abstractC2231f0.a())) {
                abstractC2231f0.b();
                int i10 = this.f24415d;
                int e10 = abstractC2231f0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == e10) {
                    abstractC2231f0.c();
                    abstractC2231f0.d();
                    int i11 = this.f24416e;
                    int f10 = abstractC2231f0.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (f10 == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2231f0
    public final int f() {
        return this.f24416e;
    }

    public final int hashCode() {
        int hashCode = this.f24414c.hashCode() ^ 1000003;
        int i10 = this.f24415d;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((hashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f24416e != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f24415d;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f24416e == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f24414c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
