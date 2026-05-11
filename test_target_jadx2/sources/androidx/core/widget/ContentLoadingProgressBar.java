package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* renamed from: a, reason: collision with root package name */
    long f16208a;

    /* renamed from: b, reason: collision with root package name */
    boolean f16209b;

    /* renamed from: c, reason: collision with root package name */
    boolean f16210c;

    /* renamed from: d, reason: collision with root package name */
    boolean f16211d;

    /* renamed from: e, reason: collision with root package name */
    private final Runnable f16212e;

    /* renamed from: f, reason: collision with root package name */
    private final Runnable f16213f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f16208a = -1L;
        this.f16209b = false;
        this.f16210c = false;
        this.f16211d = false;
        this.f16212e = new Runnable() { // from class: androidx.core.widget.d
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.c();
            }
        };
        this.f16213f = new Runnable() { // from class: androidx.core.widget.e
            @Override // java.lang.Runnable
            public final void run() {
                ContentLoadingProgressBar.this.d();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        this.f16209b = false;
        this.f16208a = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d() {
        this.f16210c = false;
        if (this.f16211d) {
            return;
        }
        this.f16208a = System.currentTimeMillis();
        setVisibility(0);
    }

    private void e() {
        removeCallbacks(this.f16212e);
        removeCallbacks(this.f16213f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }
}
