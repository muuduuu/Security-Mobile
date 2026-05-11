package D7;

import com.google.android.gms.tasks.Task;

/* renamed from: D7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0780d extends IllegalStateException {
    private C0780d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task task) {
        if (!task.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception exception = task.getException();
        return new C0780d("Complete with: ".concat(exception != null ? "failure" : task.isSuccessful() ? "result ".concat(String.valueOf(task.getResult())) : task.l() ? "cancellation" : "unknown issue"), exception);
    }
}
