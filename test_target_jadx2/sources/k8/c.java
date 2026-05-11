package K8;

import J8.q;
import M8.e;
import android.util.Log;
import com.google.firebase.remoteconfig.internal.f;
import com.google.firebase.remoteconfig.internal.g;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private f f5467a;

    /* renamed from: b, reason: collision with root package name */
    private a f5468b;

    /* renamed from: c, reason: collision with root package name */
    private Executor f5469c;

    /* renamed from: d, reason: collision with root package name */
    private Set f5470d = Collections.newSetFromMap(new ConcurrentHashMap());

    public c(f fVar, a aVar, Executor executor) {
        this.f5467a = fVar;
        this.f5468b = aVar;
        this.f5469c = executor;
    }

    public void c(g gVar) {
        try {
            final e b10 = this.f5468b.b(gVar);
            Iterator it = this.f5470d.iterator();
            while (it.hasNext()) {
                android.support.v4.media.session.b.a(it.next());
                final M8.f fVar = null;
                this.f5469c.execute(new Runnable(fVar, b10) { // from class: K8.b

                    /* renamed from: a, reason: collision with root package name */
                    public final /* synthetic */ e f5466a;

                    {
                        this.f5466a = b10;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ((M8.f) null).a(this.f5466a);
                    }
                });
            }
        } catch (q e10) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscribers. Continuing to listen for changes.", e10);
        }
    }
}
