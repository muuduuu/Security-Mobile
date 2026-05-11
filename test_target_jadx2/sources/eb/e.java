package eb;

import expo.modules.imagepicker.ImagePickerOptions;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f32541a;

    /* renamed from: b, reason: collision with root package name */
    private final ImagePickerOptions f32542b;

    public e(String sourceUri, ImagePickerOptions options) {
        Intrinsics.checkNotNullParameter(sourceUri, "sourceUri");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f32541a = sourceUri;
        this.f32542b = options;
    }

    public final ImagePickerOptions a() {
        return this.f32542b;
    }

    public final String b() {
        return this.f32541a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.b(this.f32541a, eVar.f32541a) && Intrinsics.b(this.f32542b, eVar.f32542b);
    }

    public int hashCode() {
        return (this.f32541a.hashCode() * 31) + this.f32542b.hashCode();
    }

    public String toString() {
        return "CropImageContractOptions(sourceUri=" + this.f32541a + ", options=" + this.f32542b + ")";
    }
}
