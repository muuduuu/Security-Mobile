package com.google.android.gms.auth.api.signin.internal;

import O6.r;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.AbstractActivityC1577t;
import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.analytics.mixpanel.Keys;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;

/* loaded from: classes2.dex */
public class SignInHubActivity extends AbstractActivityC1577t {

    /* renamed from: f, reason: collision with root package name */
    private static boolean f23278f = false;

    /* renamed from: a, reason: collision with root package name */
    private boolean f23279a = false;

    /* renamed from: b, reason: collision with root package name */
    private SignInConfiguration f23280b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23281c;

    /* renamed from: d, reason: collision with root package name */
    private int f23282d;

    /* renamed from: e, reason: collision with root package name */
    private Intent f23283e;

    private final void B(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra(HVRetakeActivity.CONFIG_TAG, this.f23280b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f23279a = true;
            Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
            D(17);
        }
    }

    private final void C() {
        getSupportLoaderManager().c(0, null, new a(this, null));
        f23278f = false;
    }

    private final void D(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f23278f = false;
    }

    final /* synthetic */ Intent A() {
        return this.f23283e;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        if (this.f23279a) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra("signInAccount");
            if (signInAccount != null && signInAccount.j() != null) {
                GoogleSignInAccount j10 = signInAccount.j();
                if (j10 == null) {
                    Log.e("AuthSignInClient", "Google account is null");
                    D(12500);
                    return;
                }
                r.a(this).c(this.f23280b.j(), j10);
                intent.removeExtra("signInAccount");
                intent.putExtra("googleSignInAccount", j10);
                this.f23281c = true;
                this.f23282d = i11;
                this.f23283e = intent;
                C();
                return;
            }
            if (intent.hasExtra(Keys.ERROR_CODE)) {
                int intExtra = intent.getIntExtra(Keys.ERROR_CODE, 8);
                if (intExtra == 13) {
                    intExtra = 12501;
                }
                D(intExtra);
                return;
            }
        }
        D(8);
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            Log.e("AuthSignInClient", "Null action");
            D(12500);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            Log.e("AuthSignInClient", "Action not implemented");
            D(12500);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(intent.getAction())));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra(HVRetakeActivity.CONFIG_TAG);
        if (bundleExtra == null) {
            Log.e("AuthSignInClient", "Activity started with no configuration.");
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable(HVRetakeActivity.CONFIG_TAG);
        if (signInConfiguration == null) {
            Log.e("AuthSignInClient", "Activity started with invalid configuration.");
            setResult(0);
            finish();
            return;
        }
        this.f23280b = signInConfiguration;
        if (bundle == null) {
            if (f23278f) {
                setResult(0);
                D(12502);
                return;
            } else {
                f23278f = true;
                B(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f23281c = z10;
        if (z10) {
            this.f23282d = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 != null) {
                this.f23283e = intent2;
                C();
            } else {
                Log.e("AuthSignInClient", "Sign in result data cannot be null");
                setResult(0);
                finish();
            }
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1577t, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f23278f = false;
    }

    @Override // androidx.activity.f, androidx.core.app.h, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f23281c);
        if (this.f23281c) {
            bundle.putInt("signInResultCode", this.f23282d);
            bundle.putParcelable("signInResultData", this.f23283e);
        }
    }

    final /* synthetic */ int z() {
        return this.f23282d;
    }
}
