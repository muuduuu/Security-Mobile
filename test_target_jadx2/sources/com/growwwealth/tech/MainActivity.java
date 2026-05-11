package com.growwwealth.tech;

import Vb.d;
import android.os.Build;
import android.os.Bundle;
import com.facebook.react.AbstractActivityC1928s;
import com.facebook.react.C1982v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import pa.C3859e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003¨\u0006\u0010"}, d2 = {"Lcom/growwwealth/tech/MainActivity;", "Lcom/facebook/react/s;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", BuildConfig.FLAVOR, "onCreate", "(Landroid/os/Bundle;)V", BuildConfig.FLAVOR, "D", "()Ljava/lang/String;", "Lcom/facebook/react/v;", "B", "()Lcom/facebook/react/v;", "b", "app_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MainActivity extends AbstractActivityC1928s {

    public static final class a extends A4.a {
        a(MainActivity mainActivity, String str, boolean z10) {
            super(mainActivity, str, z10);
        }
    }

    @Override // com.facebook.react.AbstractActivityC1928s
    protected C1982v B() {
        return new C3859e(this, true, new a(this, D(), com.facebook.react.defaults.a.a()));
    }

    protected String D() {
        return "main";
    }

    @Override // com.facebook.react.AbstractActivityC1928s, O4.b
    public void b() {
        if (Build.VERSION.SDK_INT > 30) {
            super.b();
        } else {
            if (moveTaskToBack(false)) {
                return;
            }
            super.b();
        }
    }

    @Override // com.facebook.react.AbstractActivityC1928s, androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        d.f11094a.k(this);
        super.onCreate(null);
    }
}
