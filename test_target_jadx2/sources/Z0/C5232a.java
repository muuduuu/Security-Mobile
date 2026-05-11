package z0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: z0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5232a extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    private final int f45654a;

    /* renamed from: b, reason: collision with root package name */
    private final C5228A f45655b;

    /* renamed from: c, reason: collision with root package name */
    private final int f45656c;

    public C5232a(int i10, C5228A c5228a, int i11) {
        this.f45654a = i10;
        this.f45655b = c5228a;
        this.f45656c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f45654a);
        this.f45655b.g0(this.f45656c, bundle);
    }
}
