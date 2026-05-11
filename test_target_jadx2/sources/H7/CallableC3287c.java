package h7;

import android.content.SharedPreferences;
import java.util.concurrent.Callable;

/* renamed from: h7.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC3287c implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ SharedPreferences f33969a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ String f33970b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Boolean f33971c;

    CallableC3287c(SharedPreferences sharedPreferences, String str, Boolean bool) {
        this.f33969a = sharedPreferences;
        this.f33970b = str;
        this.f33971c = bool;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return Boolean.valueOf(this.f33969a.getBoolean(this.f33970b, this.f33971c.booleanValue()));
    }
}
