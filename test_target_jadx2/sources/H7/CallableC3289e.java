package h7;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: h7.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC3289e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f33972a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f33973b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Integer f33974c;

    CallableC3289e(SharedPreferences sharedPreferences, String str, Integer num) {
        this.f33972a = sharedPreferences;
        this.f33973b = str;
        this.f33974c = num;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Integer.valueOf(this.f33972a.getInt(this.f33973b, this.f33974c.intValue()));
    }
}
