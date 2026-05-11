package x;

import A.AbstractC0700h0;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.ExtraSupportedOutputSizeQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    private final String f44603a;

    /* renamed from: b, reason: collision with root package name */
    private final ExtraSupportedOutputSizeQuirk f44604b = (ExtraSupportedOutputSizeQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExtraSupportedOutputSizeQuirk.class);

    /* renamed from: c, reason: collision with root package name */
    private final C5090e f44605c;

    public n(String str) {
        this.f44603a = str;
        this.f44605c = new C5090e(str);
    }

    private void a(List list, int i10) {
        ExtraSupportedOutputSizeQuirk extraSupportedOutputSizeQuirk = this.f44604b;
        if (extraSupportedOutputSizeQuirk == null) {
            return;
        }
        Size[] f10 = extraSupportedOutputSizeQuirk.f(i10);
        if (f10.length > 0) {
            list.addAll(Arrays.asList(f10));
        }
    }

    private void c(List list, int i10) {
        List a10 = this.f44605c.a(i10);
        if (a10.isEmpty()) {
            return;
        }
        list.removeAll(a10);
    }

    public Size[] b(Size[] sizeArr, int i10) {
        ArrayList arrayList = new ArrayList(Arrays.asList(sizeArr));
        a(arrayList, i10);
        c(arrayList, i10);
        if (arrayList.isEmpty()) {
            AbstractC0700h0.l("OutputSizesCorrector", "Sizes array becomes empty after excluding problematic output sizes.");
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
