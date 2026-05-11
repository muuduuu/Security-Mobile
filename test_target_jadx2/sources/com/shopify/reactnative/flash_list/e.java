package com.shopify.reactnative.flash_list;

import android.content.Context;
import com.facebook.react.views.view.j;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e extends j implements d {

    /* renamed from: a, reason: collision with root package name */
    private int f29462a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29462a = -1;
    }

    @Override // com.shopify.reactnative.flash_list.d
    public int getIndex() {
        return this.f29462a;
    }

    public void setIndex(int i10) {
        this.f29462a = i10;
    }
}
