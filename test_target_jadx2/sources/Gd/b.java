package Gd;

import co.hyperverge.hypersnapsdk.activities.HVRetakeActivity;
import co.hyperverge.hypersnapsdk.objects.HVError;
import com.appsflyer.attribution.RequestError;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class b {

    static class a extends AbstractC0073b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f2996a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean[] f2997b;

        a(Function1 function1, boolean[] zArr) {
            this.f2996a = function1;
            this.f2997b = zArr;
        }

        @Override // Gd.b.d
        public boolean c(Object obj) {
            if (((Boolean) this.f2996a.invoke(obj)).booleanValue()) {
                this.f2997b[0] = true;
            }
            return !this.f2997b[0];
        }

        @Override // Gd.b.d
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f2997b[0]);
        }
    }

    public interface c {
        Iterable a(Object obj);
    }

    public interface d {
        Object a();

        void b(Object obj);

        boolean c(Object obj);
    }

    public interface e {
        boolean a(Object obj);
    }

    public static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final Set f2998a;

        public f() {
            this(new HashSet());
        }

        private static /* synthetic */ void b(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "visited", "kotlin/reflect/jvm/internal/impl/utils/DFS$VisitedWithSet", "<init>"));
        }

        @Override // Gd.b.e
        public boolean a(Object obj) {
            return this.f2998a.add(obj);
        }

        public f(Set set) {
            if (set == null) {
                b(0);
            }
            this.f2998a = set;
        }
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 5:
            case 8:
            case 11:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case 18:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
            case 19:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[0] = "handler";
                break;
            case 4:
            case 7:
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            default:
                objArr[0] = "nodes";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
                objArr[0] = "node";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
                objArr[0] = "current";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i10) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case RequestError.EVENT_TIMEOUT /* 10 */:
            case 11:
            case 12:
            case 13:
            case HVError.INTERNAL_SERVER_ERROR /* 14 */:
            case HVError.SSL_CONNECT_ERROR /* 15 */:
            case HVError.ACTIVE_SESSION_ERROR /* 16 */:
                objArr[2] = "dfsFromNode";
                break;
            case HVError.TRANSACTION_ID_EMPTY /* 17 */:
            case 18:
            case 19:
            case HVRetakeActivity.CLOSE_ACTION /* 20 */:
            case HVRetakeActivity.RECHECK_ACTION /* 21 */:
                objArr[2] = "topologicalOrder";
                break;
            case HVError.FACE_DETECTION_ERROR /* 22 */:
            case HVError.BLURRY_FACE_DETECTION_ERROR /* 23 */:
            case HVError.TILT_FACE_DETECTED_ERROR /* 24 */:
            case HVError.LOW_STORAGE_ERROR /* 25 */:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static Object b(Collection collection, c cVar, d dVar) {
        if (collection == null) {
            a(4);
        }
        if (cVar == null) {
            a(5);
        }
        if (dVar == null) {
            a(6);
        }
        return c(collection, cVar, new f(), dVar);
    }

    public static Object c(Collection collection, c cVar, e eVar, d dVar) {
        if (collection == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        if (eVar == null) {
            a(2);
        }
        if (dVar == null) {
            a(3);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d(it.next(), cVar, eVar, dVar);
        }
        return dVar.a();
    }

    public static void d(Object obj, c cVar, e eVar, d dVar) {
        if (obj == null) {
            a(22);
        }
        if (cVar == null) {
            a(23);
        }
        if (eVar == null) {
            a(24);
        }
        if (dVar == null) {
            a(25);
        }
        if (eVar.a(obj) && dVar.c(obj)) {
            Iterator it = cVar.a(obj).iterator();
            while (it.hasNext()) {
                d(it.next(), cVar, eVar, dVar);
            }
            dVar.b(obj);
        }
    }

    public static Boolean e(Collection collection, c cVar, Function1 function1) {
        if (collection == null) {
            a(7);
        }
        if (cVar == null) {
            a(8);
        }
        if (function1 == null) {
            a(9);
        }
        return (Boolean) b(collection, cVar, new a(function1, new boolean[1]));
    }

    /* renamed from: Gd.b$b, reason: collision with other inner class name */
    public static abstract class AbstractC0073b implements d {
        @Override // Gd.b.d
        public void b(Object obj) {
        }
    }
}
