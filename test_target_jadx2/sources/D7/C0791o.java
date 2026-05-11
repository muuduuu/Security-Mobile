package D7;

import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: D7.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0791o implements InterfaceC0779c {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Collection f1346a;

    C0791o(Collection collection) {
        this.f1346a = collection;
    }

    @Override // D7.InterfaceC0779c
    public final /* bridge */ /* synthetic */ Object a(Task task) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f1346a);
        return AbstractC0789m.g(arrayList);
    }
}
