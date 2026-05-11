package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import e7.BinderC3090b;
import e7.InterfaceC3089a;
import g7.g;
import h7.AbstractC3286b;
import h7.AbstractC3288d;
import h7.AbstractC3290f;
import h7.AbstractC3292h;
import h7.AbstractC3294j;

/* loaded from: classes2.dex */
public class FlagProviderImpl extends g {

    /* renamed from: f, reason: collision with root package name */
    private boolean f23577f = false;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences f23578g;

    @Override // g7.f
    public boolean getBooleanFlagValue(String str, boolean z10, int i10) {
        return !this.f23577f ? z10 : AbstractC3286b.a(this.f23578g, str, Boolean.valueOf(z10)).booleanValue();
    }

    @Override // g7.f
    public int getIntFlagValue(String str, int i10, int i11) {
        return !this.f23577f ? i10 : AbstractC3288d.a(this.f23578g, str, Integer.valueOf(i10)).intValue();
    }

    @Override // g7.f
    public long getLongFlagValue(String str, long j10, int i10) {
        return !this.f23577f ? j10 : AbstractC3290f.a(this.f23578g, str, Long.valueOf(j10)).longValue();
    }

    @Override // g7.f
    public String getStringFlagValue(String str, String str2, int i10) {
        return !this.f23577f ? str2 : AbstractC3292h.a(this.f23578g, str, str2);
    }

    @Override // g7.f
    public void init(InterfaceC3089a interfaceC3089a) {
        Context context = (Context) BinderC3090b.l1(interfaceC3089a);
        if (this.f23577f) {
            return;
        }
        try {
            this.f23578g = AbstractC3294j.a(context.createPackageContext("com.google.android.gms", 0));
            this.f23577f = true;
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Exception e10) {
            String valueOf = String.valueOf(e10.getMessage());
            Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
        }
    }
}
