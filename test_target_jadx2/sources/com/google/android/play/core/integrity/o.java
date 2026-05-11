package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class o extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f27855a;

    /* renamed from: b, reason: collision with root package name */
    private final y f27856b;

    o(String str, y yVar) {
        this.f27855a = str;
        this.f27856b = yVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f27855a;
    }
}
