package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class c implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final i f27828a;

    c(i iVar) {
        this.f27828a = iVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f27828a.b(integrityTokenRequest);
    }
}
