package x;

import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.RepeatingStreamConstraintForVideoRecordingQuirk;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public class x {

    /* renamed from: b, reason: collision with root package name */
    private static final Size f44620b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    private static final Comparator f44621c = new E.e();

    /* renamed from: a, reason: collision with root package name */
    private final RepeatingStreamConstraintForVideoRecordingQuirk f44622a = (RepeatingStreamConstraintForVideoRecordingQuirk) androidx.camera.camera2.internal.compat.quirk.b.b(RepeatingStreamConstraintForVideoRecordingQuirk.class);

    public Size[] a(Size[] sizeArr) {
        if (this.f44622a == null || !RepeatingStreamConstraintForVideoRecordingQuirk.f()) {
            return sizeArr;
        }
        ArrayList arrayList = new ArrayList();
        for (Size size : sizeArr) {
            if (f44621c.compare(size, f44620b) >= 0) {
                arrayList.add(size);
            }
        }
        return (Size[]) arrayList.toArray(new Size[0]);
    }
}
