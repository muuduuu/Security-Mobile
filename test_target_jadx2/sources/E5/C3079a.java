package e5;

import android.graphics.Rect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: e5.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3079a {

    /* renamed from: a, reason: collision with root package name */
    private final i f32213a;

    public C3079a(ReadableMap readableMap) {
        i iVar = null;
        if (readableMap != null) {
            try {
                iVar = new i(readableMap);
            } catch (IllegalArgumentException unused) {
            }
        }
        this.f32213a = iVar;
    }

    public final Shader a(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        i iVar = this.f32213a;
        if (iVar != null) {
            return iVar.a(bounds);
        }
        return null;
    }
}
