package com.reactnativepagerview;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends RecyclerView.F {

    /* renamed from: u, reason: collision with root package name */
    public static final a f29415u = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(ViewGroup parent) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            FrameLayout frameLayout = new FrameLayout(parent.getContext());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setSaveEnabled(false);
            return new k(frameLayout, null);
        }

        private a() {
        }
    }

    public /* synthetic */ k(FrameLayout frameLayout, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout);
    }

    public final FrameLayout O() {
        View view = this.f17450a;
        Intrinsics.e(view, "null cannot be cast to non-null type android.widget.FrameLayout");
        return (FrameLayout) view;
    }

    private k(FrameLayout frameLayout) {
        super(frameLayout);
    }
}
