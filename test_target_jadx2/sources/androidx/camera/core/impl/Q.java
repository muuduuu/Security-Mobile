package androidx.camera.core.impl;

import A.AbstractC0700h0;
import A.r;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

/* loaded from: classes.dex */
public abstract class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final A.r f14450a = new r.a().b(2).a();

    private static class a {
        static int a(Context context) {
            return context.getDeviceId();
        }
    }

    public static class b extends Exception {

        /* renamed from: a, reason: collision with root package name */
        private int f14451a;

        public b(String str, int i10, Throwable th) {
            super(str, th);
            this.f14451a = i10;
        }

        public int a() {
            return this.f14451a;
        }
    }

    public static void a(Context context, L l10, A.r rVar) {
        Integer d10;
        int i10 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT >= 34 && a.a(context) != 0) {
            LinkedHashSet a10 = l10.a();
            if (a10.isEmpty()) {
                throw new b("No cameras available", 0, null);
            }
            AbstractC0700h0.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + a10.size() + " cameras. Skipping validation.");
            return;
        }
        if (rVar != null) {
            try {
                d10 = rVar.d();
                if (d10 == null) {
                    AbstractC0700h0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                    return;
                }
            } catch (IllegalStateException e10) {
                AbstractC0700h0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                return;
            }
        } else {
            d10 = null;
        }
        AbstractC0700h0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + d10);
        PackageManager packageManager = context.getPackageManager();
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera")) {
                if (rVar != null) {
                    if (d10.intValue() == 1) {
                    }
                }
                A.r.f210d.e(l10.a());
                i10 = 1;
            }
        } catch (IllegalArgumentException e11) {
            illegalArgumentException = e11;
            AbstractC0700h0.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
        }
        try {
            if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                if (rVar != null) {
                    if (d10.intValue() == 0) {
                    }
                }
                A.r.f209c.e(l10.a());
                i10++;
            }
        } catch (IllegalArgumentException e12) {
            illegalArgumentException = e12;
            AbstractC0700h0.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
        }
        try {
            f14450a.e(l10.a());
            AbstractC0700h0.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
            i10++;
        } catch (IllegalArgumentException unused) {
        }
        if (illegalArgumentException == null) {
            return;
        }
        AbstractC0700h0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + l10.a());
        throw new b("Expected camera missing from device.", i10, illegalArgumentException);
    }
}
