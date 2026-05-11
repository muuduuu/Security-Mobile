package o8;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class r extends s {

    /* renamed from: a, reason: collision with root package name */
    private final List f38025a;

    public r(List list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f38025a = list;
    }
}
