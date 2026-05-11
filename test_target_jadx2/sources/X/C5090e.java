package x;

import androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5090e {

    /* renamed from: a, reason: collision with root package name */
    private final String f44595a;

    public C5090e(String str) {
        this.f44595a = str;
    }

    public List a(int i10) {
        ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(ExcludedSupportedSizesQuirk.class);
        return excludedSupportedSizesQuirk == null ? new ArrayList() : excludedSupportedSizesQuirk.f(this.f44595a, i10);
    }
}
