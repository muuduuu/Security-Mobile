package com.google.android.play.core.integrity;

import c8.AbstractC1743c;
import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes2.dex */
final class l extends IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private String f27850a;

    /* renamed from: b, reason: collision with root package name */
    private Long f27851b;

    l() {
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f27850a;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: nonce");
        }
        AbstractC1743c abstractC1743c = null;
        return new m(str, this.f27851b, abstractC1743c, abstractC1743c);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f27851b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str == null) {
            throw new NullPointerException("Null nonce");
        }
        this.f27850a = str;
        return this;
    }
}
