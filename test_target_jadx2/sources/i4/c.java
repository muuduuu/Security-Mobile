package i4;

import c3.AbstractC1721a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class c implements e {

    /* renamed from: a, reason: collision with root package name */
    private final List f34139a;

    public c(Set set) {
        this.f34139a = new ArrayList(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar != null) {
                this.f34139a.add(eVar);
            }
        }
    }

    private void l(String str, Throwable th) {
        AbstractC1721a.n("ForwardingRequestListener", str, th);
    }

    @Override // i4.e
    public void a(m4.b bVar, String str, boolean z10) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).a(bVar, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void b(String str, String str2) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).b(str, str2);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerStart", e10);
            }
        }
    }

    @Override // i4.e
    public void c(m4.b bVar, String str, Throwable th, boolean z10) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).c(bVar, str, th, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestFailure", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void d(String str, String str2, Map map) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).d(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithCancellation", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void e(String str, String str2, boolean z10) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).e(str, str2, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public boolean f(String str) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((e) this.f34139a.get(i10)).f(str)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void g(String str, String str2, String str3) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).g(str, str2, str3);
            } catch (Exception e10) {
                l("InternalListener exception in onIntermediateChunkStart", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void h(String str, String str2, Map map) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).h(str, str2, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithSuccess", e10);
            }
        }
    }

    @Override // com.facebook.imagepipeline.producers.h0
    public void i(String str, String str2, Throwable th, Map map) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).i(str, str2, th, map);
            } catch (Exception e10) {
                l("InternalListener exception in onProducerFinishWithFailure", e10);
            }
        }
    }

    @Override // i4.e
    public void j(m4.b bVar, Object obj, String str, boolean z10) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).j(bVar, obj, str, z10);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestStart", e10);
            }
        }
    }

    @Override // i4.e
    public void k(String str) {
        int size = this.f34139a.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                ((e) this.f34139a.get(i10)).k(str);
            } catch (Exception e10) {
                l("InternalListener exception in onRequestCancellation", e10);
            }
        }
    }

    public c(e... eVarArr) {
        this.f34139a = new ArrayList(eVarArr.length);
        for (e eVar : eVarArr) {
            if (eVar != null) {
                this.f34139a.add(eVar);
            }
        }
    }
}
