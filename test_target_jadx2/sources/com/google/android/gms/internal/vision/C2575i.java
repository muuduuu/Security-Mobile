package com.google.android.gms.internal.vision;

import java.util.List;

/* renamed from: com.google.android.gms.internal.vision.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2575i extends AbstractC2562e {

    /* renamed from: b, reason: collision with root package name */
    private final C2572h f25164b = new C2572h();

    C2575i() {
    }

    @Override // com.google.android.gms.internal.vision.AbstractC2562e
    public final void a(Throwable th) {
        th.printStackTrace();
        List<Throwable> a10 = this.f25164b.a(th, false);
        if (a10 == null) {
            return;
        }
        synchronized (a10) {
            try {
                for (Throwable th2 : a10) {
                    System.err.print("Suppressed: ");
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
