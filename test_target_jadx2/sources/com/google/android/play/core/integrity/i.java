package com.google.android.play.core.integrity;

import D7.AbstractC0789m;
import D7.C0787k;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.tasks.Task;
import e8.C3100f;
import e8.G;
import e8.v;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private final e8.z f27840a;

    /* renamed from: b, reason: collision with root package name */
    private final String f27841b;

    /* renamed from: c, reason: collision with root package name */
    private final p f27842c;

    /* renamed from: d, reason: collision with root package name */
    private final s f27843d;

    /* renamed from: e, reason: collision with root package name */
    final C3100f f27844e;

    i(Context context, e8.z zVar, p pVar, s sVar) {
        this.f27841b = context.getPackageName();
        this.f27840a = zVar;
        this.f27842c = pVar;
        this.f27843d = sVar;
        if (e8.j.a(context)) {
            this.f27844e = new C3100f(context, zVar, "IntegrityService", j.f27845a, new G() { // from class: c8.b
                @Override // e8.G
                public final Object a(IBinder iBinder) {
                    return v.k1(iBinder);
                }
            }, null);
        } else {
            zVar.a("Phonesky is not installed.", new Object[0]);
            this.f27844e = null;
        }
    }

    static /* bridge */ /* synthetic */ Bundle a(i iVar, byte[] bArr, Long l10, Parcelable parcelable) {
        Bundle bundle = new Bundle();
        bundle.putString("package.name", iVar.f27841b);
        bundle.putByteArray("nonce", bArr);
        bundle.putInt("playcore.integrity.version.major", 1);
        bundle.putInt("playcore.integrity.version.minor", 3);
        bundle.putInt("playcore.integrity.version.patch", 0);
        if (l10 != null) {
            bundle.putLong("cloud.prj", l10.longValue());
        }
        ArrayList arrayList = new ArrayList();
        e8.r.b(3, arrayList);
        bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(e8.r.a(arrayList)));
        return bundle;
    }

    public final Task b(IntegrityTokenRequest integrityTokenRequest) {
        if (this.f27844e == null) {
            return AbstractC0789m.f(new a(-2, null));
        }
        try {
            byte[] decode = Base64.decode(integrityTokenRequest.b(), 10);
            Long a10 = integrityTokenRequest.a();
            if (integrityTokenRequest instanceof m) {
            }
            this.f27840a.c("requestIntegrityToken(%s)", integrityTokenRequest);
            C0787k c0787k = new C0787k();
            this.f27844e.t(new f(this, c0787k, decode, a10, null, c0787k, integrityTokenRequest), c0787k);
            return c0787k.a();
        } catch (IllegalArgumentException e10) {
            return AbstractC0789m.f(new a(-13, e10));
        }
    }
}
