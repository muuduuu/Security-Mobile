package x;

import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;
import androidx.camera.core.impl.P0;

/* renamed from: x.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5085C {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f44590a;

    public C5085C(P0 p02) {
        this.f44590a = p02.a(UseTorchAsFlashQuirk.class);
    }

    public boolean a() {
        return this.f44590a;
    }
}
