package com.groww.ems.EventRequestV2;

import com.google.protobuf.AbstractC2877h;
import com.google.protobuf.AbstractC2891w;
import com.google.protobuf.O;
import com.google.protobuf.W;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class EventRequestV2OuterClass$Event extends AbstractC2891w implements O {
    private static final EventRequestV2OuterClass$Event DEFAULT_INSTANCE;
    private static volatile W PARSER;
    private boolean beforeSdkReady_;
    private int bitField0_;
    private EventRequestV2OuterClass$DeviceContext deviceContext_;
    private EventRequestV2OuterClass$EventContext eventContext_;
    private long eventTs_;
    private EventRequestV2OuterClass$UserContext userContext_;
    private String eventName_ = BuildConfig.FLAVOR;
    private AbstractC2877h eventBytes_ = AbstractC2877h.f28729b;
    private String eventId_ = BuildConfig.FLAVOR;
    private String flushAppState_ = BuildConfig.FLAVOR;

    public static final class a extends AbstractC2891w.a implements O {
        /* synthetic */ a(com.groww.ems.EventRequestV2.a aVar) {
            this();
        }

        public a o(boolean z10) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setBeforeSdkReady(z10);
            return this;
        }

        public a p(EventRequestV2OuterClass$DeviceContext eventRequestV2OuterClass$DeviceContext) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setDeviceContext(eventRequestV2OuterClass$DeviceContext);
            return this;
        }

        public a q(AbstractC2877h abstractC2877h) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setEventBytes(abstractC2877h);
            return this;
        }

        public a s(EventRequestV2OuterClass$EventContext eventRequestV2OuterClass$EventContext) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setEventContext(eventRequestV2OuterClass$EventContext);
            return this;
        }

        public a v(String str) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setEventId(str);
            return this;
        }

        public a w(String str) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setEventName(str);
            return this;
        }

        public a x(long j10) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setEventTs(j10);
            return this;
        }

        public a y(String str) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setFlushAppState(str);
            return this;
        }

        public a z(EventRequestV2OuterClass$UserContext eventRequestV2OuterClass$UserContext) {
            i();
            ((EventRequestV2OuterClass$Event) this.f28816b).setUserContext(eventRequestV2OuterClass$UserContext);
            return this;
        }

        private a() {
            super(EventRequestV2OuterClass$Event.DEFAULT_INSTANCE);
        }
    }

    static {
        EventRequestV2OuterClass$Event eventRequestV2OuterClass$Event = new EventRequestV2OuterClass$Event();
        DEFAULT_INSTANCE = eventRequestV2OuterClass$Event;
        AbstractC2891w.registerDefaultInstance(EventRequestV2OuterClass$Event.class, eventRequestV2OuterClass$Event);
    }

    private EventRequestV2OuterClass$Event() {
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static EventRequestV2OuterClass$Event parseFrom(byte[] bArr) {
        return (EventRequestV2OuterClass$Event) AbstractC2891w.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeforeSdkReady(boolean z10) {
        this.bitField0_ |= 16;
        this.beforeSdkReady_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceContext(EventRequestV2OuterClass$DeviceContext eventRequestV2OuterClass$DeviceContext) {
        eventRequestV2OuterClass$DeviceContext.getClass();
        this.deviceContext_ = eventRequestV2OuterClass$DeviceContext;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventBytes(AbstractC2877h abstractC2877h) {
        abstractC2877h.getClass();
        this.eventBytes_ = abstractC2877h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventContext(EventRequestV2OuterClass$EventContext eventRequestV2OuterClass$EventContext) {
        eventRequestV2OuterClass$EventContext.getClass();
        this.eventContext_ = eventRequestV2OuterClass$EventContext;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventId(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.eventId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventName(String str) {
        str.getClass();
        this.eventName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEventTs(long j10) {
        this.eventTs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlushAppState(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.flushAppState_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserContext(EventRequestV2OuterClass$UserContext eventRequestV2OuterClass$UserContext) {
        eventRequestV2OuterClass$UserContext.getClass();
        this.userContext_ = eventRequestV2OuterClass$UserContext;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.AbstractC2891w
    protected final Object dynamicMethod(AbstractC2891w.d dVar, Object obj, Object obj2) {
        com.groww.ems.EventRequestV2.a aVar = null;
        switch (com.groww.ems.EventRequestV2.a.f28826a[dVar.ordinal()]) {
            case 1:
                return new EventRequestV2OuterClass$Event();
            case 2:
                return new a(aVar);
            case 3:
                return AbstractC2891w.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003ဉ\u0000\u0004ဉ\u0001\u0005\n\u0006ለ\u0002\u0007ለ\u0003\bဇ\u0004\tဉ\u0005", new Object[]{"bitField0_", "eventName_", "eventTs_", "userContext_", "deviceContext_", "eventBytes_", "eventId_", "flushAppState_", "beforeSdkReady_", "eventContext_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                W w10 = PARSER;
                if (w10 == null) {
                    synchronized (EventRequestV2OuterClass$Event.class) {
                        try {
                            w10 = PARSER;
                            if (w10 == null) {
                                w10 = new AbstractC2891w.b(DEFAULT_INSTANCE);
                                PARSER = w10;
                            }
                        } finally {
                        }
                    }
                }
                return w10;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
