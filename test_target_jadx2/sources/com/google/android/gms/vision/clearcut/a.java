package com.google.android.gms.vision.clearcut;

import com.google.android.gms.internal.vision.C2619x;

/* loaded from: classes2.dex */
final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f26500a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C2619x f26501b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ DynamiteClearcutLogger f26502c;

    a(DynamiteClearcutLogger dynamiteClearcutLogger, int i10, C2619x c2619x) {
        this.f26502c = dynamiteClearcutLogger;
        this.f26500a = i10;
        this.f26501b = c2619x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        VisionClearcutLogger visionClearcutLogger;
        visionClearcutLogger = this.f26502c.zzc;
        visionClearcutLogger.zza(this.f26500a, this.f26501b);
    }
}
