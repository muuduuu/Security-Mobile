package h7;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: h7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC3291g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f33975a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f33976b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Long f33977c;

    CallableC3291g(SharedPreferences sharedPreferences, String str, Long l10) {
        this.f33975a = sharedPreferences;
        this.f33976b = str;
        this.f33977c = l10;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Long.valueOf(this.f33975a.getLong(this.f33976b, this.f33977c.longValue()));
    }
}
