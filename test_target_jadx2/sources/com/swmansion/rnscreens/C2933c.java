package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.ComponentCallbacksC1573o;
import kotlin.jvm.internal.Intrinsics;
import org.conscrypt.BuildConfig;

/* renamed from: com.swmansion.rnscreens.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2933c extends SearchView {

    /* renamed from: J0, reason: collision with root package name */
    private SearchView.l f29940J0;

    /* renamed from: K0, reason: collision with root package name */
    private View.OnClickListener f29941K0;

    /* renamed from: L0, reason: collision with root package name */
    private androidx.activity.n f29942L0;

    /* renamed from: M0, reason: collision with root package name */
    private final C2937g f29943M0;

    /* renamed from: com.swmansion.rnscreens.c$a */
    public static final class a extends androidx.activity.n {
        a() {
            super(true);
        }

        @Override // androidx.activity.n
        public void b() {
            C2933c.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2933c(Context context, ComponentCallbacksC1573o fragment) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        a aVar = new a();
        this.f29942L0 = aVar;
        this.f29943M0 = new C2937g(fragment, aVar);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C2933c.o0(C2933c.this, view);
            }
        });
        super.setOnCloseListener(new SearchView.l() { // from class: com.swmansion.rnscreens.b
            @Override // androidx.appcompat.widget.SearchView.l
            public final boolean a() {
                boolean p02;
                p02 = C2933c.p0(C2933c.this);
                return p02;
            }
        });
        setMaxWidth(Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o0(C2933c this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.f29941K0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this$0.f29943M0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p0(C2933c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        SearchView.l lVar = this$0.f29940J0;
        boolean a10 = lVar != null ? lVar.a() : false;
        this$0.f29943M0.c();
        return a10;
    }

    public final boolean getOverrideBackAction() {
        return this.f29943M0.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (L()) {
            return;
        }
        this.f29943M0.b();
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f29943M0.c();
    }

    public final void q0() {
        d0(BuildConfig.FLAVOR, false);
    }

    public final void r0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.l lVar) {
        this.f29940J0 = lVar;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f29941K0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z10) {
        this.f29943M0.d(z10);
    }

    public final void setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        d0(text, false);
    }
}
