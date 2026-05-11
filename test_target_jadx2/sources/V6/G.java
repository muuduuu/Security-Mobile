package V6;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes2.dex */
final class G extends I {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f10853a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f10854b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f10855c;

    G(Intent intent, Activity activity, int i10) {
        this.f10853a = intent;
        this.f10854b = activity;
        this.f10855c = i10;
    }

    @Override // V6.I
    public final void a() {
        Intent intent = this.f10853a;
        if (intent != null) {
            this.f10854b.startActivityForResult(intent, this.f10855c);
        }
    }
}
