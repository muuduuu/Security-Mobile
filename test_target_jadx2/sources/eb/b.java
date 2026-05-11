package eb;

import expo.modules.imagepicker.ImagePickerOptions;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final String f32534a;

    /* renamed from: b, reason: collision with root package name */
    private final ImagePickerOptions f32535b;

    public b(String uri, ImagePickerOptions options) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f32534a = uri;
        this.f32535b = options;
    }

    public final ImagePickerOptions a() {
        return this.f32535b;
    }

    public final String b() {
        return this.f32534a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.b(this.f32534a, bVar.f32534a) && Intrinsics.b(this.f32535b, bVar.f32535b);
    }

    public int hashCode() {
        return (this.f32534a.hashCode() * 31) + this.f32535b.hashCode();
    }

    public String toString() {
        return "CameraContractOptions(uri=" + this.f32534a + ", options=" + this.f32535b + ")";
    }
}
