package androidx.camera.core.impl;

import android.view.Surface;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.r0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1458r0 {

    /* renamed from: androidx.camera.core.impl.r0$a */
    public interface a {
        void a(InterfaceC1458r0 interfaceC1458r0);
    }

    Surface a();

    androidx.camera.core.n c();

    void close();

    int d();

    void e();

    int f();

    androidx.camera.core.n g();

    int getHeight();

    int getWidth();

    void h(a aVar, Executor executor);
}
