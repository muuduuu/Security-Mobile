package Va;

import android.util.Base64;
import com.bumptech.glide.h;
import com.bumptech.glide.load.data.d;
import i2.EnumC3313a;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final String f11090a;

    public a(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f11090a = data;
    }

    private final String c() {
        String substring = this.f11090a.substring(StringsKt.W(this.f11090a, ',', 0, false, 6, null) + 1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return ByteBuffer.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public EnumC3313a e() {
        return EnumC3313a.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.d
    public void f(h priority, d.a callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.d(ByteBuffer.wrap(Base64.decode(c(), 0)));
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
    }
}
