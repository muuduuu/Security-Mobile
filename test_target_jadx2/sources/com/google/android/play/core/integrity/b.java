package com.google.android.play.core.integrity;

/* loaded from: classes2.dex */
final class b extends n {

    /* renamed from: a, reason: collision with root package name */
    private String f27826a;

    /* renamed from: b, reason: collision with root package name */
    private y f27827b;

    b() {
    }

    @Override // com.google.android.play.core.integrity.n
    final n a(y yVar) {
        this.f27827b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.n
    final n b(String str) {
        this.f27826a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.n
    final o c() {
        y yVar;
        String str = this.f27826a;
        if (str != null && (yVar = this.f27827b) != null) {
            return new o(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f27826a == null) {
            sb2.append(" token");
        }
        if (this.f27827b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
