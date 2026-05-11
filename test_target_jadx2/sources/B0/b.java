package b0;

import A.AbstractC0700h0;
import V.AbstractC1236a;
import V.r;
import Y.AbstractC1305a;
import android.util.Range;
import android.util.Rational;
import androidx.camera.core.impl.InterfaceC1441i0;
import androidx.camera.core.impl.e1;
import b0.e;
import c0.AbstractC1690a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;
import org.conscrypt.BuildConfig;

/* loaded from: classes.dex */
public abstract class b {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int b(int i10, Integer num, Integer num2) {
        int abs = Math.abs(num.intValue() - i10) - Math.abs(num2.intValue() - i10);
        return (int) (abs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(abs));
    }

    public static AbstractC1690a c(e eVar, e1 e1Var, AbstractC1305a abstractC1305a, AbstractC1236a abstractC1236a) {
        InterfaceC1441i0.a d10 = eVar.d();
        return (AbstractC1690a) (d10 != null ? new c(eVar.a(), eVar.b(), e1Var, abstractC1236a, abstractC1305a, d10) : new d(eVar.a(), eVar.b(), e1Var, abstractC1236a, abstractC1305a)).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static e d(r rVar, X.g gVar) {
        InterfaceC1441i0.a aVar;
        String e10 = r.e(rVar.c());
        int f10 = r.f(rVar.c());
        if (gVar != null && gVar.j() != null) {
            aVar = gVar.j();
            String e11 = aVar.e();
            int f11 = aVar.f();
            if (!Objects.equals(e11, "audio/none")) {
                if (rVar.c() == -1) {
                    AbstractC0700h0.a("AudioConfigUtil", "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: " + e11 + "(profile: " + f11 + ")]");
                    e10 = e11;
                    f10 = f11;
                } else if (Objects.equals(e10, e11) && f10 == f11) {
                    AbstractC0700h0.a("AudioConfigUtil", "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: " + e11 + "(profile: " + f10 + ")]");
                    e10 = e11;
                } else {
                    AbstractC0700h0.a("AudioConfigUtil", "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: " + e11 + "(profile: " + f11 + "), chosen mime type: " + e10 + "(profile: " + f10 + ")]");
                }
                e.a aVar2 = (e.a) e.c(e10).a(f10);
                if (aVar != null) {
                    aVar2.c(aVar);
                }
                return aVar2.b();
            }
            AbstractC0700h0.a("AudioConfigUtil", "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: " + e10 + "(profile: " + f10 + ")]");
        }
        aVar = null;
        e.a aVar22 = (e.a) e.c(e10).a(f10);
        if (aVar != null) {
        }
        return aVar22.b();
    }

    public static AbstractC1305a e(e eVar, AbstractC1236a abstractC1236a) {
        InterfaceC1441i0.a d10 = eVar.d();
        return (AbstractC1305a) (d10 != null ? new f(abstractC1236a, d10) : new g(abstractC1236a)).get();
    }

    static int f(AbstractC1236a abstractC1236a) {
        int e10 = abstractC1236a.e();
        if (e10 == -1) {
            AbstractC0700h0.a("AudioConfigUtil", "Using default AUDIO source: 5");
            return 5;
        }
        AbstractC0700h0.a("AudioConfigUtil", "Using provided AUDIO source: " + e10);
        return e10;
    }

    static int g(AbstractC1236a abstractC1236a) {
        int f10 = abstractC1236a.f();
        if (f10 == -1) {
            AbstractC0700h0.a("AudioConfigUtil", "Using default AUDIO source format: 2");
            return 2;
        }
        AbstractC0700h0.a("AudioConfigUtil", "Using provided AUDIO source format: " + f10);
        return f10;
    }

    static int h(int i10, int i11, int i12, int i13, int i14, Range range) {
        int doubleValue = (int) (i10 * new Rational(i11, i12).doubleValue() * new Rational(i13, i14).doubleValue());
        String format = AbstractC0700h0.f("AudioConfigUtil") ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(doubleValue)) : BuildConfig.FLAVOR;
        if (!AbstractC1236a.f10590a.equals(range)) {
            Integer num = (Integer) range.clamp(Integer.valueOf(doubleValue));
            doubleValue = num.intValue();
            if (AbstractC0700h0.f("AudioConfigUtil")) {
                format = format + String.format("\nClamped to range %s -> %dbps", range, num);
            }
        }
        AbstractC0700h0.a("AudioConfigUtil", format);
        return doubleValue;
    }

    static int i(Range range, int i10, int i11, final int i12) {
        ArrayList arrayList = null;
        int i13 = 0;
        int i14 = i12;
        while (true) {
            if (!range.contains((Range) Integer.valueOf(i14))) {
                AbstractC0700h0.a("AudioConfigUtil", "Sample rate " + i14 + "Hz is not in target range " + range);
            } else {
                if (Y.n.o(i14, i10, i11)) {
                    return i14;
                }
                AbstractC0700h0.a("AudioConfigUtil", "Sample rate " + i14 + "Hz is not supported by audio source with channel count " + i10 + " and source format " + i11);
            }
            if (arrayList == null) {
                AbstractC0700h0.a("AudioConfigUtil", "Trying common sample rates in proximity order to target " + i12 + "Hz");
                arrayList = new ArrayList(AbstractC1305a.f11908a);
                Collections.sort(arrayList, new Comparator() { // from class: b0.a
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int b10;
                        b10 = b.b(i12, (Integer) obj, (Integer) obj2);
                        return b10;
                    }
                });
            }
            if (i13 >= arrayList.size()) {
                AbstractC0700h0.a("AudioConfigUtil", "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return 44100;
            }
            i14 = ((Integer) arrayList.get(i13)).intValue();
            i13++;
        }
    }
}
