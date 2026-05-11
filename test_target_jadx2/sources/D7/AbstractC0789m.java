package D7;

import V6.AbstractC1287s;
import com.google.android.gms.tasks.Task;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: D7.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0789m {
    public static Object a(Task task) {
        AbstractC1287s.k();
        AbstractC1287s.i();
        AbstractC1287s.n(task, "Task must not be null");
        if (task.m()) {
            return l(task);
        }
        q qVar = new q(null);
        m(task, qVar);
        qVar.c();
        return l(task);
    }

    public static Object b(Task task, long j10, TimeUnit timeUnit) {
        AbstractC1287s.k();
        AbstractC1287s.i();
        AbstractC1287s.n(task, "Task must not be null");
        AbstractC1287s.n(timeUnit, "TimeUnit must not be null");
        if (task.m()) {
            return l(task);
        }
        q qVar = new q(null);
        m(task, qVar);
        if (qVar.d(j10, timeUnit)) {
            return l(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static Task c(Callable callable) {
        return d(AbstractC0788l.f1343a, callable);
    }

    public static Task d(Executor executor, Callable callable) {
        AbstractC1287s.n(executor, "Executor must not be null");
        AbstractC1287s.n(callable, "Callback must not be null");
        N n10 = new N();
        executor.execute(new O(n10, callable));
        return n10;
    }

    public static Task e() {
        N n10 = new N();
        n10.r();
        return n10;
    }

    public static Task f(Exception exc) {
        N n10 = new N();
        n10.p(exc);
        return n10;
    }

    public static Task g(Object obj) {
        N n10 = new N();
        n10.q(obj);
        return n10;
    }

    public static Task h(Collection collection) {
        if (collection == null || collection.isEmpty()) {
            return g(null);
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                throw new NullPointerException("null tasks are not accepted");
            }
        }
        N n10 = new N();
        s sVar = new s(collection.size(), n10);
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            m((Task) it2.next(), sVar);
        }
        return n10;
    }

    public static Task i(Collection collection) {
        return j(AbstractC0788l.f1343a, collection);
    }

    public static Task j(Executor executor, Collection collection) {
        return (collection == null || collection.isEmpty()) ? g(Collections.emptyList()) : h(collection).j(executor, new C0791o(collection));
    }

    public static Task k(Task... taskArr) {
        return (taskArr == null || taskArr.length == 0) ? g(Collections.emptyList()) : i(Arrays.asList(taskArr));
    }

    private static Object l(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.l()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    private static void m(Task task, r rVar) {
        Executor executor = AbstractC0788l.f1344b;
        task.g(executor, rVar);
        task.e(executor, rVar);
        task.b(executor, rVar);
    }
}
