package B5;

import com.fasterxml.jackson.core.k;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public Object f441a;

    /* renamed from: b, reason: collision with root package name */
    public Class f442b;

    /* renamed from: c, reason: collision with root package name */
    public Object f443c;

    /* renamed from: d, reason: collision with root package name */
    public String f444d;

    /* renamed from: e, reason: collision with root package name */
    public a f445e;

    /* renamed from: f, reason: collision with root package name */
    public k f446f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f447g;

    public enum a {
        WRAPPER_ARRAY,
        WRAPPER_OBJECT,
        METADATA_PROPERTY,
        PAYLOAD_PROPERTY,
        PARENT_PROPERTY;

        public boolean requiresObjectContext() {
            return this == METADATA_PROPERTY || this == PAYLOAD_PROPERTY;
        }
    }

    public b(Object obj, k kVar) {
        this(obj, kVar, null);
    }

    public b(Object obj, k kVar, Object obj2) {
        this.f441a = obj;
        this.f443c = obj2;
        this.f446f = kVar;
    }
}
