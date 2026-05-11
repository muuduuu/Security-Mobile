package h7;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: h7.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC3293i implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f33978a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f33979b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ String f33980c;

    CallableC3293i(SharedPreferences sharedPreferences, String str, String str2) {
        this.f33978a = sharedPreferences;
        this.f33979b = str;
        this.f33980c = str2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f33978a.getString(this.f33979b, this.f33980c);
    }
}
