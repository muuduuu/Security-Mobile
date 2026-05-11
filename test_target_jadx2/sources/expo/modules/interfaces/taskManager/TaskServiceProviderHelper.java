package expo.modules.interfaces.taskManager;

import Ea.g;
import android.content.Context;
import android.support.v4.media.session.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nb.InterfaceC3727b;
import nc.AbstractC3728a;
import org.conscrypt.BuildConfig;
import pa.C3857c;
import xc.C5142C;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lexpo/modules/interfaces/taskManager/TaskServiceProviderHelper;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", "Lnb/b;", "getTaskServiceImpl", "(Landroid/content/Context;)Lnb/b;", "expo-modules-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TaskServiceProviderHelper {

    /* renamed from: a, reason: collision with root package name */
    public static final TaskServiceProviderHelper f32680a = new TaskServiceProviderHelper();

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Ba.a aVar = Ba.a.f548a;
            return AbstractC3728a.a(Integer.valueOf(aVar.a(C5142C.b(((g) obj2).getClass()).e())), Integer.valueOf(aVar.a(C5142C.b(((g) obj).getClass()).e())));
        }
    }

    private TaskServiceProviderHelper() {
    }

    public final InterfaceC3727b getTaskServiceImpl(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Method method = C3857c.class.getMethod("getPackageList", null);
        if (method == null) {
            return null;
        }
        Object invoke = method.invoke(null, null);
        List list = invoke instanceof List ? (List) invoke : null;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof g) {
                arrayList.add(obj);
            }
        }
        List F02 = CollectionsKt.F0(arrayList, new a());
        ArrayList arrayList2 = new ArrayList();
        Iterator it = F02.iterator();
        while (it.hasNext()) {
            it.next();
        }
        b.a(CollectionsKt.firstOrNull(arrayList2));
        return null;
    }
}
