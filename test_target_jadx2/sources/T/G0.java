package t;

import A.AbstractC0700h0;
import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.impl.InterfaceC1439h0;
import androidx.camera.core.impl.InterfaceC1441i0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class G0 implements InterfaceC1439h0 {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f41735c;

    /* renamed from: d, reason: collision with root package name */
    private final String f41736d;

    /* renamed from: e, reason: collision with root package name */
    private final int f41737e;

    /* renamed from: f, reason: collision with root package name */
    private final Map f41738f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    private final androidx.camera.core.impl.P0 f41739g;

    static class a {
        static EncoderProfiles a(String str, int i10) {
            return CamcorderProfile.getAll(str, i10);
        }
    }

    public G0(String str, androidx.camera.core.impl.P0 p02) {
        boolean z10;
        int i10;
        this.f41736d = str;
        try {
            i10 = Integer.parseInt(str);
            z10 = true;
        } catch (NumberFormatException unused) {
            AbstractC0700h0.l("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z10 = false;
            i10 = -1;
        }
        this.f41735c = z10;
        this.f41737e = i10;
        this.f41739g = p02;
    }

    private InterfaceC1441i0 c(int i10) {
        CamcorderProfile camcorderProfile;
        try {
            camcorderProfile = CamcorderProfile.get(this.f41737e, i10);
        } catch (RuntimeException e10) {
            AbstractC0700h0.m("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + i10, e10);
            camcorderProfile = null;
        }
        if (camcorderProfile != null) {
            return D.a.a(camcorderProfile);
        }
        return null;
    }

    private InterfaceC1441i0 d() {
        Iterator it = InterfaceC1439h0.f14592b.iterator();
        while (it.hasNext()) {
            InterfaceC1441i0 b10 = b(((Integer) it.next()).intValue());
            if (b10 != null) {
                return b10;
            }
        }
        return null;
    }

    private InterfaceC1441i0 e() {
        for (int size = InterfaceC1439h0.f14592b.size() - 1; size >= 0; size--) {
            InterfaceC1441i0 b10 = b(size);
            if (b10 != null) {
                return b10;
            }
        }
        return null;
    }

    private InterfaceC1441i0 f(int i10) {
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles a10 = a.a(this.f41736d, i10);
            if (a10 == null) {
                return null;
            }
            if (androidx.camera.camera2.internal.compat.quirk.b.b(InvalidVideoProfilesQuirk.class) != null) {
                AbstractC0700h0.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
            } else {
                try {
                    return D.a.b(a10);
                } catch (NullPointerException e10) {
                    AbstractC0700h0.m("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e10);
                }
            }
        }
        return c(i10);
    }

    private boolean g(InterfaceC1441i0 interfaceC1441i0) {
        CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f41739g.b(CamcorderProfileResolutionQuirk.class);
        if (camcorderProfileResolutionQuirk == null) {
            return true;
        }
        List d10 = interfaceC1441i0.d();
        if (d10.isEmpty()) {
            return true;
        }
        InterfaceC1441i0.c cVar = (InterfaceC1441i0.c) d10.get(0);
        return camcorderProfileResolutionQuirk.f().contains(new Size(cVar.k(), cVar.h()));
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public boolean a(int i10) {
        return this.f41735c && b(i10) != null;
    }

    @Override // androidx.camera.core.impl.InterfaceC1439h0
    public InterfaceC1441i0 b(int i10) {
        InterfaceC1441i0 interfaceC1441i0 = null;
        if (!this.f41735c || !CamcorderProfile.hasProfile(this.f41737e, i10)) {
            return null;
        }
        if (this.f41738f.containsKey(Integer.valueOf(i10))) {
            return (InterfaceC1441i0) this.f41738f.get(Integer.valueOf(i10));
        }
        InterfaceC1441i0 f10 = f(i10);
        if (f10 == null || g(f10)) {
            interfaceC1441i0 = f10;
        } else if (i10 == 1) {
            interfaceC1441i0 = d();
        } else if (i10 == 0) {
            interfaceC1441i0 = e();
        }
        this.f41738f.put(Integer.valueOf(i10), interfaceC1441i0);
        return interfaceC1441i0;
    }
}
