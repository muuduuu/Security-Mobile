package Wa;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final Drawable f11421a;

    public a(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f11421a = drawable;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return Drawable.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(h priority, d.a callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.d(this.f11421a);
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
