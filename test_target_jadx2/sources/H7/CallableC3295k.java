package h7;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: h7.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class CallableC3295k implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ Context f33982a;

    CallableC3295k(Context context) {
        this.f33982a = context;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        return this.f33982a.getSharedPreferences("google_sdk_flags", 0);
    }
}
