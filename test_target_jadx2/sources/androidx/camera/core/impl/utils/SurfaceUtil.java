package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class SurfaceUtil {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f14689a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f14690b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f14691c = 0;
    }

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] nativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f14689a = nativeGetSurfaceInfo[0];
        aVar.f14690b = nativeGetSurfaceInfo[1];
        aVar.f14691c = nativeGetSurfaceInfo[2];
        return aVar;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);
}
