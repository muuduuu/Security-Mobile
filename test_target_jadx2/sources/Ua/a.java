package Ua;

import android.graphics.Bitmap;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f10388a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10389b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10390c;

    /* renamed from: d, reason: collision with root package name */
    private final float f10391d;

    public a(String str, int i10, int i11, float f10) {
        this.f10388a = str;
        this.f10389b = i10;
        this.f10390c = i11;
        this.f10391d = f10;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(h priority, d.a callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Bitmap d10 = b.d(b.f10392a, this.f10388a, this.f10389b, this.f10390c, this.f10391d, false, 16, null);
        if (d10 == null) {
            callback.c(new c(this.f10388a));
        } else {
            callback.d(d10);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
