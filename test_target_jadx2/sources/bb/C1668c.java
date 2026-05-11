package bb;

import android.graphics.Bitmap;
import android.util.Base64;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: bb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1668c implements com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    private final String f18918a;

    public C1668c(String str) {
        this.f18918a = str;
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
        try {
            byte[] decode = Base64.decode(this.f18918a, 0);
            C1666a c1666a = C1666a.f18911a;
            Intrinsics.d(decode);
            callback.d(c1666a.b(decode));
        } catch (Exception e10) {
            callback.c(new C1667b(this.f18918a, e10));
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
