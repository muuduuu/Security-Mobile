package com.chuckerteam.chucker.internal.ui;

import O2.e;
import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class a extends d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0363a f20557a = new C0363a(null);

    /* renamed from: b, reason: collision with root package name */
    private static boolean f20558b;

    /* renamed from: com.chuckerteam.chucker.internal.ui.a$a, reason: collision with other inner class name */
    public static final class C0363a {
        public /* synthetic */ C0363a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return a.f20558b;
        }

        private C0363a() {
        }
    }

    public final void C(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Toast.makeText(this, message, 0).show();
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e eVar = e.f7006a;
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        eVar.a(applicationContext);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onPause() {
        super.onPause();
        f20558b = false;
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    protected void onResume() {
        super.onResume();
        f20558b = true;
    }
}
