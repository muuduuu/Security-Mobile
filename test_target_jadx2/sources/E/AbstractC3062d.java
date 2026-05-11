package e;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.AbstractC1481c;
import androidx.lifecycle.AbstractC1592i;
import androidx.lifecycle.InterfaceC1596m;
import androidx.lifecycle.InterfaceC1599p;
import f.AbstractC3126a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;

/* renamed from: e.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3062d {

    /* renamed from: a, reason: collision with root package name */
    private Random f32085a = new Random();

    /* renamed from: b, reason: collision with root package name */
    private final Map f32086b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    final Map f32087c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    private final Map f32088d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    ArrayList f32089e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    final transient Map f32090f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    final Map f32091g = new HashMap();

    /* renamed from: h, reason: collision with root package name */
    final Bundle f32092h = new Bundle();

    /* renamed from: e.d$a */
    class a implements InterfaceC1596m {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32093a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC3060b f32094b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC3126a f32095c;

        a(String str, InterfaceC3060b interfaceC3060b, AbstractC3126a abstractC3126a) {
            this.f32093a = str;
            this.f32094b = interfaceC3060b;
            this.f32095c = abstractC3126a;
        }

        @Override // androidx.lifecycle.InterfaceC1596m
        public void d(InterfaceC1599p interfaceC1599p, AbstractC1592i.a aVar) {
            if (!AbstractC1592i.a.ON_START.equals(aVar)) {
                if (AbstractC1592i.a.ON_STOP.equals(aVar)) {
                    AbstractC3062d.this.f32090f.remove(this.f32093a);
                    return;
                } else {
                    if (AbstractC1592i.a.ON_DESTROY.equals(aVar)) {
                        AbstractC3062d.this.l(this.f32093a);
                        return;
                    }
                    return;
                }
            }
            AbstractC3062d.this.f32090f.put(this.f32093a, new C0466d(this.f32094b, this.f32095c));
            if (AbstractC3062d.this.f32091g.containsKey(this.f32093a)) {
                Object obj = AbstractC3062d.this.f32091g.get(this.f32093a);
                AbstractC3062d.this.f32091g.remove(this.f32093a);
                this.f32094b.a(obj);
            }
            C3059a c3059a = (C3059a) AbstractC3062d.this.f32092h.getParcelable(this.f32093a);
            if (c3059a != null) {
                AbstractC3062d.this.f32092h.remove(this.f32093a);
                this.f32094b.a(this.f32095c.c(c3059a.b(), c3059a.a()));
            }
        }
    }

    /* renamed from: e.d$b */
    class b extends AbstractC3061c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32097a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3126a f32098b;

        b(String str, AbstractC3126a abstractC3126a) {
            this.f32097a = str;
            this.f32098b = abstractC3126a;
        }

        @Override // e.AbstractC3061c
        public void b(Object obj, AbstractC1481c abstractC1481c) {
            Integer num = (Integer) AbstractC3062d.this.f32087c.get(this.f32097a);
            if (num != null) {
                AbstractC3062d.this.f32089e.add(this.f32097a);
                try {
                    AbstractC3062d.this.f(num.intValue(), this.f32098b, obj, abstractC1481c);
                    return;
                } catch (Exception e10) {
                    AbstractC3062d.this.f32089e.remove(this.f32097a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f32098b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // e.AbstractC3061c
        public void c() {
            AbstractC3062d.this.l(this.f32097a);
        }
    }

    /* renamed from: e.d$c */
    class c extends AbstractC3061c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f32100a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC3126a f32101b;

        c(String str, AbstractC3126a abstractC3126a) {
            this.f32100a = str;
            this.f32101b = abstractC3126a;
        }

        @Override // e.AbstractC3061c
        public void b(Object obj, AbstractC1481c abstractC1481c) {
            Integer num = (Integer) AbstractC3062d.this.f32087c.get(this.f32100a);
            if (num != null) {
                AbstractC3062d.this.f32089e.add(this.f32100a);
                try {
                    AbstractC3062d.this.f(num.intValue(), this.f32101b, obj, abstractC1481c);
                    return;
                } catch (Exception e10) {
                    AbstractC3062d.this.f32089e.remove(this.f32100a);
                    throw e10;
                }
            }
            throw new IllegalStateException("Attempting to launch an unregistered ActivityResultLauncher with contract " + this.f32101b + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().");
        }

        @Override // e.AbstractC3061c
        public void c() {
            AbstractC3062d.this.l(this.f32100a);
        }
    }

    /* renamed from: e.d$d, reason: collision with other inner class name */
    private static class C0466d {

        /* renamed from: a, reason: collision with root package name */
        final InterfaceC3060b f32103a;

        /* renamed from: b, reason: collision with root package name */
        final AbstractC3126a f32104b;

        C0466d(InterfaceC3060b interfaceC3060b, AbstractC3126a abstractC3126a) {
            this.f32103a = interfaceC3060b;
            this.f32104b = abstractC3126a;
        }
    }

    /* renamed from: e.d$e */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        final AbstractC1592i f32105a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f32106b = new ArrayList();

        e(AbstractC1592i abstractC1592i) {
            this.f32105a = abstractC1592i;
        }

        void a(InterfaceC1596m interfaceC1596m) {
            this.f32105a.a(interfaceC1596m);
            this.f32106b.add(interfaceC1596m);
        }

        void b() {
            Iterator it = this.f32106b.iterator();
            while (it.hasNext()) {
                this.f32105a.d((InterfaceC1596m) it.next());
            }
            this.f32106b.clear();
        }
    }

    private void a(int i10, String str) {
        this.f32086b.put(Integer.valueOf(i10), str);
        this.f32087c.put(str, Integer.valueOf(i10));
    }

    private void d(String str, int i10, Intent intent, C0466d c0466d) {
        if (c0466d == null || c0466d.f32103a == null || !this.f32089e.contains(str)) {
            this.f32091g.remove(str);
            this.f32092h.putParcelable(str, new C3059a(i10, intent));
        } else {
            c0466d.f32103a.a(c0466d.f32104b.c(i10, intent));
            this.f32089e.remove(str);
        }
    }

    private int e() {
        int nextInt = this.f32085a.nextInt(2147418112);
        while (true) {
            int i10 = nextInt + 65536;
            if (!this.f32086b.containsKey(Integer.valueOf(i10))) {
                return i10;
            }
            nextInt = this.f32085a.nextInt(2147418112);
        }
    }

    private void k(String str) {
        if (((Integer) this.f32087c.get(str)) != null) {
            return;
        }
        a(e(), str);
    }

    public final boolean b(int i10, int i11, Intent intent) {
        String str = (String) this.f32086b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        d(str, i11, intent, (C0466d) this.f32090f.get(str));
        return true;
    }

    public final boolean c(int i10, Object obj) {
        InterfaceC3060b interfaceC3060b;
        String str = (String) this.f32086b.get(Integer.valueOf(i10));
        if (str == null) {
            return false;
        }
        C0466d c0466d = (C0466d) this.f32090f.get(str);
        if (c0466d == null || (interfaceC3060b = c0466d.f32103a) == null) {
            this.f32092h.remove(str);
            this.f32091g.put(str, obj);
            return true;
        }
        if (!this.f32089e.remove(str)) {
            return true;
        }
        interfaceC3060b.a(obj);
        return true;
    }

    public abstract void f(int i10, AbstractC3126a abstractC3126a, Object obj, AbstractC1481c abstractC1481c);

    public final void g(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f32089e = bundle.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
        this.f32085a = (Random) bundle.getSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT");
        this.f32092h.putAll(bundle.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT"));
        for (int i10 = 0; i10 < stringArrayList.size(); i10++) {
            String str = stringArrayList.get(i10);
            if (this.f32087c.containsKey(str)) {
                Integer num = (Integer) this.f32087c.remove(str);
                if (!this.f32092h.containsKey(str)) {
                    this.f32086b.remove(num);
                }
            }
            a(integerArrayList.get(i10).intValue(), stringArrayList.get(i10));
        }
    }

    public final void h(Bundle bundle) {
        bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(this.f32087c.values()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(this.f32087c.keySet()));
        bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(this.f32089e));
        bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", (Bundle) this.f32092h.clone());
        bundle.putSerializable("KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT", this.f32085a);
    }

    public final AbstractC3061c i(String str, InterfaceC1599p interfaceC1599p, AbstractC3126a abstractC3126a, InterfaceC3060b interfaceC3060b) {
        AbstractC1592i lifecycle = interfaceC1599p.getLifecycle();
        if (lifecycle.b().isAtLeast(AbstractC1592i.b.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC1599p + " is attempting to register while current state is " + lifecycle.b() + ". LifecycleOwners must call register before they are STARTED.");
        }
        k(str);
        e eVar = (e) this.f32088d.get(str);
        if (eVar == null) {
            eVar = new e(lifecycle);
        }
        eVar.a(new a(str, interfaceC3060b, abstractC3126a));
        this.f32088d.put(str, eVar);
        return new b(str, abstractC3126a);
    }

    public final AbstractC3061c j(String str, AbstractC3126a abstractC3126a, InterfaceC3060b interfaceC3060b) {
        k(str);
        this.f32090f.put(str, new C0466d(interfaceC3060b, abstractC3126a));
        if (this.f32091g.containsKey(str)) {
            Object obj = this.f32091g.get(str);
            this.f32091g.remove(str);
            interfaceC3060b.a(obj);
        }
        C3059a c3059a = (C3059a) this.f32092h.getParcelable(str);
        if (c3059a != null) {
            this.f32092h.remove(str);
            interfaceC3060b.a(abstractC3126a.c(c3059a.b(), c3059a.a()));
        }
        return new c(str, abstractC3126a);
    }

    final void l(String str) {
        Integer num;
        if (!this.f32089e.contains(str) && (num = (Integer) this.f32087c.remove(str)) != null) {
            this.f32086b.remove(num);
        }
        this.f32090f.remove(str);
        if (this.f32091g.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f32091g.get(str));
            this.f32091g.remove(str);
        }
        if (this.f32092h.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.f32092h.getParcelable(str));
            this.f32092h.remove(str);
        }
        e eVar = (e) this.f32088d.get(str);
        if (eVar != null) {
            eVar.b();
            this.f32088d.remove(str);
        }
    }
}
