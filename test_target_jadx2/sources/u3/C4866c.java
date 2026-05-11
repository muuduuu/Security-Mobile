package u3;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: u3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4866c {

    /* renamed from: b, reason: collision with root package name */
    private static final C4866c f43487b = new C4866c();

    /* renamed from: c, reason: collision with root package name */
    private static boolean f43488c = true;

    /* renamed from: a, reason: collision with root package name */
    private final Queue f43489a = new ArrayBlockingQueue(20);

    /* renamed from: u3.c$a */
    public enum a {
        ON_SET_HIERARCHY,
        ON_CLEAR_HIERARCHY,
        ON_SET_CONTROLLER,
        ON_CLEAR_OLD_CONTROLLER,
        ON_CLEAR_CONTROLLER,
        ON_INIT_CONTROLLER,
        ON_ATTACH_CONTROLLER,
        ON_DETACH_CONTROLLER,
        ON_RELEASE_CONTROLLER,
        ON_DATASOURCE_SUBMIT,
        ON_DATASOURCE_RESULT,
        ON_DATASOURCE_RESULT_INT,
        ON_DATASOURCE_FAILURE,
        ON_DATASOURCE_FAILURE_INT,
        ON_HOLDER_ATTACH,
        ON_HOLDER_DETACH,
        ON_DRAWABLE_SHOW,
        ON_DRAWABLE_HIDE,
        ON_ACTIVITY_START,
        ON_ACTIVITY_STOP,
        ON_RUN_CLEAR_CONTROLLER,
        ON_SCHEDULE_CLEAR_CONTROLLER,
        ON_SAME_CONTROLLER_SKIPPED,
        ON_SUBMIT_CACHE_HIT
    }

    private C4866c() {
    }

    public static C4866c a() {
        return f43488c ? new C4866c() : f43487b;
    }

    public void b(a aVar) {
        if (f43488c) {
            for (int i10 = 5; !this.f43489a.offer(aVar) && i10 > 0; i10--) {
                this.f43489a.poll();
            }
        }
    }

    public String toString() {
        return this.f43489a.toString();
    }
}
