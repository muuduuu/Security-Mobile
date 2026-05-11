package b0;

import A.AbstractC0700h0;
import A.B;
import V.B0;
import V.r;
import android.util.Range;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.e1;
import b0.n;
import c0.p0;
import c0.q0;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import d0.AbstractC2971b;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;

/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f18466a;

    /* renamed from: b, reason: collision with root package name */
    private static final e1 f18467b;

    static {
        HashMap hashMap = new HashMap();
        f18466a = hashMap;
        f18467b = e1.UPTIME;
        HashMap hashMap2 = new HashMap();
        q0 q0Var = q0.f19266a;
        hashMap2.put(1, q0Var);
        q0 q0Var2 = q0.f19268c;
        hashMap2.put(2, q0Var2);
        q0 q0Var3 = q0.f19269d;
        hashMap2.put(4096, q0Var3);
        hashMap2.put(8192, q0Var3);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, q0Var);
        hashMap3.put(2, q0Var2);
        hashMap3.put(4096, q0Var3);
        hashMap3.put(8192, q0Var3);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, q0Var);
        hashMap4.put(4, q0Var2);
        hashMap4.put(4096, q0Var3);
        hashMap4.put(16384, q0Var3);
        hashMap4.put(2, q0Var);
        hashMap4.put(8, q0Var2);
        hashMap4.put(8192, q0Var3);
        hashMap4.put(32768, q0Var3);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES), q0Var2);
        hashMap5.put(512, q0.f19267b);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    private static String a(B b10) {
        int b11 = b10.b();
        if (b11 == 1) {
            return HVFrameRecorder.MIME;
        }
        if (b11 == 3 || b11 == 4 || b11 == 5) {
            return "video/hevc";
        }
        if (b11 == 6) {
            return "video/dolby-vision";
        }
        throw new UnsupportedOperationException("Unsupported dynamic range: " + b10 + "\nNo supported default mime type available.");
    }

    public static q0 b(String str, int i10) {
        q0 q0Var;
        Map map = (Map) f18466a.get(str);
        if (map != null && (q0Var = (q0) map.get(Integer.valueOf(i10))) != null) {
            return q0Var;
        }
        AbstractC0700h0.l("VideoConfigUtil", String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", str, Integer.valueOf(i10)));
        return q0.f19266a;
    }

    public static p0 c(n nVar, e1 e1Var, B0 b02, Size size, B b10, Range range) {
        InterfaceC1441i0.c d10 = nVar.d();
        return (p0) (d10 != null ? new m(nVar.a(), e1Var, b02, size, d10, b10, range) : new l(nVar.a(), e1Var, b02, size, b10, range)).get();
    }

    public static n d(r rVar, B b10, X.g gVar) {
        y0.f.j(b10.e(), "Dynamic range must be a fully specified dynamic range [provided dynamic range: " + b10 + "]");
        String h10 = r.h(rVar.c());
        if (gVar != null) {
            Set c10 = AbstractC2971b.c(b10);
            Set b11 = AbstractC2971b.b(b10);
            for (InterfaceC1441i0.c cVar : gVar.d()) {
                if (c10.contains(Integer.valueOf(cVar.g())) && b11.contains(Integer.valueOf(cVar.b()))) {
                    String i10 = cVar.i();
                    if (Objects.equals(h10, i10)) {
                        AbstractC0700h0.a("VideoConfigUtil", "MediaSpec video mime matches EncoderProfiles. Using EncoderProfiles to derive VIDEO settings [mime type: " + h10 + "]");
                    } else if (rVar.c() == -1) {
                        AbstractC0700h0.a("VideoConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using CamcorderProfile to derive VIDEO settings [mime type: " + h10 + ", dynamic range: " + b10 + "]");
                    }
                    h10 = i10;
                    break;
                }
            }
        }
        cVar = null;
        if (cVar == null) {
            if (rVar.c() == -1) {
                h10 = a(b10);
            }
            if (gVar == null) {
                AbstractC0700h0.a("VideoConfigUtil", "No EncoderProfiles present. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h10 + ", dynamic range: " + b10 + "]");
            } else {
                AbstractC0700h0.a("VideoConfigUtil", "No video EncoderProfile is compatible with requested output format and dynamic range. May rely on fallback defaults to derive VIDEO settings [chosen mime type: " + h10 + ", dynamic range: " + b10 + "]");
            }
        }
        n.a c11 = n.c(h10);
        if (cVar != null) {
            c11.c(cVar);
        }
        return c11.b();
    }

    public static int e(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, Range range) {
        int doubleValue = (int) (i10 * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue() * new Rational(i15, i16).doubleValue() * new Rational(i17, i18).doubleValue());
        String format = AbstractC0700h0.f("VideoConfigUtil") ? String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf(i18), Integer.valueOf(doubleValue)) : BuildConfig.FLAVOR;
        if (!B0.f10438b.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            int intValue = num.intValue();
            if (AbstractC0700h0.f("VideoConfigUtil")) {
                format = format + String.format("\nClamped to range %s -> %dbps", range, num);
            }
            doubleValue = intValue;
        }
        AbstractC0700h0.a("VideoConfigUtil", format);
        return doubleValue;
    }

    public static p0 f(InterfaceC1441i0.c cVar) {
        return p0.d().h(cVar.i()).i(cVar.j()).j(new Size(cVar.k(), cVar.h())).e(cVar.f()).b(cVar.c()).g(f18467b).a();
    }
}
