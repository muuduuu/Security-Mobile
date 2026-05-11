package L;

import android.util.Size;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Size f5617a = new Size(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final Size f5618b = new Size(320, 240);

    /* renamed from: c, reason: collision with root package name */
    public static final Size f5619c = new Size(HVFrameRecorder.VIDEO_HEIGHT, HVFrameRecorder.VIDEO_WIDTH);

    /* renamed from: d, reason: collision with root package name */
    public static final Size f5620d = new Size(720, HVFrameRecorder.VIDEO_WIDTH);

    /* renamed from: e, reason: collision with root package name */
    public static final Size f5621e = new Size(1280, 720);

    /* renamed from: f, reason: collision with root package name */
    public static final Size f5622f = new Size(1920, 1080);

    /* renamed from: g, reason: collision with root package name */
    public static final Size f5623g = new Size(1920, 1440);

    public static Object a(Size size, TreeMap treeMap) {
        Map.Entry ceilingEntry = treeMap.ceilingEntry(size);
        if (ceilingEntry != null) {
            return ceilingEntry.getValue();
        }
        Map.Entry floorEntry = treeMap.floorEntry(size);
        if (floorEntry != null) {
            return floorEntry.getValue();
        }
        return null;
    }

    public static int b(int i10, int i11) {
        return i10 * i11;
    }

    public static int c(Size size) {
        return b(size.getWidth(), size.getHeight());
    }

    public static boolean d(Size size, Size size2) {
        return c(size) < c(size2);
    }
}
