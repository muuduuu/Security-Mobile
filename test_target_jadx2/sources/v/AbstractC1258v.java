package V;

import android.util.Size;
import co.hyperverge.hypersnapsdk.service.framerecorder.HVFrameRecorder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: V.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1258v {

    /* renamed from: a, reason: collision with root package name */
    public static final AbstractC1258v f10726a;

    /* renamed from: b, reason: collision with root package name */
    public static final AbstractC1258v f10727b;

    /* renamed from: c, reason: collision with root package name */
    public static final AbstractC1258v f10728c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1258v f10729d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1258v f10730e;

    /* renamed from: f, reason: collision with root package name */
    public static final AbstractC1258v f10731f;

    /* renamed from: g, reason: collision with root package name */
    static final AbstractC1258v f10732g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set f10733h;

    /* renamed from: i, reason: collision with root package name */
    private static final List f10734i;

    /* renamed from: V.v$b */
    public static abstract class b extends AbstractC1258v {
        public b() {
            super();
        }

        static b f(int i10, String str, List list) {
            return new C1247j(i10, str, list);
        }

        public abstract String c();

        public abstract List d();

        public abstract int e();
    }

    static {
        b f10 = b.f(4, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, HVFrameRecorder.VIDEO_WIDTH), new Size(HVFrameRecorder.VIDEO_HEIGHT, HVFrameRecorder.VIDEO_WIDTH))));
        f10726a = f10;
        b f11 = b.f(5, "HD", Collections.singletonList(new Size(1280, 720)));
        f10727b = f11;
        b f12 = b.f(6, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f10728c = f12;
        b f13 = b.f(8, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f10729d = f13;
        b f14 = b.f(0, "LOWEST", Collections.emptyList());
        f10730e = f14;
        b f15 = b.f(1, "HIGHEST", Collections.emptyList());
        f10731f = f15;
        f10732g = b.f(-1, "NONE", Collections.emptyList());
        f10733h = new HashSet(Arrays.asList(f14, f15, f10, f11, f12, f13));
        f10734i = Arrays.asList(f13, f12, f11, f10);
    }

    static boolean a(AbstractC1258v abstractC1258v) {
        return f10733h.contains(abstractC1258v);
    }

    public static List b() {
        return new ArrayList(f10734i);
    }

    private AbstractC1258v() {
    }
}
