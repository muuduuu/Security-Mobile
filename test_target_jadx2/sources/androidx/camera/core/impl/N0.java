package androidx.camera.core.impl;

import A.AbstractC0700h0;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.camera.core.impl.L0;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import o.InterfaceC3735a;

/* loaded from: classes.dex */
public class N0 implements InterfaceC3735a {

    public static class a extends Service {
    }

    private static L0 b(Context context, Bundle bundle) {
        boolean z10 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] c10 = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] c11 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC0700h0.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        AbstractC0700h0.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z10);
        AbstractC0700h0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(c10));
        AbstractC0700h0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(c11));
        return new L0.b().d(z10).c(e(c10)).b(e(c11)).a();
    }

    private static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i10 = bundle.getInt(str, -1);
        if (i10 == -1) {
            AbstractC0700h0.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i10);
        } catch (Resources.NotFoundException e10) {
            AbstractC0700h0.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i10, e10);
            return new String[0];
        }
    }

    private static Class d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (K0.class.isAssignableFrom(cls)) {
                return cls;
            }
            AbstractC0700h0.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e10) {
            AbstractC0700h0.m("QuirkSettingsLoader", "Class not found: " + str, e10);
            return null;
        }
    }

    private static Set e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class d10 = d(str);
            if (d10 != null) {
                hashSet.add(d10);
            }
        }
        return hashSet;
    }

    @Override // o.InterfaceC3735a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public L0 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), HVFrameRecorder.VIDEO_HEIGHT).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            AbstractC0700h0.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC0700h0.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
