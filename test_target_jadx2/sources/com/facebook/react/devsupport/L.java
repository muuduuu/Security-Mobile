package com.facebook.react.devsupport;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.EditText;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class L {

    /* renamed from: b, reason: collision with root package name */
    private static final a f21518b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f21519a;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(L this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f21519a = false;
    }

    public final boolean b(int i10, View view) {
        if (i10 == 46 && !(view instanceof EditText)) {
            if (this.f21519a) {
                this.f21519a = false;
                return true;
            }
            this.f21519a = true;
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.react.devsupport.K
                @Override // java.lang.Runnable
                public final void run() {
                    L.c(L.this);
                }
            }, 200L);
        }
        return false;
    }
}
