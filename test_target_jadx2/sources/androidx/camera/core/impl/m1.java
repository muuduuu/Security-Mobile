package androidx.camera.core.impl;

import android.content.Context;

/* loaded from: classes.dex */
public interface m1 {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f14649a = new a();

    class a implements m1 {
        a() {
        }

        @Override // androidx.camera.core.impl.m1
        public V a(b bVar, int i10) {
            return null;
        }
    }

    public enum b {
        IMAGE_CAPTURE,
        PREVIEW,
        IMAGE_ANALYSIS,
        VIDEO_CAPTURE,
        STREAM_SHARING,
        METERING_REPEATING
    }

    public interface c {
        m1 a(Context context);
    }

    V a(b bVar, int i10);
}
