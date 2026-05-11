package eb;

import expo.modules.imagepicker.ImagePickerOptions;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final ImagePickerOptions f32545a;

    public g(ImagePickerOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f32545a = options;
    }

    public final ImagePickerOptions a() {
        return this.f32545a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && Intrinsics.b(this.f32545a, ((g) obj).f32545a);
    }

    public int hashCode() {
        return this.f32545a.hashCode();
    }

    public String toString() {
        return "ImageLibraryContractOptions(options=" + this.f32545a + ")";
    }
}
