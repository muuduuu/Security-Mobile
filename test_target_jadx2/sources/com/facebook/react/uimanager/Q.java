package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class Q extends JSApplicationCausedNativeException {

    /* renamed from: a, reason: collision with root package name */
    private View f22179a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String msg) {
        super(msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q(String msg, View view, Throwable cause) {
        super(msg, cause);
        Intrinsics.checkNotNullParameter(msg, "msg");
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f22179a = view;
    }
}
