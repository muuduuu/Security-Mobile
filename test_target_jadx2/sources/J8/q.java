package J8;

import j8.AbstractC3516j;

/* loaded from: classes2.dex */
public class q extends AbstractC3516j {

    /* renamed from: a, reason: collision with root package name */
    private final a f4860a;

    public enum a {
        UNKNOWN(0),
        CONFIG_UPDATE_STREAM_ERROR(1),
        CONFIG_UPDATE_MESSAGE_INVALID(2),
        CONFIG_UPDATE_NOT_FETCHED(3),
        CONFIG_UPDATE_UNAVAILABLE(4);

        private final int value;

        a(int i10) {
            this.value = i10;
        }

        public int value() {
            return this.value;
        }
    }

    public q(String str) {
        super(str);
        this.f4860a = a.UNKNOWN;
    }

    public a a() {
        return this.f4860a;
    }

    public q(String str, Throwable th) {
        super(str, th);
        this.f4860a = a.UNKNOWN;
    }

    public q(String str, a aVar) {
        super(str);
        this.f4860a = aVar;
    }

    public q(String str, Throwable th, a aVar) {
        super(str, th);
        this.f4860a = aVar;
    }
}
